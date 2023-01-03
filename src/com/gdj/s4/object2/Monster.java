package com.gdj.s4.object2;

public class Monster {

	//멤버 변수 또는 Instance 변수
	int power;
	int hp;

	//멤버 메서드 또는 instance method
	//공격
	//돌아다님
	//생성자 constructor
	public Monster() {
		//매개변수가 없는 생성자를 기본생성자,default constructor
		this.power=50;
		this.hp=60;
		System.out.println("생성자 실행");
	}
	public Monster(int a) {
		
	}
	
	public boolean checkValue(Monster monster) {
		//나의 power와 같고 나의 hp가 같다면 true 리턴
		//둘중에 하나라도 틀리면 false 리턴
		if(this.power == monster.power && this.hp == monster.hp) {
			return true;
		}else
			return false;
	}
	public void info(int a) {
		
	}
	public void info(){
		System.out.println(this);
		//참조 변수 this :class내부에서만 사용 가능, 생성된 객체주소를 담고 있음
		
		System.out.println(this.hp);
		//생략 가능
		System.out.println(hp); // == System.out.println(this.hp);
		attack();
	}
	public void attack() {
		System.out.println("공격");
	}
	public void setHP(int hps) {
		this.hp= hps; //this.hp는 멤버 변수 hp

	}



}
