package fr.dut.info.starrealms;

import static fr.dut.starrealms.cards.CardData.*;

import java.io.Serializable;

public class Shop implements Serializable{
	
	private int explorer = 10;
	private final Deck shopDeck;
	private final Row shopRow = new Row();
	
	public Shop(Deck shopDeck) {
		this.shopDeck = shopDeck;
	}
	
	public void returnExplorer() {
		explorer += 1;
	}
	
	public void removeExplorer() {
		explorer -= 1;
	}
	
	public void refresh() {
		shopRow.addCard(shopDeck.remove(0));
	}
	
	public boolean canBuy(Card c, Player p) {
		if (c.getCost() > p.getTrade()) {
			return false;
		}
		return true;
	}
	
	public boolean canBuyExplorer(Player p) {
		if (explorer==0 || cardExplorer().getCost() > p.getTrade()) {
			return false;
		}
		return true;
	}
	
	public void remove(Card c) {
		shopRow.removeCard(c);
		this.refresh();
	}
	
	public void shuffle() {
		shopDeck.shuffle();
	}
	
	public Card getCard(int i) {
		return shopRow.getCard(i);
	}
	
	public Row getRow() {
		return shopRow;
	}
	
	public boolean isExplorerEmpty() {
		return explorer==0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return shopRow.toString();
	}
	
}
