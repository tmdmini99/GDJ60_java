package com.gdj.s4.object6;



public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Robot robot = new Robot();
		
		ArmLeft armLeft =new ArmLeft();
		robot.setArmLeft(armLeft);
		
		System.out.println(robot.getArmLeft());
		
		System.out.println("Right :"+robot.getArmRight());
		
		
		
		System.out.println("Add Robot에서 작업");
		
		robot = new Robot();
		System.out.println(robot);
		
		System.out.println("프로그램 종료");

	}

}
