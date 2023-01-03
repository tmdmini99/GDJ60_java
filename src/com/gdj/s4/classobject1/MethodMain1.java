package com.gdj.s4.classobject1;

public class MethodMain1 {

	public static void main(String[] args) {
		//instance 객체 생성
		MethodTest mt = new MethodTest();
		MethodTest3 mt3 =new MethodTest3();
		int salary =3000000;
		//호출시 매개변수로 보내는 값: 인자값
		mt3.t3(salary,0.95);
		
		//--------------------------------------
		Sword sw = new Sword();
		sw.name="집행검";
		sw.at=500;
		
		mt3.info(sw);
		
		System.out.println(sw.name);
		
		
		
		
		
		
		
		
		System.out.println("main :"+salary);
		
		
		
		//메서드를 호출한다
		//멤버 변수는 뒤에 ()를 붙일 필요 x
		//st.name=sc.next(); 이런식으로 바로 값을 넣음
		//mt.t1();
		//메서드를 호출하여 메서드 안에 있는 System.out.println();문이 실행되고 main 메서드가 실행
		//mt.t2();
		
		System.out.println("Main Method 종료");
		
		//메서드를 호출하여 메서드가 실행되는 동안 main 메서드는 실행 x 일시정지 됨
		
		

	}

}
