package fr.dut.info.starrealms;

import java.util.Objects;

public class Base extends AbstractCard{

	private int defense;
	private final boolean outpost;
	
	public Base(String set, String name, Faction faction, int trade, int combat, int defense, int cost, int authority, int draw, String description, Scrap scrap, Ally ally, boolean outpost) {
		super(set, name, "Base", faction, trade, combat, cost, authority, draw, description, scrap, ally);
		this.defense = defense;
		this.outpost = outpost;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public void lowerDefense(int damage) {
		defense -= damage;
	}
	
	public boolean isDead() {
		return defense <= 0;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), defense, outpost);
    }
    
    @Override
    public String toString() {
    	if (set.equals("Crisis : Heroes") || set.equals("United : Heroes")) {
    		return "[ " + name + " | Heros | " + trade + " | " + combat + " | " + cost + " | " + authority + " | " + faction + " |( " + defense + " | " + outpost + " )| " + description + " ]";
		}
    	return "[ " + name + " | " + type + " | " + trade + " | " + combat + " | " + cost + " | " + authority + " | " + faction + " |( " + defense + " | " + outpost + " )| " + description + " ]";
    }
    
    public boolean isOutpost() {
    	return outpost;
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Base)) {
            return false;
        }
        Base b = (Base) o;
        return super.equals(o) && b.defense == this.defense && b.outpost == this.outpost;
    }

}
