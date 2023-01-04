package com.gdj.s4.object2;

public class Car {
	static String company ="BMW";
	String name;
	int price;
	String color;
	
	{
		//초기화 블럭
		//알아서 한번씩만 실행
		//생성자와 마찬가지로 생성될때 한번만 실행
		System.out.println("초기화 블럭 :"+this.company);
		this.company="AUDI";
	}
	
	
	
	
	public Car() {
//		this("Black"); //생성자내에서 다른 생성자 호출
		System.out.println("생성자"+this.company);
		this.company="순양";
		this.name="아폴로";
		this.price=500;
		this.color="Black";
	}
	public Car(String color) {
		this(color,3500);
//		this.company="순양";
//		this.name="아폴로";
//		this.price=500;
//		this.color=color;
	}
	public Car(String color,int price) {
		this(color,price,"아폴로");
//		this.company="순양";
//		this.name="아폴로";
//		this.price=price;
//		this.color=color;
	}
	public Car(String color,int price,String name) {
		this.company="순양";
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	public void info(){
		System.out.println("Name :"+this.name);
		System.out.println("Company :"+this.company);
		System.out.println("Price :"+this.price);
		System.out.println("Color :"+this.color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
