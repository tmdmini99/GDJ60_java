package com.gdj.s4.classobject1;

public class MethodTest3 {
	
	//실급여를 계산하는 메서드
	public void t3(int salary, double tax) { //main메서드의 변수명과 같을 필요는 없음
		salary =(int)(salary*tax);
		System.out.println("T3 :"+salary);
		
	}
	public void info(Sword sw) {
		//Sword 모든 정보를 출력
		//소드클래스를 메서드의 매개변수로 선언 가능
		System.out.println(sw.name);
		System.out.println(sw.at);
		sw.name="단검"; //이미 sw의 name을 집행검으로 선언했지만 여기 안에서 다시 name을 단검으로 선언하여 main메서드 안에서도 단검으로 바뀜
		
	}
	
	
}
