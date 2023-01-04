package com.gdj.s4.object4;
//상속 금지
public final class God {
	private String name;
	private static God god;
	private God() {
		
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
