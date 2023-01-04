package com.gdj.s4.object5.characters;

public class Archer extends Character {
	
	private int dex;
	
	public Archer() {
		
	}
	
	public void attack() { //상속
		System.out.println("활 공격");
	}
	public void move() {
		System.out.println("이동~");
	}
	
	
	
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
}
