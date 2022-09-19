package fr.dut.info.starrealms;

import java.util.ArrayList;

public class Set {
	String setName;
	ArrayList<AbstractCard> set;
	
	public Set(String setName){
		this.setName = setName;
		this.set = new ArrayList<AbstractCard>();
	}
	
	public void addCardToSet(AbstractCard c) {
		this.set.add(c);
	}
	
	@Override
	public String toString() {
		return this.setName;
	}
}
