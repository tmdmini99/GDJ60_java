package com.gdj.d60;

import java.util.Scanner;

public class Cotrol2_ex2 {

	public static void main(String[] args) {
		//키보드로부터 국어, 영어, 수학 점수를 입력받음
		//총점과 평균 계산
		//평균이 90점 이상이면 A출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//그외 나머지는 F를 출력
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력:");
		int korean = sc.nextInt();
		System.out.print("수학점수 입력:");
		int math = sc.nextInt();
		System.out.print("영어점수 입력:");
		int english = sc.nextInt();
		int total = korean + math + english;
		int avg = total/3;
       
		if(avg >=60 && english >=40&& math>=40 &&korean>=40) 
			System.out.println("합격");
		
		else
			System.out.println("불합격");

        
		
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
