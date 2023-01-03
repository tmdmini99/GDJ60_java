package com.gdj.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1.학생수를 입력 받음
		//2.학생수 만큼 이름을 입력, iu, winter
		//3. 학생수 만큼 학생의 번호, 국어,영어, 수학 점수 입력
		// a학생의 번호:
		// a학생의 국어:
		// a학생의 수학: 
		// a학생의 영어:
		//입력이 끝나면 총점과 평균 계산
		
		//모든 학생의 정보 출력
		// 이름 번호 국어 영어 수학 총점 평균
		// iu 1	  53 63  52 125 35.3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력");
		int count1 = sc.nextInt();
		
		int [] num = new int[count1];
		int [] kor = new int[count1];
		int [] math = new int[count1];
		int [] eng = new int[count1];
		String []name = new String[count1];
		int []sum = new int[count1];
		double[] avg = new double[count1];
		
		for(int i =0; i<name.length;i++) {
			System.out.println("학생 이름 입력");
			name[i] =sc.next();
			System.out.println(name[i]+"의번호 입력");
			num[i]=sc.nextInt();
			System.out.println(name[i]+"의국어 점수 입력");
			kor[i]=sc.nextInt();
			System.out.println(name[i]+"의수학점수 입력");
			math[i]=sc.nextInt();
			System.out.println(name[i]+"의영어점수 입력");
			eng[i]=sc.nextInt();
			sum[i]=kor[i]+math[i]+eng[i];
			avg[i]=sum[i]/3.0;
			
		}
		System.out.println("모든학생 정보 출력");
		for(int i=0; i<name.length; i++) {
			System.out.println("이름 \t번호 \t국어 \t영어\t수학\t총점\t평균");
			System.out.println(name[i]+"\t"+num[i]+"\t"+kor[i]+"\t"+math[i]+"\t"+eng[i]+"\t"+sum[i]+"\t"+avg[i]);
		}
		sc.close();
	}

}
