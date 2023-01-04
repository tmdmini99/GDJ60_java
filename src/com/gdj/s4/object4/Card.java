package com.gdj.s4.object4;

public class Card {
	private String shape;
	private int number;
	private String color;
	//
	public static int size=10;
	public static void staticMethod() {
		Card.size =10;
		System.out.println("Static Method");
		//static 메서드에서 멤버 변수나 멤버 메서드를 바로 사용 불가능
		//멤버 변수나 멤버 메서드가 생성 될지 안될지 모르기 때문
		
		Card card =new Card();
		card.info();
	}
	//instance 초기화 블럭
	{}
	//static 초기화 블럭
	
	static {
		Card.size=50;
	}
	public void info() {
		System.out.println("Shape :"+this.shape);
		System.out.println("Color :"+this.color);
		System.out.println("Number :"+this.number);
		System.out.println("Size :"+Card.size);
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
