package fr.dut.info.starrealms.sets;

import static fr.dut.starrealms.cards.CardData.*;
import fr.dut.info.starrealms.Deck;

public class United {

	public static Deck shopUnited() {
		Deck shopDeck = new Deck();
		shopDeck.addCard(cardEmbassyBase());
		shopDeck.addCard(cardExchangePoint());		
		shopDeck.addCard(cardLookoutPost());
		shopDeck.addCard(cardUnionStronghold());
		shopDeck.addCard(cardAllianceLanding());
		shopDeck.addCard(cardCoalitionFortress());
		shopDeck.addCard(cardUnionCluster());
		shopDeck.addCard(cardUnityStation());
		shopDeck.addCard(cardCEOShaner());
		shopDeck.addCard(cardCommodoreZhang());
		shopDeck.addCard(cardConfessorMorris());
		shopDeck.addCard(cardHiveLord());
		
		for (int i = 0; i < 2; i++) {
			shopDeck.addCard(cardAllianceTransport());
			shopDeck.addCard(cardBlobBot());
			shopDeck.addCard(cardCoalitionMessenger());
			shopDeck.addCard(cardTradeStar());
			shopDeck.addCard(cardAllianceFrigate());
			shopDeck.addCard(cardAssaultPod());
			shopDeck.addCard(cardCoalitionFreighter());
			shopDeck.addCard(cardUnityFighter());	
			shopDeck.addCard(cardChairmanHaygan());
			shopDeck.addCard(cardChancellorHartman());
			shopDeck.addCard(cardCommanderKlik());
			shopDeck.addCard(cardScreecher());
		}
			
		shopDeck.shuffle();
		return shopDeck;		
	}
	
}
