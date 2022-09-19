package fr.dut.info.starrealms;

public class Ally extends AbstractCardEvent {
	private int neededFactionNo;
	
	public Ally(int trade, int combat, int authority, int draw, int neededBasesNo, int neededFactionNo, int neededSCNo, String type) {
		super(trade, combat, authority, draw, neededBasesNo, neededSCNo, type);
		this.neededFactionNo = neededFactionNo;
	}
	
	public boolean isPossibleWithFactNo(int playerBasesNo, int playerSCNo, int sameFactionNo) {
		if(!super.isPossible(playerBasesNo, playerSCNo)) {
			return false;
		}
		
		if (sameFactionNo >= neededFactionNo) {
			return true;
		}
		
		return false;
	}
}
