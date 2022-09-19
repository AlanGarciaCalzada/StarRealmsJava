package fr.dut.info.starrealms.sets;

import static fr.dut.starrealms.cards.CardData.*;
import fr.dut.info.starrealms.Deck;

public class ColonyWars {

	public static Deck shopColonyWars() {
		Deck shopDeck = new Deck();
		shopDeck.addCard(cardLeviathan());
		shopDeck.addCard(cardMoonwurm());		
		shopDeck.addCard(cardParasite());		
		shopDeck.addCard(cardPlasmaVent());		
		shopDeck.addCard(cardFrontierStation());		
		shopDeck.addCard(cardMechCruiser());		
		shopDeck.addCard(cardStealthTower());		
		shopDeck.addCard(cardTheIncinerator());		
		shopDeck.addCard(cardTheOracle());		
		shopDeck.addCard(cardTheWrecker());		
		shopDeck.addCard(cardAgingBattleship());		
		shopDeck.addCard(cardEmperorsDreadnaught());		
		shopDeck.addCard(cardHeavyCruiser());		
		shopDeck.addCard(cardImperialPalace());		
		shopDeck.addCard(cardSupplyDepot());		
		shopDeck.addCard(cardColonySeedShip());	
		shopDeck.addCard(cardFactoryWorld());		
		shopDeck.addCard(cardFederationShipyard());		
		shopDeck.addCard(cardLoyalColony());		
		shopDeck.addCard(cardPeacekeeper());
		
		for (int i = 0; i < 2; i++) {
			shopDeck.addCard(cardBioformer());
			shopDeck.addCard(cardRavager());
			shopDeck.addCard(cardMiningMech());
			shopDeck.addCard(cardCommandCenter());
			shopDeck.addCard(cardCentralStation());
			shopDeck.addCard(cardFrontierFerry());
			shopDeck.addCard(cardFalcon());
			shopDeck.addCard(cardGunship());
			shopDeck.addCard(cardStorageSilo());
		}

		for (int i = 0; i < 3; i++) {
			shopDeck.addCard(cardCargoPod());
			shopDeck.addCard(cardPredator());
			shopDeck.addCard(cardStellarReef());
			shopDeck.addCard(cardSwarmer());
			shopDeck.addCard(cardBattleBot());
			shopDeck.addCard(cardConvoyBot());
			shopDeck.addCard(cardRepairBot());
			shopDeck.addCard(cardWarningBeacon());
			shopDeck.addCard(cardLancer());
			shopDeck.addCard(cardOrbitalPlatform());
			shopDeck.addCard(cardStarBarge());
			shopDeck.addCard(cardPatrolCutter());
			shopDeck.addCard(cardSolarSkiff());
			shopDeck.addCard(cardTradeHauler());
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
