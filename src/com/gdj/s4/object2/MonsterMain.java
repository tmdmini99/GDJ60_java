package com.gdj.s4.object2;

public class MonsterMain {

	public static void main(String[] args) {
		Monster mon1 = new Monster(); //객체를 만들때 한번 실행됨
		//생성자를 참조 변수로 사용 부락
		//mon1.Monster(): 불가
		mon1.power=10;
		mon1.hp=100;
		Monster mon2 = new Monster();
		mon2.power=10;
		mon2.hp=100;
		System.out.println(mon1 ==mon2);
		System.out.println(mon1.checkValue(mon2));
//		System.out.println(mon1);
//		mon1.info();
//		
//		System.out.println(mon2);
//		mon2.info();
	}

}
