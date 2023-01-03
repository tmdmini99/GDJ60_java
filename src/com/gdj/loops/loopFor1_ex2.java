package com.gdj.loops;

import java.util.Scanner;

public class loopFor1_ex2 {

	public static void main(String[] args) {
		// 학생수를 입력받고
		// 학생수 만큼 점수를 입력 받아서
		//총합계를 출력
		Scanner sc =new Scanner(System.in);
//		System.out.println("학생수 입력");
//		int st = sc.nextInt();
//		int total =0;
//		
//		for(int i=0; i<st; i++) {
//			System.out.println("점수 입력");
//			total +=sc.nextInt();
//		}
//		System.out.println("총합계"+total);
		
		System.out.println("초를 입력하세요");//초를 5를 입력하면 5까지만 입력하고 나가게끔
		int time=sc.nextInt();
		
		for(int i=0; i<60; i++) {
			System.out.println(i+"초");
			if(i == time)
				break;
		}
		System.out.println("종료");
		sc.close();
	}

}
