package fr.dut.info.starrealms.sets;

import fr.dut.info.starrealms.Deck;
import static fr.dut.starrealms.cards.CardData.*;

public class CoreSet {
	
	public static Deck shopCoreSet() {
		Deck shopDeck = new Deck();
		
		shopDeck.addCard(cardBattleBlob());
        shopDeck.addCard(cardBattleBlob());
        shopDeck.addCard(cardFlagship());
        shopDeck.addCard(cardWarWorld());
        shopDeck.addCard(cardDreadnaught());
        shopDeck.addCard(cardMissileMech());
        shopDeck.addCard(cardStealthNeedle());
        shopDeck.addCard(cardBattleCruiser());
        shopDeck.addCard(cardFleetHQ());
        shopDeck.addCard(cardRoyalRedoubt());
        shopDeck.addCard(cardCentralOffice());
        shopDeck.addCard(cardCommandShip());
        shopDeck.addCard(cardDefenseCenter());
        shopDeck.addCard(cardPortOfCall());
        shopDeck.addCard(cardTradeEscort());
        shopDeck.addCard(cardMotherShip());
        shopDeck.addCard(cardTheHive());
        shopDeck.addCard(cardBlobCarrier());
        shopDeck.addCard(cardBlobWorld());
        
        for (int i = 0; i < 2; i++) {
            shopDeck.addCard(cardRam());
            shopDeck.addCard(cardCorvette());
            shopDeck.addCard(cardSpaceStation());
            shopDeck.addCard(cardEmbassyYacht());
            shopDeck.addCard(cardPatrolMech());
            shopDeck.addCard(cardRecyclingStation());
            shopDeck.addCard(cardBarterWorld());
            shopDeck.addCard(cardFreighter());
            shopDeck.addCard(cardBattlePod());
            shopDeck.addCard(cardBlobDestroyer());
            shopDeck.addCard(cardTradingPost());
            
        }
        
        for (int i = 0; i < 3; i++) {
            shopDeck.addCard(cardBlobWheel());
            shopDeck.addCard(cardTradePod());
            shopDeck.addCard(cardCutter());
            shopDeck.addCard(cardFederationShuttle());
            shopDeck.addCard(cardMissileBot());
            shopDeck.addCard(cardSupplyBot());
            shopDeck.addCard(cardTradeBot());
            shopDeck.addCard(cardImperialFighter());
            shopDeck.addCard(cardImperialFrigate());
            shopDeck.addCard(cardSurveyShip());
            shopDeck.addCard(cardBlobFighter());
        }
		
		for (int i = 0; i < 4; i++) {
			shopDeck.addCard(cardViper());
		}
		
		for (int i = 0; i < 10; i++) {
			shopDeck.addCard(cardExplorer());
		}
		
		for (int i = 0; i < 16; i++) {
			shopDeck.addCard(cardScout());
		}
		
		shopDeck.shuffle();		
		return shopDeck;		
	}
	
}
