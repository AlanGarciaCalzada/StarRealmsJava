package fr.dut.info.starrealms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Faction implements Serializable {
	private final boolean isHybrid;
	private final ArrayList<Faction> factions = new ArrayList<>();
	private final String factionName;
	
	public Faction(String factionName, Faction ...factions) {
		this.isHybrid = true;
		this.factionName = factionName;
		for (Faction name : factions) {
			this.factions.add(name);
		}
	}
	
	public Faction(String factionName) {
		this.isHybrid = false;
		this.factionName = factionName;	
	}
	
	public boolean isHybrid() {
		return isHybrid;
	}
	
	public boolean connected(Faction f) {
		boolean in = false;
		for (Faction faction : this.factions) {
			if (faction.toString() == f.factionName) {
				in = true;
				break;
			}
		}
		return this.equals(f) || in;
	}
	
	@Override
	public String toString() {
		return this.factionName;
	}
	
	@Override
    public boolean equals(Object o) {
        if (!(o instanceof Faction)) {
            return false;
        }
        Faction f = (Faction) o;
        return f.factionName.equals(this.factionName) && f.factions.equals(this.factions) && f.isHybrid == this.isHybrid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionName, factions, isHybrid);
    }
}
