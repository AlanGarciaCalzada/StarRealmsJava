package fr.dut.info.starrealms;

import java.io.Serializable;

public interface CardEvent extends Serializable{
	int getTrade();
	int getCombat();
	int getAuthority();
	int getDraw();
	int getNeededBasesNo();
	int getNeededSCNo();
	boolean isPossible(int playerBasesNo, int playerSCNo);
}
