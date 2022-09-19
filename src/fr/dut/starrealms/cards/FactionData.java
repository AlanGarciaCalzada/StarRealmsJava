package fr.dut.starrealms.cards;

import fr.dut.info.starrealms.Faction;

public class FactionData {
	
	public static Faction unaligned() {
		return new Faction("Unaligned");
	}
	
	public static Faction factionBlob() {
		return new Faction("Blob");
	}
	
	public static Faction factionStarEmpire() {
		return new Faction("Star Empire");
	}
	
	public static Faction factionTradeFederation() {
		return new Faction("Trade Federation");
	}
	
	public static Faction factionMachineCult() {
		return new Faction("Machine Cult");
	}
	
	public static Faction factionAlliance() {
		return new Faction("Alliance", factionStarEmpire(), factionTradeFederation());
	}
	
	public static Faction factionCoalition() {
		return new Faction("Coalition", factionTradeFederation(), factionMachineCult());
	}
	
	public static Faction factionUnity() {
		return new Faction("Unity", factionMachineCult(), factionBlob());
	}
	
	public static Faction factionUnion() {
		return new Faction("Union", factionBlob(), factionStarEmpire());
	}
}
