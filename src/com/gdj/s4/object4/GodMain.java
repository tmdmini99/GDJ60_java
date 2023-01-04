package com.gdj.s4.object4;

public class GodMain {

	public static void main(String[] args) {
		//생성자 메서드가 private이여서
		//객체가 생성이 안될 때 바로 생성 하는 방법
		//makeGod을 static으로 바꿔 객체를 만들기 전부터 실행 하여 객체르 만듬
		//static으로 되면 한번만 실행되어 god 메서드는 한번만 만들어짐
		//singleTon 디자인패턴객체가 하나인것
		
		God god =God.getInstance();
		god.setName("유일신");
		System.out.println("God :"+god);
		System.out.println("Name :"+god.getName());
		
		god = God.getInstance();
		System.out.println("God :"+god);
		System.out.println("Name :"+god.getName());
		

	}

}
