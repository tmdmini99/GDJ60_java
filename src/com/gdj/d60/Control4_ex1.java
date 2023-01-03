package com.gdj.d60;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		// 90점 이상이면 A 
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력");

		int avg = sc.nextInt();
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("점수는 A");
			break;
		
		case 8:
			System.out.println("점수는 B");
			break;
			
		case 7:
			System.out.println("점수는 C");
			break;
			
		default:
			System.out.println("점수는 F");
			break;
		
		
		}
		sc.close();
		
		
		
	}

}
