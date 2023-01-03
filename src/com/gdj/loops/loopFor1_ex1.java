package com.gdj.loops;

public class loopFor1_ex1 {

	public static void main(String[] args) {
		for(int i = 0;i <100; i+=2) {
			System.out.println(i);
		}
		for(int i=0;i<100; i++) {
			if(i %2 ==0) {
				System.out.println(i);
			}
		}
		System.out.println("=======================================");
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum +=i;
		}
		System.out.println("합계 :"+sum);
	}

}
