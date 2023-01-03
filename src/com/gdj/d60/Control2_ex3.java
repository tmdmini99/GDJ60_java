package com.gdj.d60;

import java.util.Scanner;



public class Control2_ex3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디 입력");
		int id=sc.nextInt();
		System.out.println("비밀번호 입력");
		int pw=sc.nextInt();
		boolean su = true; 
		double price;
		int price1;
		if(id == 1234 && pw == 5678) {
			System.out.println("로그인 성공");
			su = true;
		}
			
		else {
			System.out.println("로그인 실패");
			su = false;
		}
		
		if(su) {
			System.out.println("급여를 입력");
			price = sc.nextInt();
			System.out.println("정규직 1 or 계약직2 ");
			int i =sc.nextInt();
			if(i == 1) {
				price = price-price*0.02-price*0.03-price*0.01-price*0.01;
				price1 =(int)price;
				/*
				 *int tax=0;
				 *tax = tax +(int)(price*0.02);
				 *tax = tax +(int)(price*0.03);
				 *tax = tax +(int)(price*0.01);
				 *tax = tax +(int)(price*0.01);
				 * 
				 */
				
			}else {
				price =price - price*0.033;
				price1=(int)price;
				
			}
			System.out.println("고용보험 가격 : "+(price*0.02));
			System.out.println("의료보험 가격 : "+(price*0.03));
			System.out.println("국민연금 가격 : "+(price*0.01));
			System.out.println("산재보험 가격 : "+(price*0.01));
			System.out.println("실 급여는 :"+price1);
		}
		//로그인이 성공했을때만 실행
		//성공시에만 급여 입력
		//정규직이면 1을 입력, 비정규직이면 2를 입력
		//정규직의 실 급여 계산
		//정규직 : 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		sc.close();
	}

}
