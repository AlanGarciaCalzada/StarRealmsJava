package fr.dut.info.starrealms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Deck implements Serializable{
	private final ArrayList<Card> deck;
	
	public Deck() {
		this.deck = new ArrayList<Card>();
	}
	
	public void addCard(Card c) {
		this.deck.add(c);
	}
	
	public boolean removeCard(Card c) {
		if (deck.remove(c)) {
			return true;
		}
		return false;
	}
	
	public void removeCards(ArrayList<Card> cards) {
		for (Card card : cards) {
			this.removeCard(card);
		}
	}
	
	public Card remove(int i) {
		return deck.remove(Objects.checkIndex(i, deck.size()));
	}
	
	public Card getCard(int i) {
		return deck.get(Objects.checkIndex(i, deck.size()));
	}
	
	public void removeCards(int i) {
		for (int j = 0; j < i; j++) {
			deck.remove(0);
		}
	}
	
	public int getSize() {
		return deck.size();
	}
	
	public boolean isEmpty() {
		return deck.isEmpty();
	}
	
	public boolean isKindOfempty() {
		return deck.size() < 5;
	}
	
	@Override
	public String toString() {
		return deck.toString();
	}
	
	public void addAllFrom(Deck d) {
		deck.addAll(d.deck);
	}
	
	public void removeAll() {
		deck.clear();
	}
	
	public void shuffle() {
		Collections.shuffle(deck, new Random());
	}
}
