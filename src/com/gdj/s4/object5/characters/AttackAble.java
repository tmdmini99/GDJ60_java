package com.gdj.s4.object5.characters;

public interface AttackAble {
	
	static int DAMAGE =1;
	
	//변하지 않는 수
	//상수하고 추상 메서드만 멤버로 가질수 있음
	//접근 지정자는 무조건 public
	//그외 지정자는 abstract
	//
	public abstract void attack();
//	abstract void attack2();
//    void attack3();
//    public void attack4();
}
