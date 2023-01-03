package com.gdj.loops;

import java.util.Scanner;

public class loopFor3_ex2 {

	public static void main(String[] args) {
		//배그
		//총알 30발 ->1탄창
		//캐릭터당 -> 3탄창
		//1.단발
		//2.점사
		//1번 "탕"30번 반복 출력
		//2번 "탕탕탕"10번 반복 출력
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("1번 단발 2번 점사");
			int attack = sc.nextInt();
			int count=10;
			String sound="탕탕탕";
			if(attack == 1) {
				sound ="탕";
				count=30;
				}
			
			for(int j=0;j<count;j++) {
				System.out.println(sound);
				}
			System.out.println("탄창 하나 소비");
		}
		System.out.println("탄창 다 떨어짐");
		sc.close();
	}

}
