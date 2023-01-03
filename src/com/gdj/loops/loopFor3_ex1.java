package com.gdj.loops;

import java.util.Scanner;

public class loopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//분과 초를 입력 받아서 해당 분 초가 되면 반복문 종료
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int sec =sc.nextInt();
		for(int b=0; b<60; b++) {
			
			for(int s =0; s<60; s++) {
				System.out.println(b+"분"+s+"초");
				if(b == min&& s == sec)
					//s = 60
					// b =60
					break;
			}
			if(b == min)
				break;
		}
		sc.close();
	}

}
