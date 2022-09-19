package fr.dut.info.starrealms;

import java.io.Serializable;

public class Scrap extends AbstractCardEvent {
	
	public Scrap(int trade, int combat, int authority, int draw, int neededBasesNo, int neededSCNo, String type) {
		super(trade, combat, authority, draw, neededBasesNo, neededSCNo, type);
	}

}
