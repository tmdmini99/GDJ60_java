package com.gdj.d60;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		//단일 if
		//if(조건식){조건식이 true일 때 실행}
		//졸업 시험, 무조건 졸업 평균이90점 이상이면  우등상 수상
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력:");
		int avg = sc.nextInt();
		int don = 0;
		if(avg >=90) {
			don = 1000000000;
			System.out.println("우등상 수상");
			System.out.println("졸업을 축하합니다");
			System.out.println("장학금 :"+don);
		}
		else {
			System.out.println("졸업을 축하합니다");
			System.out.println("장학금 :"+don);
		}
		System.out.println("프로그램 종료");
		sc.close();

	}

}
