package com.gdj.s4.classobject1;

public class ObjectsMain2 {

	public static void main(String[] args) {
		// Sword Intance 생성 객체

		Sword sw = new Sword();
		sw.name="집행검";
		sw.at=50;
		sw.na=200;
		sw.plus=3;
		sw.pric=50000;
		
		
		Knight kn = new Knight();
		kn.name="장지환";
		kn.hp=3;
		kn.staminer =1;
		kn.str=4;
		kn.ints=6;
		kn.dex=8;
		
		//클래스 안에 다른 클래스를 선언하면  위에 선언한 sw를 사용 가능
		kn.sword=sw;
		//위에 sword는 reference type
		//이렇게 이중 선언 가능
		System.out.println(kn.sword.name);
		
		//변수 선언
		//Sword s2=null;
		//s2 는 지역변수 초기화 하지 않으면 사용 불가
		//reference의 초기값은 null;
		//System.out.println(s2.at);
		//이렇게 null넣고 사용시 s2.at처럼 넣으면 에러 뜸 객체를 만들지 않았기 때문
		
		
	}

}
