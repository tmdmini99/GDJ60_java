package com.gdj.s4.object5.characters;

public  class Character {
	private String name;
	private int hp;
	private int level;
	
//	public Character() {
//		
//	}
	
//	public Character(String name) {
//		this.name=name;
//	}
	//상속해서 완성해서 사용해라 라는 의미
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
