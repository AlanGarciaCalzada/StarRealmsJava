package fr.dut.info.starrealms;

import java.io.Serializable;
import java.util.ArrayList;

public class Hand implements Serializable{
	private ArrayList<AbstractCard> hand;
	
	public Hand() {
		this.hand = new ArrayList<>();
	}
	
	public void addCard(AbstractCard c) {
		this.hand.add(c);
	}
	
	public void removeCard(AbstractCard c) {
		for (AbstractCard card : hand) {
			if (card.equals(c)) {
				hand.remove(card);
			}
		}
	}
	
	@Override
	public String toString() {
		return hand.toString();
	}
}
