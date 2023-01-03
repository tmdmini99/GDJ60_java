package com.gdj.s3.array;

public class Array3 {

	public static void main(String[] args) {
		
		//변수에는 같은 데이터타입만 가능
		//ar1 = ar2;
		int num = 1; //primitive type, 지역변수
		int [] ar1 = {1,2,3}; //reference type
		int [] ar2 = {5,6,7,8};
		String name="iu"; //reference type, 지역변수
		//얕은 복사
		//ar1 =ar2; ar1의 배열 주소값이 ar2의 주소값으로 변경되어 5678이 출력
		//배열은 한번 만들어진 크기는 줄이거나 늘릴수 없음
		
		ar1[0]=num;
		
		System.out.println(ar1.length);
		System.out.println(ar2.length);
		System.out.println(name);
		System.out.println("====================");
		
		for(int i=0; i<ar1.length;i++) {
	
			System.out.println(ar1[i]);
		
		}
		System.out.println("====================");
		for(int i=0; i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
		System.out.println("====================");

	}

}
