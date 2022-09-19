package fr.dut.info.starrealms;

import java.io.Serializable;

public class SpaceShip extends AbstractCard {

	public SpaceShip(String string, String name, Faction faction, int trade, int combat, int cost, int authority, int draw, String description, Scrap scrap, Ally ally) {
		super(string, name, "SpaceShip", faction, trade, combat, cost, authority, draw, description, scrap, ally);
	}

}
