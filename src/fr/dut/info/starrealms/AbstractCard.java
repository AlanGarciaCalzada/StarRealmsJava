package fr.dut.info.starrealms;

import java.util.Objects;

abstract class AbstractCard implements Card{
	
	protected final String set;
	protected final String name;
	protected final String type;
	protected final Faction faction;
	protected final int trade;
	protected final int combat;
	protected final int cost;
	protected final int authority;
	private final int draw;
	private final Scrap scrap;
	private final Ally ally;
	protected final String description;
	private boolean drawActivated = false;
	private boolean scrapActivated = false;
	private boolean allyActivated = false;
	
	AbstractCard(String set, String name, String type, Faction faction, int trade, int combat, int cost, int authority, int draw, String description, Scrap scrap, Ally ally /* Scrap -> new Scrap(trade, authority (-> getAuthority pour le donner dans le main au joueur), combat, defense), idem ally */) {
		this.set = Objects.requireNonNull(set);
		this.name = Objects.requireNonNull(name);
		this.type = Objects.requireNonNull(type);
		this.faction = Objects.requireNonNull(faction);
		this.trade = trade;
		this.combat = combat;
		this.cost = cost;
		this.authority = authority;
		this.draw = draw;
		this.scrap = scrap;
		this.ally = ally;
		this.description = description;
	}
	
	@Override
    public boolean equals(Object o) {
        if (!(o instanceof AbstractCard)) {
            return false;
        }
        AbstractCard c = (AbstractCard) o;
        return c.name.equals(name);
    }
	
	public int getDraw() {
		return draw;
	}
	
	public String getType() {
		return type;
	}
	
	public Scrap getScrap() {
		return scrap;
	}

    public int getTrade() {
		return trade;
	}

	public int getCombat() {
		return combat;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public Ally getAlly() {
		return ally;
	} 
	
	public String getSet() {
		return set;
	}

	public boolean isDrawActivated() {
		return drawActivated;
	}

	public boolean isScrapActivated() {
		return scrapActivated;
	}

	public boolean isAllyActivated() {
		return allyActivated;
	}
	
	public boolean activateDraw() {
		if (!drawActivated) {
			drawActivated = true;
			return true;
		}
		return false;
	}
	
	public boolean activateScrap() {
		if (!scrapActivated) {
			scrapActivated = true;
		}
		return false;
	}
	
	public boolean activateAlly() {
		if (!allyActivated) {
			allyActivated = true;
			return true;
		}
		return false;
	}

	public boolean hasAlly() {
		if(ally!=null) {
			return true;
		}
		return false;
	}
	
	public boolean hasScrap() {
		if(scrap!=null) {
			return true;
		}
		return false;
	}
	
	public Card reset() {
		drawActivated = false;
		allyActivated = false;
		scrapActivated = false;
		return this;
	}

	public String getDescription() {
		return description;
	}
	
	public int getAuthority() {
		return authority;
	}
	
	public Faction getFaction() {
		return faction;
	}
	
	public boolean isBase() { // renvoie si la carte est une Base
		return type.equals("Base");
	}
	
	public boolean isSC() { // renvoie si la carte est un SpaceShip
		return type.equals("SpaceShip");
	}

	@Override
    public int hashCode() {
        return Objects.hash(set, name, type, faction, trade, combat, description);
    }
    
    @Override
    public String toString() {
    	return "[ " + name + " | " + type +  " | " + trade + " | " + combat + " | " + cost + " | " + authority + " | " + faction + " | " + description + " ]";
    }
}
