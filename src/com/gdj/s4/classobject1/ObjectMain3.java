package com.gdj.s4.classobject1;

import java.util.Scanner;

public class ObjectMain3 {

	public static void main(String[] args) {
		//n명의 학생 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력");
		int count =sc.nextInt();//2
		Student st =new Student();
		Student [] sts = new Student[count];
		//Student [] sts2 = new Student[count];
		for(int i=0; i<sts.length; i++) {
			
			System.out.println(i+1+"번째 학생 이름 입력");
			st.name=sc.next();
			sts[i]=st;
			//모든 레퍼런스 타입에는 4바이트로 생성
			//객체는 heap 어딘가에 있음
			//st
			
		}
		for(int i=0; i<sts.length;i++) {
			System.out.println(sts[i]);
			System.out.println(sts[i].name);
			//System.out.println(sts2[i].name);
			//				student타입
			
		}
		
		sc.close();
		System.out.println("finish");
	}

}
