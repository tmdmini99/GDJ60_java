package com.gdj.s4.object3.p1;

public class Member {
	
	//비만관리 회원등록
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	
	public void setCheck(boolean check) {
		this.check = check;
	}
	public boolean isCheck() {
		return check;
	}
	public Member() {
		
	}
	public Member(int age) {
//		if(age>0 && age<200) {
//			this.age = age;
//		}
	}
	//setter method
	//set+변수명 변수명의 첫글자는 대문자
	public void setAge(int age) { //set은 뭔가를 집어 넣을 때
		if(age>0 && age<200) {
			this.age = age;
		}
	}
	//getter method
	//get + 변수명 변수명의 첫글자는 대문자
	public int getAge() { //뭔가를 가져올 때
		return this.age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKi(double ki) {
		this.ki = ki;
	}
	public double getKi() {
		return ki;
	}
	public double getMuge() {
		return muge;
	}
	public void setMuge(double muge) {
		this.muge = muge;
	}
	public void info() {
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
	}
}
