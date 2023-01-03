package com.gdj.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int [] ar = new int[3];
		//int [] ar2 =new int[1];//처음에 만들때 몇개를 만들지 반드시 명시를 해야함
		
		//키보드로부터 숫자를 입력 받아서 해당 숫자만큼 배역을 생성
		
		Scanner sc =new Scanner(System.in);
		System.out.println("배열의 크기를 입력");
		//int [] ar3 = new int[sc.nextInt()];
		
		int count =sc.nextInt();
		int [] ar3 = new int[count];
		for(int i=0; i<count; i++){
		ar3[i] =sc.nextInt();
			}
		//	
		
		//for(int i=0; i<ar3.length;i++) { length는 길이를 나타냄
//			System.out.println(i+"번째 배열의 값 입력");
//			ar3[i] = sc.nextInt();
//			
//		}
		for(int i=0; i<count; i++) {
			System.out.println(ar3[i]);
		}
		System.out.println(ar[3]); //배열의 크기 이상의 순서를 넣으면 오류는 없지만 실행되는 순간 에러 발생
		sc.close();
	}
	

}
