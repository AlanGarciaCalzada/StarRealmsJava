package fr.dut.info.starrealms.sets;

import static fr.dut.info.starrealms.sets.CoreSet.*;
import static fr.dut.info.starrealms.sets.United.*;
import static fr.dut.info.starrealms.sets.Crisis.*;
import static fr.dut.info.starrealms.sets.ColonyWars.*;
import static fr.dut.info.starrealms.sets.Gambit.*;
import static fr.dut.starrealms.cards.CardData.cardScout;
import static fr.dut.starrealms.cards.CardData.cardViper;

import fr.dut.info.starrealms.Deck;

public class Set {
	
	public static Deck shopSet(String setName) {
		switch (setName) {
		case "CoreSet": {
			return shopCoreSet();
		}
		case "United": {
			return shopUnited();
		}
		case "Crisis": {
			return shopCrisis();
		}
		case "ColonyWars": {
			return shopColonyWars();
		}
		case "Gambit": {
			return shopGambit();
		}
		default:
			throw new IllegalArgumentException("Ce set n'existe pas : " + setName);
		}
	}
	
	public static Deck playerDeck() {
		Deck deckPlayer = new Deck();
		for (int i = 0; i < 8; i++) {
			deckPlayer.addCard(cardScout());            
		}
		
		deckPlayer.addCard(cardViper());
		deckPlayer.addCard(cardViper());
		
		deckPlayer.shuffle();
		
		return deckPlayer;
	}
}
