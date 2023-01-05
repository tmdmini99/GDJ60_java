package com.gdj.s4.object5.characters;

public class Knigt extends Character implements AttackAble{
	
	int strong;
	
	Item item = new Sword(); //interface도 데이터 타입으로 선언 가능
	
	
	
	
	
	public void attack() {
		item.a();
		
	}
	
}
