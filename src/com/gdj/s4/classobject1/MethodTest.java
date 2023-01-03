package com.gdj.s4.classobject1;

public class MethodTest {
	
	//메서드 선언 공식
	//public static void main()
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
	//그외 지정자는 필수 x [](배열 제외) 필요하면 쓰고 필요하지 않으면 생략 가능
	//접근 지정자 :public
	//그외 지정자 : 생략
	//리턴 타입 : void
	//메서드명 : 작명 메서드의 시작은 소문자로
	//매개 변수 : 생략
	
	public void t1() { //메서드의 header, 선언부
		//{}메서드의 body, 내용
		//제어문, 반복문등등
		System.out.println("t1 메서드 실행시작");
		int num=10;
		System.out.println("T1 Num :"+num);
		System.out.println("t1 메서드 실행 종료");
		MethodTest2 mt2 = new MethodTest2();
		mt2.info();
		
	}
	
	public void t2() {
		System.out.println("t2 메서드 실행시작");
		int num =20;
		System.out.println("T2 Num :"+num);
		System.out.println("t2 메서드 실행 종료");
	}
	
}
