package fr.dut.info.starrealms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Row implements Serializable{
private final ArrayList<Card> rowOfCards;
	
	public Row() {
		this.rowOfCards = new ArrayList<>();
	}
	
	public void addCard(Card c) {
		rowOfCards.add(c);
	}
	
	public Card getCard(int index) {
		return rowOfCards.get(index);
	}

	public Card remove(int i) {
		return rowOfCards.remove(i);
	}
	
	public boolean removeCard(Card c) {
		if (rowOfCards.remove(c)) {
			return true;
		}
		return false;
	}
	
	public void removeCards(ArrayList<Card> cards) {
		for (Card card : cards) {
			this.removeCard(card);
		}
	}
	
	public int getBaseNo() {
		int result = 0;
		for (Card card : rowOfCards) {
			if (card instanceof Base) {
				result++;	
			}
		}
		return result;
	}
	
	public int getSpaceShipNo() {
		int result = 0;
		for (Card card : rowOfCards) {
			if (card instanceof SpaceShip) {
				result++;	
			}
		}
		return result;
	}
	
	public int getLength() {
		return rowOfCards.size();
	}
	
	public boolean hasFaction(Faction faction) {
		for (Card card : rowOfCards) {
			if (card.getFaction().connected(faction)) {
				return true;
			}
		}
		return false;
	}
	
	public int getCardNoByFaction(Faction faction) {
		int result = 0;
		for (Card card : rowOfCards) {
			if (card.getFaction().connected(faction)) {
				result++;
			}
		}
		return result;
	}
	
	public ArrayList<Card> getOutpost(){
		ArrayList<Card> result = new ArrayList<>();
		for (Card card : rowOfCards) {
			if (card instanceof Base && ((Base) card).isOutpost()) {
				result.add(card);
			}
		}
		return result;
	}
	
	public boolean isEmpty() {
		return rowOfCards.isEmpty();
	}
	
	public Card nextCard() {
		return rowOfCards.get(0);
	}
	
	@Override
	public String toString() {
		
		if (rowOfCards.isEmpty()) {
			return "Il n'y a pas de cartes\n";
		}
		
		StringBuilder result = new StringBuilder();
		
		int i = 1;
		
		result.append("    [ Nom | Type | Trade | Combat | Cost | Authority | Faction |( Defense | Outpost )| Description ]\n");
		
		for (Card card : rowOfCards) {
			result.append(i).append(" : ").append(card.toString()).append("\n");
			i++;
		}
		
		return result.toString();
	}
	
	public int getSize() {
		return rowOfCards.size();
	}
}
