package fr.dut.info.starrealms;

import java.io.Serializable;

public interface Card extends Serializable{
	Scrap getScrap();
	int getAuthority();
	int getCombat();
	int getTrade();
	Faction getFaction();
	Ally getAlly();
	int getDraw();
	String getName();
	int getCost();
	String getType();
	boolean isBase();
	boolean isSC();
	boolean hasScrap();
	boolean hasAlly();
	public String getSet();
	public boolean isDrawActivated();
	public boolean isScrapActivated();
	public boolean isAllyActivated();	
	public boolean activateDraw();	
	public boolean activateScrap();	
	public boolean activateAlly();
	public Card reset();
	public String getDescription();
}
