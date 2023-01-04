package com.gdj.s4.object5.characters;

public abstract class Magition extends Character {
	
	private int mp;
	
	
	
	
//	public Magition() {
//		super("sdf");
//	}
	
	
	public abstract void spell();
	
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
	
	
	
}
