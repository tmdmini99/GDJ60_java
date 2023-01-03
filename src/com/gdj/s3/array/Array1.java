package com.gdj.s3.array;

public class Array1 {

	public static void main(String[] args) {
		//primitive type
		//숫자(정수형(byte, short,int,long),실수형(float,double)), 문자 char, 논리형 boolean
		//reference type
		//String
		
		double d1 =1.2;
		d1 =5.3;
		//변수 선언 공식 데이터 타입 변수명;
		//배열 선언 공식
		//모으려고 하는 데이터 타입 [] 변수명
		
		
		
		//if문 안에 int num을 선언하면 if문의 중가로가 끝나면 지역변수임 num은 사라짐
		if(d1>0) {
			//int num = 10;
		}
		
		
		double [] ar = {1.2,5,2,6,3};
		double [] ar1 = new double[3]; // 대괄호 안에 있는 숫자는 배열의 갯수를 의미 현재 3이 들어가있어 배열의 개수는 3개
		ar1[1] = 5.2;
		//new는 heap영역에 생성하는 것
		int [] ar2 = new int[3];
		int [] ar3 = {1,2,3};
		
		//int ar4 [] = {2,3,4};
		
		for(int i=0; i<3;i++) {
			System.out.println(ar3[i]);
		}
		
		//ar의 데이터 타입은 double 배열임
		//배열은 reference타입임
		//ar에서 heap의 주소를 참조해라
		//ar =d1; 하면 에러뜸
		//main메소드는 stack영역에서 실행
		//d1과 ar 변수명은 stack에 저장
		//ar의 내용인 1.2,5.2,6.3은 heap에 저장
		System.out.println(d1);
		System.out.println(ar);
		
		
		
		System.out.println(ar1[0]);
		System.out.println(ar2[0]);
		//heap에 들어가는 변수는 반자동으로 초기화
		
		
		
		
		
		
		
		
		
		
	}

}
