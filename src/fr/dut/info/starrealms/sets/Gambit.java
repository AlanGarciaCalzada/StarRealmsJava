package fr.dut.info.starrealms.sets;

import static fr.dut.starrealms.cards.CardData.*;
import fr.dut.info.starrealms.Deck;

public class Gambit {

	public static Deck shopGambit() {
		Deck shopDeck = new Deck();
		
		shopDeck.addCard(cardMercCruiser());
		shopDeck.addCard(cardMercCruiser());
		shopDeck.addCard(cardMercCruiser());
		
		shopDeck.shuffle();
		return shopDeck;		
	}

}
