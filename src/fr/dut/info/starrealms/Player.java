package fr.dut.info.starrealms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import static fr.dut.starrealms.cards.CardData.*;

public class Player implements Serializable{
	private int authority = 50;
	private final String name;
	private final Deck deck;
	private final Deck discard = new Deck();
	private final Row hand;
	private final Row playRow;
	private final Row bases;
	private int combat;
	private int trade;
	private final Shop shop;
	private final ArrayList<Card> historicPlayed = new ArrayList<>();
	
	public Player(String name, Deck deck, Shop shop) {
		this.name = name;
		this.deck = deck;
		this.hand = new Row();
		this.playRow = new Row();
		this.bases = new Row();
		this.combat = 0;
		this.trade = 0;
		this.shop = shop;
	}
	
	public int lowerAuthority(int damage) {
		authority -= Objects.requireNonNull(damage);
		return authority;
	}
	
	@Override
	public String toString() {
		return "[ Player : " + name + " | Authority : " + authority  + " | Trade : " + trade + " | Combat : " + combat + " ]";
	}
	
	public String getName() {
		return name;
	}
	
	public Deck getDeck() {
		return deck;
	}
	
	public Row getHandRow() {
		return hand;
	}
	
	public Row getPlayRow() {
		return playRow;
	}
	
	public Row getBasesRow() {
		return bases;
	}
	
	public Deck getDiscard() {
		return discard;
	}
	
	public int getCombat() {
		return combat;
	}
	
	public int getTrade() {
		return trade;
	}
	
	public int getAuthority() {
		return authority;
	}
	
	public void resetCombat() {
		combat = 0;
	}
	
	public void resetTrade() {
		trade = 0;
	}
	
	public void draw(int number) {
		int endNo = number;
		this.refreshDeck();
		if (number > deck.getSize()) {
			endNo = deck.getSize();
		}
		for (int i = 0; i < endNo; i++) {
			this.draw();
		}
	}
	
	public boolean allyCard(Card c) {
		if (!c.hasAlly()) {
			return false;
		}
		if (c.getAlly().isPossibleWithFactNo(playRow.getBaseNo(), playRow.getSpaceShipNo(), playRow.getCardNoByFaction(c.getFaction()))) {
			authority += c.getAlly().getAuthority();
			combat += c.getAlly().getCombat();
			trade += c.getAlly().getTrade();
			this.draw(c.getAlly().getDraw());
			c.activateAlly();
			return true;
		}
		return false;
	}
	
	public boolean scrapCard(Card c) {
		if (!c.hasScrap()) {
			return false;
		}
		if (c.getScrap().isPossible(playRow.getBaseNo(), playRow.getSpaceShipNo())) {
			playRow.removeCard(c);
			if (c.getName().equals("Explorer")) {
				shop.returnExplorer();
			}
			
			authority += c.getScrap().getAuthority();
			combat += c.getScrap().getCombat();
			trade += c.getScrap().getTrade();
			this.draw(c.getScrap().getDraw());
			c.activateScrap();
			return true;
		}
		
		return false;
	}
	
	public void refreshAlly() {
		for (int i = 0; i < playRow.getLength(); i++) {
			Card c = playRow.getCard(i);
			
			if (c == null || !c.hasAlly()) {
				continue;
			}
			
			if (!c.isAllyActivated() && c.getAlly().isPossibleWithFactNo(bases.getBaseNo(), playRow.getSpaceShipNo(), playRow.getCardNoByFaction(c.getFaction()) + bases.getCardNoByFaction(c.getFaction()))) {
				this.scrapCard(c);
				c.activateAlly();
			}
		}
		for (int i = 0; i < bases.getLength(); i++) {
			Card c = bases.getCard(i);
			
			if (c == null || !c.hasAlly()) {
				continue;
			}
			
			if (!c.isAllyActivated() && c.getAlly().isPossibleWithFactNo(bases.getBaseNo(), playRow.getSpaceShipNo(), playRow.getCardNoByFaction(c.getFaction()) + bases.getCardNoByFaction(c.getFaction()))) {
				this.scrapCard(c);
				c.activateAlly();
			}
		}
	}
	
	public void addCardFirstEffects(Card c) {
		authority += c.getAuthority();
		combat += c.getCombat();
		trade += c.getTrade();
	}
	
	public void addCardEffects(Card c) {
		combat += c.getCombat();
		trade += c.getTrade();
	}
	
	public void toggleCardEvent(Card c) {
		if (!c.isDrawActivated()) {
			this.draw(c.getDraw());
			c.activateDraw();
		}
	}
	
	public Card draw() {
		Card c = deck.remove(0);
		hand.addCard(c);
		return c;
	}
	
	public void attackBase(Base c) {
		if (c.getDefense() >= combat) {
			c.lowerDefense(combat);
			combat = 0;
		}
		else {
			combat -= c.getDefense();
			c.lowerDefense(c.getDefense());
		}
	}
	
	public void attackPlayer(Player p) {
		if (p.getAuthority() >= combat) {
			p.lowerAuthority(combat);
			combat = 0;
		}
		else {
			combat -= p.getAuthority();
			p.lowerAuthority(p.getAuthority());
		}
	}
	
	public boolean isDead() {
		return authority <= 0;
	}
	
	public boolean refreshDeck() {
		if (deck.isKindOfempty()) {
			
			if (discard.getSize() < 5 - deck.getSize()) {
				
				for (int i = 0; i < discard.getSize(); i++) {
					deck.addCard(discard.remove(0));
				}
			
			}
			else {
				
				for (int i = 0; i < 5 - deck.getSize(); i++) {
					deck.addCard(discard.remove(0));
				}
				
			}
			
			return true;
		}
		return false;
	}
	
	public void endTurn() {
		combat = 0;
		trade = 0;
		
		// playRow.endTurnRow(this);
		
		int size = playRow.getSize();
		
		for (int i = 0; i < size; i++) {
			Card c = playRow.nextCard();
			this.discardCard(c);
		}
		
		for (int i = 0; i < bases.getSize(); i++) {
			this.addCardEffects(bases.getCard(i));
		}
		
		historicPlayed.clear();
		
		this.refreshDeck();
		
		this.draw(5);
	}
	
	public void discardCard(Card c) {
		
		if (c.getSet().equals("United : Heroes") || c.getSet().equals("Crisis : Heroes")) {
			if (c.isBase()) {
				bases.removeCard(c);
			}
			else {
				playRow.removeCard(c);
			}
		}
		else {
			if (c.isBase()) {
				bases.removeCard(c);
			}
			else {
				playRow.removeCard(c);
			}		
			discard.addCard(c);
			c.reset();
		}
		
	}
	
	public void discardAllCard() {
		int size = playRow.getSize();
		for (int i = 0; i < size; i++) {
			discard.addCard(playRow.remove(0).reset());
		}
	}
	
	public void discardAllCardFrom(ArrayList<Card> toRemove) {
		for (Card card : toRemove) {
			discardCard(card);
		}
	}
	
	public boolean buy(Card c) {
		if(shop.canBuy(c, this)) {
			shop.remove(c);
			discard.addCard(c);
			trade -= c.getCost();
			return true;
		}
		return false;
	}
	
	public boolean buyExplorer() {
		if(shop.canBuyExplorer(this)) {
			shop.removeExplorer();
			discard.addCard(cardExplorer());
			trade -= cardExplorer().getCost();
			return true;
		}
		return false;
	}
	
	public String showHandRow() {
		return hand.toString();
	}
	
	public void playCard(Card c) {
		hand.removeCard(c);
		if (c.isBase()) {
			bases.addCard(c);
		}
		else {
			playRow.addCard(c);
		}
		
		this.addCardFirstEffects(c);
	}
	
	public void playAllCard() {
		int size = hand.getSize();
		for (int i = 0; i < size; i++) {
			Card c = hand.remove(0);
			if (c.isBase()) {
				bases.addCard(c);
			}
			else {
				playRow.addCard(c);
			}
			this.addCardFirstEffects(c);
		}
	}
	
	public boolean isProtected() {
		if (hand.getOutpost().isEmpty()) {
			return false;
		}
		return true;
	}
	
}
