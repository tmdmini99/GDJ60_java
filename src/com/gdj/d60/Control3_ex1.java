package com.gdj.d60;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		// 
		Scanner sc =new Scanner(System.in);
		Random random = new Random();
		//game : TORPG
		//마법사 
		//랜덤 클래스
		String name = "핫팩";
		int hp = 20;
		int mp=20;
		String monsterName="괴물쥐";
		int monsterHp=10;
		System.out.println("1. HP보충 2.MP보충 3.마법1 4.마법2 5.턴넘기기");
		int play =sc.nextInt();
		int Hattack1=random.nextInt(6);
		int Hattack2=random.nextInt(11);
		
		//1. HP보충(포션) 2.MP보충 3.마법1 4.마법2 5.턴 넘기기
		//hp는 보충시 최대 40까지 가능
		//보충시 랜덤하게 0부터 40사이이ㅡ 숫자를 받아서 hp 더하기
		
		int hps = random.nextInt(40); //0부터 40 사이 숫자 랜덤으로 가져옴
	
		
			if(play == 1&& hp!=40) {
				hp = hp+hps ;
				System.out.println(name+"HP가"+hps+"만큼 회복되었습니다");
				
				if(hp+hps >40){
					hp = 40;
					
				}
				System.out.println("HP량"+hp);
				
			}else if(play == 2) {
				mp=mp+hps;
				System.out.println("MP가"+hps+"만큼 회복되었습니다");
				System.out.println("MP량"+hp);
				if(mp+hps>40){
					mp=40;
				}
				
			}else if(play == 3) {
				
				mp=mp-3;
				monsterHp=monsterHp-Hattack1;
				System.out.println(Hattack1+"마법1 공격");
				System.out.println("남은 몬스터 체력 :"+monsterHp);
				System.out.println("남은 마나"+mp);
				
			}else if(play == 4) {
				mp=mp-5;
				monsterHp=monsterHp-Hattack2;
				System.out.println(Hattack2+"마법2 공격");
				System.out.println(monsterName+"남은 몬스터 체력 :"+monsterHp);
			}else if(play == 5) {
				System.out.println("턴 넘김");
			}
			
			
		
		
		sc.close();
	}

}
