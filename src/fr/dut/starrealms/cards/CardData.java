package fr.dut.starrealms.cards;

import fr.dut.info.starrealms.Ally;
import fr.dut.info.starrealms.Base;
import fr.dut.info.starrealms.Card;
import fr.dut.info.starrealms.Faction;
import fr.dut.info.starrealms.Scrap;
import fr.dut.info.starrealms.SpaceShip;
import static fr.dut.starrealms.cards.FactionData.*;

public class CardData {

	private final static Faction unaligned = unaligned();
	private final static Faction blob = factionBlob();
	private final static Faction starEmpire = factionStarEmpire();
	private final static Faction tradeFederation = factionTradeFederation();
	private final static Faction machineCult = factionMachineCult();
	private final static Faction alliance = factionAlliance();
	private final static Faction coalition = factionCoalition();
	private final static Faction unity = factionUnity();
	private final static Faction union = factionUnion();
	
	public static Card cardBattleBlob() {
		return new SpaceShip("CoreSet", "Battle Blob", blob, 0, 8, 6, 0, 0, 
                "Add 8 Combat / Ally: Draw a card / Scrap: Add 4 Combat" , new Scrap(0, 4, 0, 0, 0, 0, "||"), new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}
	
	public static Card cardBlobWheel() {
		return new Base("CoreSet", "Blob Wheel", blob, 0, 1, 5, 3, 0, 0,
                "Add 1 Combat / Scrap: Add 3 Trade", new Scrap(3, 0, 0, 0, 0, 0, "||"), null, false);
	}
	
	public static Card cardRam() {
		return new SpaceShip("CoreSet", "Ram", blob, 0, 5, 3, 0, 0, 
                "Add 5 Combat / Ally: Add 2 Combat / Scrap: Add 3 Trade" ,new Scrap(3, 0, 0, 0, 0, 0, "||"), new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardTradePot() {
		return new SpaceShip("CoreSet", "Trade Pot", blob, 3, 0, 2, 0, 0, 
                "Add 3 Trade / Ally: Add 2 Combat" ,null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardCorvette() {
		return new SpaceShip("CoreSet", "Corvette", starEmpire, 0, 1, 2, 0, 1, 
                "Add 1 Combat / Draw a card / Ally: Add 2 Combat" ,null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardDreadnaught() {
		return new SpaceShip("CoreSet", "Dreadnaught", starEmpire, 0, 7, 7, 0, 1, 
                "Add 7 Combat / Draw a Card / Scrap: Add 5 Combat" ,new Scrap(0, 5, 0, 0, 0, 0, "||"), null);
	}
	
	public static Card cardTheHive() {
	    return new Base("CoreSet", "The Hive", blob, 0, 3, 5, 5, 0, 0,
	            "Add 3 Combat Ally: Draw a card", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"), false);
	}
	
	public static Card cardTradePod() {
	    return new SpaceShip("CoreSet", "Trade Pod", blob, 3, 0, 2, 0, 0,
	            "Add 3 Trade Ally: Add 2 Combat The loading and offloading process is efficient, but disgusting.", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardSpaceStation() {
		return new Base("CoreSet", "Space Station", starEmpire, 0, 2, 4, 4, 0, 
                0, "Add 2 Combat / Ally: Add 2 Combat / Scrap: Add 4 Combat" ,new Scrap(0, 4, 0, 0, 0, 0, "||"), new Ally(0, 2, 0, 0, 0, 0, 0, "||"), true);
	}
	
	public static Card cardWarWorld() {
		return new Base("CoreSet", "War World", starEmpire, 0, 3, 4, 5, 0, 
                0, "Add 3 Combat / Ally: Add 4 Combat" ,null, new Ally(0, 4, 0, 0, 0, 0, 0, "||"), true);
	}
	
	public static Card cardCutter() {
		return new SpaceShip("CoreSet", "Cutter", tradeFederation, 2, 0, 2, 4, 0, 
                "Add 4 Authority / Add 2 Trade / Ally: Add 4 Combat" ,null, new Ally(0, 4, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardEmbassyYacht() {
		return new SpaceShip("CoreSet", "Embassy Yacht", tradeFederation, 2, 0, 3, 3, 0, 
                "Add 3 Authority / Add 2 Trade / If you have two or more bases in play, draw two cards" ,null, new Ally(0, 0, 0, 0, 2, 0, 0, "||"));
	}
	
	public static Card cardPortOfCall() {
	    return new Base("CoreSet", "Port of Call", tradeFederation, 3, 0, 6, 6, 0, 0,
	            "Add 3 Trade / Scrap: Draw a card. You may destroy target base", new Scrap(0, 0, 0, 1, 0, 0, "||"), null, true);
	}
	
	public static Card cardFederationShuttle() {
		return new SpaceShip("CoreSet", "Federation Shuttle", tradeFederation, 2, 0, 1, 0, 0, 
                "Add 2 Trade / Ally: Add 4 Authority" ,null, new Ally(0, 0, 4, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardFlagship() {
		return new SpaceShip("CoreSet", "Flagship", tradeFederation, 0, 5, 6, 0, 1, 
	            "Add 5 Combat / Draw a Card / Ally: Add 5 Authority" ,null, new Ally(0, 0, 5, 0, 0, 0, 0, "||"));
	}
		
	public static Card cardExplorer() {
		return new SpaceShip("CoreSet", "Explorer", unaligned, 2, 0, 2, 0, 0, 
	            "Add 2 Trade / Scrap: Add 2 Combat" ,new Scrap(0, 2, 0, 0, 0, 0, "||"), null);
	}
		
	public static Card cardScout() {
		return new SpaceShip("CoreSet", "Scout", unaligned, 1, 0, 0, 0, 0, 
	            "Add 1 Trade" ,null, null);
	}
		
	public static Card cardViper() {
		return new SpaceShip("CoreSet", "Viper", unaligned, 0, 1, 0, 0, 0, 
	            "Add 1 Combat" ,null, null);
	}
	
	public static Card cardBattlePod() {
	    return new SpaceShip("CoreSet", "Battle Pod", blob, 0, 4, 2, 0, 0,
	            "Add 4 Combat You may scrap a card in the trade row. Ally: Add 2 Combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardBlobCarrier() {
	    return new SpaceShip("CoreSet", "Blob Carrier", blob, 0, 7, 6, 0, 0,
	            "Add 7 Combat Ally: Acquire any ship without paying its cost and put it on top of your deck.", null, new Ally(0, 0, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardBlobDestroyer() {
	    return new SpaceShip("CoreSet", "Blob Destroyer", blob, 0, 6, 4, 0, 0,
	            "Add 6 Combat Ally: Destroy target base and/or scrap a card in the trade row.", null, new Ally(0, 0, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardBlobFighter() {
	    return new SpaceShip("CoreSet", "Blob Fighter", blob, 0, 3, 1, 0, 0,
	            "Add 3 Combat Ally: Draw a card. Either kill it before it signals the hive or run. There are other choices, but none you'll live through.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardBlobWorld() {
	    return new Base("CoreSet", "Blob World", alliance, 0, 0, 0, 8, 0, 0,
	            "Add 5 Combat OR Draw a card for each Blob card that you've played this turn.", null, null, false);
	}
	
	public static Card cardMothership() {
	    return new SpaceShip("CoreSet", "Mothership", blob, 0, 6, 7, 0, 1,
	            "Add 6 Combat Draw a card. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardBarterWorld() {
	    return new Base("CoreSet", "Barter World", tradeFederation, 2, 0, 4, 4, 2, 0,
	            "Add 2 Authority OR Add 2 Trade Scrap: Add 5 Combat", new Scrap(0, 5, 0, 0, 0, 0, "||"), null, false);
	}

	public static Card cardCentralOffice() {
	    return new Base("CoreSet", "Central Office", tradeFederation, 2, 0, 6, 7, 0, 0,
	            "Add 2 Trade You may put the next ship you acquire this turn on top of your deck. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"), false);
	}

	public static Card cardCommandShip() {
	    return new SpaceShip("CoreSet", "Command Ship", tradeFederation, 0, 5, 8, 4, 2,
	            "Add 4 Authority Add 5 Combat Draw two cards. Ally: You may destroy target base.", null, new Ally(0, 0, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardDefenseCenter() {
	    return new Base("CoreSet", "Defense Center", tradeFederation, 0, 2, 5, 5, 3, 0,
	            "Add 3 Authority OR Add 2 Combat Ally: Add 2 Combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"), true);
	}

	public static Card cardFreighter() {
	    return new SpaceShip("CoreSet", "Freighter", tradeFederation, 4, 0, 4, 0, 0,
	            "Add 4 Trade Ally: You may put the next ship you acquire this turn on top of your deck.", null, new Ally(0, 0, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardPortofCall() {
	    return new Base("CoreSet", "Port of Call", tradeFederation, 0, 3, 6, 6, 0, 0,
	            "Add 3 Trade Scrap: Draw a card. You may destroy target base.", new Scrap(0, 0, 0, 1, 0, 0, "||"), null, true);
	}

	public static Card cardTradingPost() {
	    return new Base("CoreSet", "Trading Post", tradeFederation, 1, 0, 4, 3, 1, 0,
	            "Add 1 Authority OR Add 1 Trade Scrap: Add 3 Combat", new Scrap(0, 3, 0, 0, 0, 0, "||"), null, true);
	}
	
	public static Card cardMissileBot() {
	    return new SpaceShip("CoreSet", "Missile Bot", machineCult, 0, 2, 2, 0, 0,
	            "Add 2 Combat / You may scrap a card in your hand of discard pile / Ally: Add 2 combat", new Scrap(0, 0, 0, 0, 0, 0, "||"), new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardMissileMech() {
	    return new SpaceShip("CoreSet", "Missile Mech", machineCult, 0, 6, 6, 0, 0,
	            "Add 2 Combat / You may destroy a target base / Ally Draw a card", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}
	
	public static Card cardPatrolMech() {
	    return new SpaceShip("CoreSet", "Patrol Mech", machineCult, 0, 0, 4, 0, 0,
	            "Add 3 Trade or Add 5 Combat / Ally: You may scrap a card in your hand or discard pile", new Scrap(0, 0, 0, 0, 0, 0, "||"), new Ally(0, 0, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardStealthNeedle() {
	    return new SpaceShip("CoreSet", "Stealth Needle", machineCult, 0, 0, 4, 0, 0,
	            "Copy another ship you've played this turn", null, null);
	}
	
	public static Card cardSupplyBot() {
	    return new SpaceShip("CoreSet", "Supply Bot", machineCult, 2, 0, 3, 0, 0,
	            "Add 2 trade / You may scrap a card in your hand or discard pile", new Scrap(0, 0, 0, 0, 0, 0, "||"), new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardTradeBot() {
	    return new SpaceShip("CoreSet", "Trade Bot", machineCult, 0, 0, 1, 0, 0,
	            "Add 1 trade / You may scrap a card in your hand or discard pile / Ally: Add 2 combat", new Scrap(0, 0, 0, 0, 0, 0, "||"), new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardBattleCruiser() {
	    return new SpaceShip("CoreSet", "Battlecruiser", starEmpire, 0, 5, 6, 0, 1,
	            "Add 5 Combat / Draw a card / Ally: Target opponent discards a card / Srap: Draw a card / You may destroy target base", new Scrap(0, 0, 0, 1, 0, 0, "||"), new Ally(0, 0, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardFleetHQ() {
	    return new Base("CoreSet", "Fleet HQ", starEmpire, 0, 0, 8, 8, 0, 0,
	            "All of your ship get 'Add 1 combat'", null, null, false);
	}
	
	public static Card cardImperialFighter() {
	    return new SpaceShip("CoreSet", "Imperial Fighter", starEmpire, 0, 2, 1, 0, 0,
	            "Add 2 Combat / Target opponent discards a card / Ally: Add 2 Combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardImperialFrigate() {
	    return new SpaceShip("CoreSet", "Imperial Frigate", starEmpire, 0, 4, 3, 0, 0,
	            "Add 4 Combat / Target opponent discards a card / Ally: Add 2 Combat / Scrap: Draw a card", new Scrap(0, 0, 0, 1, 0, 0, "||"), new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}
	
	public static Card cardRecyclingStation() {
        return new Base("CoreSet", "Recycling Station", starEmpire, 0, 0, 4, 4, 0, 0,
            "Add 1 trade OR Discard up to two cards, then draw that many cards", null, null, true);
	}
	
	public static Card cardRoyalRedoubt() {
	    return new Base("CoreSet", "Royal Redoubt", starEmpire, 0, 3, 6, 6, 0, 0,
	            "Add 3 Combat / Ally: Target opponent discards a card", null, new Ally(0, 0, 0, 0, 0, 0, 0, "||"), true);
	}
	
	public static Card cardSurveyShip() {
	    return new SpaceShip("CoreSet", "Survey Ship", starEmpire, 1, 0, 3, 0, 1,
	            "Add 1 Trade / Draw a Card / Scrap: Target opponent discards a card", new Scrap(0, 0, 0, 0, 0, 0, "||"), null);
	}
	

	public static Card cardMotherShip() {
	    return new SpaceShip("CoreSet", "Mothership", blob, 0, 6, 7, 0, 1,
	            "Add 6 Combat Draw a card. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardTradeEscort() {
	    return new SpaceShip("CoreSet", "Trade Escort", tradeFederation, 0, 4, 5, 4, 0,
	            "Add 4 Authority Add 4 Combat Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardAllianceTransport() {
	    return new SpaceShip("United : Assault", "Alliance Transport", alliance, 2, 0, 2, 0, 0,
	            "Gain 2 Trade. Star Empire Ally: Target opponent discards a card. Trade Federation Ally: Gain 4 Authority.", null, new Ally(0, 0, 4, 0, 0, 0, 0, "||"));
	}

	public static Card cardBlobBot() {
	    return new SpaceShip("United : Assault", "Blob Bot", unity, 0, 5, 3, 0, 0,
	            "Gain 5 Combat. Blob Ally: Gain 2 Trade. Machine Cult Ally: Scrap a card in your hand or discard pile.", null, new Ally(2, 0, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardCoalitionMessenger() {
	    return new SpaceShip("United : Assault", "Coalition Messenger", coalition, 2, 0, 3, 0, 0,
	            "Gain 2 Trade. Machine Cult or Trade Federation Ally: Choose a card of cost five or less in your discard pile and put it on top of your deck. High tech and high finance are potent allies.", null, null);
	}

	public static Card cardEmbassyBase() {
	    return new Base("United : Assault", "Embassy Base ", alliance, 0, 0, 6, 8, 0, 2,
	            "Draw two cards, then discard a card. Keep your friends close, and your enemies closer.", null, null, false);
	}

	public static Card cardExchangePoint() {
	    return new Base("United : Assault", "Exchange Point", unity, 0, 2, 7, 6, 0, 0,
	            "Gain 2 Combat. Blob or Machine Cult Ally: Scrap a card in your hand, your discard pile or the trade row.", null, null, false);
	}

	public static Card cardLookoutPost() {
	    return new Base("United : Assault", "Lookout Post", coalition, 0, 0, 0, 7, 0, 1,
	            "Draw a card. Information is power.", null, null, false);
	}

	public static Card cardTradeStar() {
	    return new SpaceShip("United : Assault", "Trade Star", union, 2, 0, 1, 0, 0,
	            "Gain 2 Trade. Scrap: Gain 2 Combat. Greed is the universal language.", new Scrap(0, 2, 0, 0, 0, 0, "||"), null);
	}

	public static Card cardUnionStronghold() {
	    return new Base("United : Assault", "Union Stronghold", union, 0, 3, 5, 5, 0, 0,
	            "Gain 3 Combat. Blob Ally: Scrap a card in the trade row. Star Empire Ally: Target opponent discards a card.", null, null, false);
	}


	public static Card cardAllianceFrigate() {
	    return new SpaceShip("United : Command", "Alliance Frigate", alliance, 0, 4, 3, 0, 0,
	            "Gain 4 Combat. Star Empire Ally: Gain 3 Combat. Trade Federation Ally: Gain 5 Authority.", null, new Ally(0, 3, 5, 0, 0, 0, 0, "||"));
	}

	public static Card cardAllianceLanding() {
	    return new SpaceShip("United : Command", "Alliance Landing", alliance, 2, 0, 5, 0, 0,
	            "Gain 2 Trade. Star Empire or Trade Federation Ally: Gain 2 Combat.", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardAssaultPod() {
	    return new SpaceShip("United : Command", "Assault Pod", union, 0, 3, 2, 0, 0,
	            "Gain 3 Combat. Blob or Star Empire Ally: Draw a card. Your greatest enemy can be your most powerful ally.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardCoalitionFortress() {
	    return new Base("United : Command", "Coalition Fortress", coalition, 2, 0, 6, 6, 0, 0,
	            "Gain 2 Trade. Machine Cult or Trade Federation Ally: Gain 2 Combat. or Gain 3 Authority.", null, new Ally(0, 2, 3, 0, 0, 0, 0, "||"), true);
	}

	public static Card cardCoalitionFreighter() {
	    return new SpaceShip("United : Command", "Coalition Freighter", coalition, 3, 0, 4, 0, 0,
	            "Gain 3 Trade. Trade Federation Ally: Put the next ship you acquire this turn on top of your deck. Machine Cult Ally: Scrap a card in your hand or discard pile.", null, null);
	}

	public static Card cardUnionCluster() {
	    return new Base("United : Command", "Union Cluster", union, 0, 4, 8, 8, 0, 0,
	            "Gain 4 Combat. Blob or Star Empire Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"), false);
	}

	public static Card cardUnityFighter() {
	    return new SpaceShip("United : Command", "Unity Fighter", unity, 0, 3, 1, 0, 0,
	            "Gain 3 Combat. You may scrap a card in the trade row. Scrap: You may scrap a card in your hand or discard pile.", null, null);
	}

	public static Card cardUnityStation() {
	    return new Base("United : Command", "Unity Station", unity, 0, 0, 6, 7, 0, 0,
	            "", null, new Ally(0, 4, 0, 0, 0, 0, 0, "||"), true);
	}


	public static Card cardConstructionHauler() {
	    return new SpaceShip("Crisis : Bases & Battleships", "Construction Hauler", tradeFederation, 2, 0, 6, 3, 1,
	            "Add 3 Authority Add 2 Trade Draw a card. Ally: You may put the next base you acquire this turn directly into play.", null, null);
	}

	public static Card cardDefenseBot() {
	    return new SpaceShip("Crisis : Bases & Battleships", "Defense Bot", machineCult, 0, 1, 2, 0, 0,
	            "Add 1 Combat You may scrap a card in your hand or discard pile. If you control two or more bases, gain 8 Combat", null, null);
	}

	public static Card cardFighterBase() {
	        return new Base("Crisis : Bases & Battleships", "Fighter Base", starEmpire, 0, 0, 5, 3, 0, 0,
	            "Ally: Target opponent discards a card.", null, null, true);
	}

	public static Card cardImperialTrader() {
	    return new SpaceShip("Crisis : Bases & Battleships", "Imperial Trader", starEmpire, 3, 0, 5, 0, 1,
	            "Add 3 Trade Draw a card. Ally: Add 4 Combat", null, new Ally(0, 4, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardMegaMech() {
	    return new SpaceShip("Crisis : Bases & Battleships", "Mega Mech", machineCult, 0, 6, 5, 0, 0,
	            "Add 6 Combat You may return target base from play to its owner's hand Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardObliterator() {
	    return new SpaceShip("Crisis : Bases & Battleships", "Obliterator", blob, 0, 7, 6, 0, 0,
	            "Add 7 Combat If your opponent has two or more bases in play, gain 6 Combat Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardTradeRaft() {
	    return new SpaceShip("Crisis : Bases & Battleships", "Trade Raft", tradeFederation, 1, 0, 1, 0, 0,
	            "Add 1 Trade Ally: Draw a card. Scrap: Add 1 Trade", new Scrap(1, 0, 0, 0, 0, 0, "||"), new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardTradeWheel() {
	    return new Base("Crisis : Bases & Battleships", "Trade Wheel", blob, 1, 0, 5, 3, 0, 0,
	            "Add 1 Trade Ally: Add 2 Combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"), false);
	}


	public static Card cardBorderFort() {
	        return new Base("Crisis : Fleets and Fortress", "Border Fort", machineCult, 1, 2, 5, 4, 0, 0,
	            "Add 1 Trade OR Add 2 Combat Ally: Scrap a card in your hand or discard pile.", null, null, true);
	}

	public static Card cardCapitolWorld() {
	        return new Base("Crisis : Fleets and Fortress", "Capitol World", tradeFederation, 0, 0, 6, 8, 6, 1,
	            "Add 6 Authority Draw a card.", null, null, true);
	}

	public static Card cardCargoLaunch() {
	    return new SpaceShip("Crisis : Fleets and Fortress", "Cargo Launch", starEmpire, 0, 0, 1, 0, 1,
	            "Draw a card. Scrap: Add 1 Trade", new Scrap(1, 0, 0, 0, 0, 0, "||"), null);
	}

	public static Card cardCustomFrigate() {
	    return new SpaceShip("Crisis : Fleets and Fortress", "Custom Frigate", tradeFederation, 0, 0, 4, 0, 0,
	            "You may acquire a ship of cost four or less and put it on top of your deck. Ally: Add 4 Combat Scrap: Draw a card.", new Scrap(0, 0, 0, 1, 0, 0, "||"), new Ally(0, 4, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardDeathWorld() {
	    return new Base("Crisis : Fleets and Fortress", "Death World", blob, 0, 4, 6, 7, 0, 0,
	            "Add 4 Combat You may scrap a Trade Federation, Machine Cult or Star Empire card from your hand or discard pile. If you do, draw a card.", null, null, false);
	}

	public static Card cardPatrolBot() {
	    return new SpaceShip("Crisis : Fleets and Fortress", "Patrol Bot", machineCult, 2, 4, 2, 0, 0,
	            "Add 2 Trade OR Add 4 Combat Ally: You may scrap a card in your hand or discard pile.", null, null);
	}

	public static Card cardSpikePod() {
	    return new SpaceShip("Crisis : Fleets and Fortress", "Spike Pod", blob, 0, 3, 1, 0, 0,
	            "Add 3 Combat You may scrap up to two cards currently in the Trade Row. Scrap: Add 2 Combat", new Scrap(0, 2, 0, 0, 0, 0, "||"), null);
	}

	public static Card cardStarFortress() {
	    return new Base("Crisis : Fleets and Fortress", "Star Fortress", starEmpire, 0, 3, 6, 7, 0, 1,
	            "Add 3 Combat Draw a card, then discard a card. Ally: Draw a card, then discard a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"), true);
	}


	public static Card cardBioformer() {
	    return new Base("Colony Wars", "Bioformer", blob, 0, 3, 0, 4, 0, 0,
	            "Add 3 Combat Scrap: Add 3 Trade", new Scrap(3, 0, 0, 0, 0, 0, "||"), null, false);
	}

	public static Card cardCargoPod() {
	    return new SpaceShip("Colony Wars", "Cargo Pod", blob, 3, 0, 3, 0, 0,
	            "Add 3 Trade Ally: Add 3 Combat Scrap: Add 3 Combat", new Scrap(0, 3, 0, 0, 0, 0, "||"), new Ally(0, 3, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardLeviathan() {
	    return new SpaceShip("Colony Wars", "Leviathan", blob, 0, 9, 8, 0, 1,
	            "Add 9 Combat. Draw a card. You may destroy target base. Ally: Acquire a card of cost three or less for free and put it into your hand.", null, null);
	}

	public static Card cardMoonwurm() {
	    return new SpaceShip("Colony Wars", "Moonwurm", blob, 0, 8, 7, 0, 1,
	            "Add 8 Combat Draw a card. Ally: Acquire a cost two or less for free and put it into your hand.", null, null);
	}

	public static Card cardParasite() {
	    return new SpaceShip("Colony Wars", "Parasite", blob, 0, 6, 5, 0, 0,
	            "Add 6 Combat or Acquire a card of cost six or less for free. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardPlasmaVent() {
	    return new Base("Colony Wars", "Plasma Vent", blob, 0, 4, 5, 6, 0, 0,
	            "Add 4 Combat When you acquire this card, if you've played a Blob card this turn, you may put this card directly into your hand. Scrap: Destroy target base.", null, null, false);
	}

	public static Card cardPredator() {
	    return new SpaceShip("Colony Wars", "Predator", blob, 0, 4, 2, 0, 0,
	            "Add 4 Combat Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardRavager() {
	    return new SpaceShip("Colony Wars", "Ravager", blob, 0, 6, 3, 0, 0,
	            "Add 6 Combat You may scrap up to two cards that are currently in the trade row.", null, null);
	}

	public static Card cardStellarReef() {
	    return new Base("Colony Wars", "Stellar Reef", blob, 1, 0, 3, 2, 0, 0,
	            "Add 1 Trade Scrap: Add 3 Combat", new Scrap(0, 3, 0, 0, 0, 0, "||"), null, false);
	}

	public static Card cardSwarmer() {
	    return new SpaceShip("Colony Wars", "Swarmer", blob, 0, 3, 1, 0, 0,
	            "Add 3 Combat You may scrap a card in the trade row. Ally: Add 2 Combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardBattleBot() {
	    return new SpaceShip("Colony Wars", "Battle Bot", machineCult, 0, 2, 1, 0, 0,
	            "Add 2 Combat You may scrap a card in your hand. Ally: Add 2 Combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardConvoyBot() {
	    return new SpaceShip("Colony Wars", "Convoy Bot", machineCult, 0, 4, 3, 0, 0,
	            "Add 4 Combat You may scrap a card in your hand or discard pile. Ally: Add 2 combat", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardFrontierStation() {
	        return new Base("Colony Wars", "Frontier Station", machineCult, 2, 3, 6, 6, 0, 0,
	            "Add 2 Trade or 3 Combat", null, null, true);
	}

	public static Card cardMechCruiser() {
	    return new SpaceShip("Colony Wars", "Mech Cruiser", machineCult, 0, 6, 5, 0, 0,
	            "Add 6 Combat You may scrap a card in your hand or discard pile. Ally: Destroy target base.", null, null);
	}

	public static Card cardMiningMech() {
	    return new SpaceShip("Colony Wars", "Mining Mech", alliance, 3, 0, 4, 0, 0,
	            "Add 3 Trade You may scrap a card in your hand or discard pile. Ally: Add 3 combat", null, new Ally(0, 3, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardRepairBot() {
	    return new SpaceShip("Colony Wars", "Repair Bot", alliance, 2, 0, 2, 0, 0,
	            "Add 2 Trade You may scrap a card in your discard pile. Scrap: Add 2 Combat", new Scrap(0, 2, 0, 0, 0, 0, "||"), null);
	}

	public static Card cardStealthTower() {
	        return new Base("Colony Wars", "Stealth Tower", machineCult, 0, 0, 5, 5, 0, 0,
	            "Until your turn ends, Stealth Tower becomes a copy of any base in play. Stealth Tower has that base's faction in addition to Machine Cult.", null, null, true);
	}

	public static Card cardTheIncinerator() {
	        return new Base("Colony Wars", "The Incinerator", alliance, 0, 0, 6, 8, 0, 0,
	            "Scrap up to two cards in your hand and/or discard pile. Ally: Gain 2 Combat for each card scrapped from your hand and/or discard pile this turn.", null, null, true);
	}

	public static Card cardTheOracle() {
	    return new Base("Colony Wars", "The Oracle", machineCult, 0, 0, 5, 4, 0, 0,
	            "Scrap a card in your hand. Ally: Add 3 combat", null, new Ally(0, 3, 0, 0, 0, 0, 0, "||"), true);
	}

	public static Card cardTheWrecker() {
	    return new SpaceShip("Colony Wars", "The Wrecker", machineCult, 0, 6, 7, 0, 0,
	            "Add 6 Combat You may scrap up to two cards in your hand and/or discard pile. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardWarningBeacon() {
	        return new Base("Colony Wars", "Warning Beacon", machineCult, 0, 2, 2, 2, 0, 0,
	            "Add 2 Combat When you acquire this card, if you've played a Machine Cult card this turn, you may put this card directly into your hand.", null, null, true);
	}

	public static Card cardAgingBattleship() {
	    return new SpaceShip("Colony Wars", "Aging Battleship", starEmpire, 0, 5, 5, 0, 0,
	            "Add 5 Combat Ally: Draw a card. Scrap: Add 2 Combat; Draw 2 cards.", new Scrap(0, 2, 0, 2, 0, 0, "||"), new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardCommandCenter() {
	        return new Base("Colony Wars", "Command Center", starEmpire, 2, 0, 4, 4, 0, 0,
	            "Add 2 Trade Whenever you play a Star Empire ship, gain 2 Combat.", null, null, true);
	}

	public static Card cardEmperorsDreadnaught() {
	    return new SpaceShip("Colony Wars", "Emperor's Dreadnaught", starEmpire, 0, 8, 8, 0, 1,
	            "Add 8 Combat Draw a card. Target opponent discards a card. When you acquire this card, if you've played a Star Empire card this turn, you may put this card directly into your hand.", null, null);
	}

	public static Card cardFalcon() {
	    return new SpaceShip("Colony Wars", "Falcon", starEmpire, 0, 0, 3, 0, 1,
	            "Add 2 Combat Draw a card. Scrap: Target opponent discards a card.", null, null);
	}

	public static Card cardGunship() {
	    return new SpaceShip("Colony Wars", "Gunship", starEmpire, 0, 5, 4, 0, 0,
	            "Add 5 Combat Target opponent discards a card. Scrap: Add 4 Trade", new Scrap(4, 0, 0, 0, 0, 0, "||"), null);
	}

	public static Card cardHeavyCruiser() {
	    return new SpaceShip("Colony Wars", "Heavy Cruiser", starEmpire, 0, 4, 5, 0, 1,
	            "Add 4 Combat Draw a card. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardImperialPalace() {
	    return new Base("Colony Wars", "Imperial Palace", starEmpire, 0, 0, 6, 7, 0, 1,
	            "Draw a card. Target opponent discards a card. Ally: Add 4 Combat", null, new Ally(0, 4, 0, 0, 0, 0, 0, "||"), true);
	}

	public static Card cardLancer() {
	    return new SpaceShip("Colony Wars", "Lancer", starEmpire, 0, 4, 2, 0, 0,
	            "Add 4 Combat If an opponent contols a base, gain an additional 2 Combat. Ally: Target opponent discards a card.", null, null);
	}

	public static Card cardOrbitalPlatform() {
	    return new Base("Colony Wars", "Orbital Platform", starEmpire, 0, 0, 4, 3, 0, 0,
	            "Discard a card. If you do, draw a card. Ally: Add 3 Combat", null, new Ally(0, 3, 0, 0, 0, 0, 0, "||"), false);
	}

	public static Card cardStarBarge() {
	    return new SpaceShip("Colony Wars", "Star Barge", starEmpire, 2, 0, 1, 0, 0,
	            "Add 2 Trade Ally: Add 2 Combat; Target opponent discards a card.", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"));
	}

	public static Card cardSupplyDepot() {
	    return new Base("Colony Wars", "Supply Depot", starEmpire, 0, 0, 5, 6, 0, 0,
	            "Discard up to 2 cards. Gain 2 Trade or 2 Combat for each card discarded this way. Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"), true);
	}

	public static Card cardCentralStation() {
	    return new Base("Colony Wars", "Central Station", tradeFederation, 2, 0, 5, 4, 0, 0,
	            "Add 2 Trade If you have three or more bases in play (including this one) gain 4 Authority and draw a card.", null, null, false);
	}

	public static Card cardColonySeedShip() {
	    return new SpaceShip("Colony Wars", "Colony Seed Ship", tradeFederation, 3, 3, 5, 3, 0,
	            "Add 3 Trade and 3 Combat and 3 Authority When you acquire this card, if you've played a Trade Federation card this turn, you may put this card directly into your hand.", null, null);
	}

	public static Card cardFactoryWorld() {
	        return new Base("Colony Wars", "Factory World", tradeFederation, 3, 0, 6, 8, 0, 0,
	            "Add 3 Trade Put the next ship or base you acquire this turn into your hand.", null, null, true);
	}

	public static Card cardFederationShipyard() {
	        return new Base("Colony Wars", "Federation Shipyard", tradeFederation, 2, 0, 6, 6, 0, 0,
	            "Add 2 Trade Ally: Put the next ship or base you acquire this turn on top of your deck.", null, null, true);
	}

	public static Card cardFrontierFerry() {
	    return new SpaceShip("Colony Wars", "Frontier Ferry", tradeFederation, 3, 0, 4, 4, 0,
	            "Add 3 Trade and Add 4 Authority Scrap: Destroy Target Base.", null, null);
	}

	public static Card cardLoyalColony() {
	    return new Base("Colony Wars", "Loyal Colony", tradeFederation, 3, 3, 6, 7, 3, 0,
	            "Add 3 Combat and 3 Trade and 3 Authority", null, null, false);
	}

	public static Card cardPatrolCutter() {
	    return new SpaceShip("Colony Wars", "Patrol Cutter", tradeFederation, 2, 3, 3, 0, 0,
	            "Gain 2 Trade. Gain 3 Combat. Trade Federation Ally: Gain 4 Authority. Cutters are the life line of Federation colonies.", null, new Ally(0, 0, 4, 0, 0, 0, 0, "||"));
	}

	public static Card cardPeacekeeper() {
	    return new SpaceShip("Colony Wars", "Peacekeeper", tradeFederation, 0, 6, 6, 6, 0,
	            "Add 6 Combat and 6 Authority Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardSolarSkiff() {
	    return new SpaceShip("Colony Wars", "Solar Skiff", tradeFederation, 2, 0, 1, 0, 0,
	            "Add 2 Trade Ally: Draw a card.", null, new Ally(0, 0, 0, 1, 0, 0, 0, "||"));
	}

	public static Card cardStorageSilo() {
	    return new Base("Colony Wars", "Storage Silo", tradeFederation, 0, 0, 3, 2, 2, 0,
	            "Add 2 Authority Ally: Add 2 Trade", null, new Ally(2, 0, 0, 0, 0, 0, 0, "||"), false);
	}

	public static Card cardTradeHauler() {
	    return new SpaceShip("Colony Wars", "Trade Hauler", alliance, 3, 0, 2, 0, 0,
	            "Add 3 Trade Ally: Add 3 Authority", null, new Ally(0, 0, 3, 0, 0, 0, 0, "||"));
	}


	public static Card cardMercCruiser() {
	    return new SpaceShip("Gambit", "Merc Cruiser", unaligned, 0, 5, 3, 0, 0,
	            "Add 5 Combat Choose a faction as you play Merc Cruiser. Merc Cruiser has that faction. They have as much courage as you have coin.", null, null);
	}
	
	public static Card cardCEOShaner() {
	    return new Base("United : Heroes", "CEO Shaner", unaligned, 0, 0, 0, 5, 0, 0,
	            "Until end of turn, you may use all of your Trade Federation Ally abilities. You may acquire a ship or base of cost 3 or less for free and put it on top of your deck. Scrap: Until end of turn, you may use all of your Trade Federation Ally abilities. Draw a card.", null, null, false);
	}

	public static Card cardChairmanHaygan() {
	    return new Base("United : Heroes", "Chairman Haygan", unaligned, 0, 0, 0, 3, 0, 0,
	            "Until end of turn, you may use all of your Trade Federation Ally abilities. Add 4 Authority Scrap: Until end of turn, you may use all of your Trade Federation Ally abilities. Add 4 Authority", new Scrap(0, 0, 4, 0, 0, 0, "||"), new Ally(0, 0, 4, 0, 0, 0, 0, "||"), false);
	}

	public static Card cardChancellorHartman() {
	    return new Base("United : Heroes", "Chancellor Hartman", unaligned, 0, 0, 0, 4, 0, 0,
	            "Until end of turn, you may use all of your Machine Cult Ally abilities. You may scrap a card in your hand or discard pile. Scrap: Until end of turn, you may use all of your Machine Cult Ally abilities. You may scrap a card in your hand or discard pile.", null, null, false);
	}

	public static Card cardCommanderKlik() {
	    return new Base("United : Heroes", "Commander Klik", unaligned, 0, 0, 0, 4, 0, 0,
	            "Until end of turn, you may use all of your Star Empire Ally abilities. You may discard a card. If you do, draw a card. Scrap: Until end of turn, you may use all of your Star Empire Ally abilities. You may discard a card. If you do, draw a card.", null, null, false);
	}

	public static Card cardCommodoreZhang() {
	    return new Base("United : Heroes", "Commodore Zhang", unaligned, 0, 4, 5, 0, 1, 0,
	            "Until end of turn, you may use all of your Star Empire Ally abilities. Add 4 Combat Target opponent discards a card. Scrap: Until end of turn, you may use all of your Star Empire Ally abilities. Draw a card.", null, null, false);
	}

	public static Card cardHiveLord() {
	    return new Base("United : Heroes", "Hive Lord", unaligned, 0, 5, 0, 5, 0, 1,
	            "Until end of turn, you may use all of your Blob Ally abilities. Add 5 Combat Scrap any number of cards currently in the trade row. Scrap: Until end of turn, you may use all of your Blob Ally abilities. Draw a card.", null, null, false);
	}

	public static Card cardConfessorMorris() {
	    return new Base("United : Heroes", "Confessor Morris", unaligned, 0, 0, 0, 5, 0, 1,
	            "Until end of turn, you may use all of your Machine Cult Ally abilities. You may scrap up to two cards in your hand and/or discard pile. Scrap: Until end of turn, you may use all of your Machine Cult Ally abilities. Draw a card.", null, null, false);
	}

	public static Card cardScreecher() {
	    return new Base("United : Heroes", "Screecher", unaligned, 0, 2, 0, 3, 0, 0,
	            "Until end of turn, you may use all of your Blob Ally abilities. Add 2 Combat You may scrap a card in the trade row. Scrap: Until end of turn, you may use all of your Blob Ally abilities. Add 2 Combat You may scrap a card in the trade row.", null, new Ally(0, 2, 0, 0, 0, 0, 0, "||"), false);
	}
	
	public static Card cardAdmiralRasmusson() {
	    return new Base("Crisis : Heroes", "Admiral Rasmusson", unaligned, 0, 0, 0, 2, 0, 0,
	            "Scrap: Until end of turn, you may use all of your Star Empire abilities. Draw a card.", new Scrap(0, 0, 0, 1, 0, 0, "||"), null, false);
	}

	public static Card cardBlobOverlord() {
	    return new Base("Crisis : Heroes", "Blob Overlord", unaligned, 0, 0, 0, 2, 0, 0,
	            "Scrap: Add 4 Combat. Until end of turn, you may use all of your Blob Ally abilities.", new Scrap(0, 4, 0, 0, 0, 0, "||"), null, false);
	}

	public static Card cardCEOTorres() {
	    return new Base("Crisis : Heroes", "CEO Torres", unaligned, 0, 0, 2, 0, 0, 0,
	            "Scrap: Add 7 Authority. Until end of turn, you may use all of your Trade Federation Ally abilities.", new Scrap(0, 0, 7, 0, 0, 0, "||"), null, false);
	}

	public static Card cardCunningCaptain() {
	    return new Base("Crisis : Heroes", "Cunning Captain", unaligned, 0, 0, 0, 1, 0, 0,
	            "Scrap: Until end of turn, you may use all of your Star Empire Ally abilities. Target player discards a card.", null, null, false);
	}

	public static Card cardHighPriestLyle() {
	    return new Base("Crisis : Heroes", "High Priest Lyle", unaligned, 0, 0, 0, 2, 0, 0,
	            "Scrap: Until end of turn, you may use all of your Machine Cult Ally abilities. You may scrap a card from your hand or discard pile.", null, null, false);
	}

	public static Card cardRamPilot() {
	    return new Base("Crisis : Heroes", "Ram Pilot", unaligned, 0, 0, 0, 1, 0, 0,
	            "Scrap: Add 2 Combat. Until end of turn, you may use all of your Blob Ally abilities.", new Scrap(0, 2, 0, 0, 0, 0, "||"), null, false);
	}

	public static Card cardSpecialOpsDirector() {
	    return new Base("Crisis : Heroes", "Special Ops Director", unaligned, 0, 0, 0, 1, 0, 0,
	            "Scrap: Add 4 Authority. Until end of turn, you may use all of your Trade Federation Ally abilities.", new Scrap(0, 0, 4, 0, 0, 0, "||"), null, false);
	}

	public static Card cardWarElder() {
	    return new Base("Crisis : Heroes", "War Elder", unaligned, 0, 0, 0, 1, 0, 0,
	            "Scrap: Until end of turn, you may use all of your Machine Cult Ally abilities. You may scrap a card from your hand.", null, null, false);
	}
}
