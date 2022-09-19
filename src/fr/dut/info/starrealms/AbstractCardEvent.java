package fr.dut.info.starrealms;

abstract class AbstractCardEvent implements CardEvent{
	private final int trade;
	private final int combat;
	private final int authority;
	private final int draw;
	private final int neededBasesNo;
	private final int neededSCNo;
	private final String type;
	
	AbstractCardEvent(int trade, int combat, int authority, int draw, int neededBasesNo, int neededSCNo, String type) {
		this.authority = authority;
		this.combat = combat;
		this.trade = trade;
		this.draw = draw;
		this.neededBasesNo = neededBasesNo;
		this.neededSCNo = neededSCNo;
		if ((type.equals("&&")) || (type.equals("||"))) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Type de comparation d'event inattendue: " + type + ", il faut soit && (et), soit || (ou).");
        }
	}
	
	public int getTrade() {
		return trade;
	}

	public int getCombat() {
		return combat;
	}

	public int getAuthority() {
		return authority;
	}
	
	public int getDraw() {
		return draw;
	}
	
	public int getNeededBasesNo() {
		return neededBasesNo;
	}

	public int getNeededSCNo() {
		return neededSCNo;
	}

	public boolean isPossible(int playerBasesNo, int playerSCNo) {
		switch (type) {
		case "&&": {
			if (playerBasesNo >= neededBasesNo && playerSCNo >= neededSCNo) {
				return true;
			}
			return false;
		}
		case "||": {
			if (playerBasesNo >= neededBasesNo || playerSCNo >= neededSCNo) {
				return true;
			}
			return false;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

}
