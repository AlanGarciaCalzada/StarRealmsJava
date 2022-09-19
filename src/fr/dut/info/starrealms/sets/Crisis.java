package fr.dut.info.starrealms.sets;

import fr.dut.info.starrealms.Deck;
import static fr.dut.starrealms.cards.CardData.*;

public class Crisis {

	public static Deck shopCrisis() {
		Deck shopDeck = new Deck();
		shopDeck.addCard(cardConstructionHauler());
		shopDeck.addCard(cardImperialTrader());
		shopDeck.addCard(cardMegaMech());
		shopDeck.addCard(cardObliterator());
		shopDeck.addCard(cardBorderFort());
		shopDeck.addCard(cardCapitolWorld());
		shopDeck.addCard(cardDeathWorld());
		shopDeck.addCard(cardStarFortress());
		shopDeck.addCard(cardAdmiralRasmusson());
		shopDeck.addCard(cardBlobOverlord());
		shopDeck.addCard(cardCEOTorres());
		shopDeck.addCard(cardHighPriestLyle());
		
		for (int i = 0; i < 2; i++) {
			shopDeck.addCard(cardDefenseBot());
			shopDeck.addCard(cardFighterBase());
			shopDeck.addCard(cardTradeRaft());
			shopDeck.addCard(cardTradeWheel());
			shopDeck.addCard(cardCargoLaunch());
			shopDeck.addCard(cardCustomFrigate());
			shopDeck.addCard(cardPatrolBot());
			shopDeck.addCard(cardSpikePod());
			shopDeck.addCard(cardCunningCaptain());
			shopDeck.addCard(cardRamPilot());
			shopDeck.addCard(cardSpecialOpsDirector());
			shopDeck.addCard(cardWarElder());
		}		
			
		shopDeck.shuffle();		
		return shopDeck;		
	}

}
