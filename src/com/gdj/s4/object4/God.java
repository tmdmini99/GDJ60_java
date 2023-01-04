package com.gdj.s4.object4;
//상속 금지
public final class God {
	//변수 앞에 final은 상수처럼 사용
	//final이 붙으면 전부 대문자로 사용
	//final로 두가지의 변수명이 있으면 snake기법 사용
	//static final은 같이 사용
	private  String name ="";
	private static God god;
	private God() {
		System.out.println(name);
	}
	//클래스 메서드에서만 가능
//	- Instance 메서드 내에서는 클래스변수, 클래스메서드 사용 가능
//	- 클래스 메서드 내에서는 클래스변수, 클래스 메서드 사용 가능
//	- 클래스 메서드 내에서 Instance 변수, Instance 메서드 사용 불가
	
	public static God getInstance() {
		if(God.god == null) {
			God.god = new God();
		}
		
		return God.god;
	}
	//멤버 메서드의 경우 오버라이딩 금지
	public final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
