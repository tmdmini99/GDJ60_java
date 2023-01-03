package com.gdj.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		//1.로그인 2.종료
	//   1:id, pw입력 후 로그인 판단
	//   2: 종료	
		//1.로그인 성공 했을 대 진행
		//레벨1로 시작
		//모든 몬스터의 경험치는 동일
		//Gold 0
		//5렙 달성시1000골드 지급
		//10렙 달성시 2000골드 지급
		//만랩 달성시 3000골드 지급

		//1 -> 2: 3 
		//2 -> 3: 6 
		//3 -> 4: 9 
		//4 -> 5: 12 
		//5 -> 6: 15
		//14->15 :52
		//만랩달성 축하, 현재 골드 출력
		Scanner sc =new Scanner(System.in);
		
		
		int id = 1;
		int pw = 2;
		int pwin=0;
		int idin=0;
		int gold = 0;
		int ex = 0;
		int level = 1;
		boolean check = true;
		int gold1=0;
		while(check) {
		System.out.println("아이디 입력");
		idin = sc.nextInt();
		System.out.println("비밀번호 입력");
		pwin = sc.nextInt();
		
		if(id == idin && pw == pwin) {
			break;
		}
		}
		
		
		if(id == idin && pw == pwin){
			System.out.println("로그인 성공");
			while(true) {
				
				System.out.println("1번을 누르면 공격됩니다");
				int attack =sc.nextInt();
				
			
				if(attack == 1) {
					ex +=7;
					
					
						
					if(ex >=level*3) {
						level +=1 ;
						ex -=(level-1)*3;
						if(level%5==0)
							gold1=1;
						
						
						
						
					}
					if(level%5== 0 &&gold1 == 1) {
						
						gold += level*200;
						gold1=0;
						
					
				}
					
					System.out.println("획득한 경험치 "+ex);
					System.out.println("현재 레벨 "+level);
					System.out.println("현재 골드 "+gold);
				}
				if(level == 15) {
					System.out.println("축하합니다.최대 레벨입니다!");
					System.out.println("현재 레벨"+level);
					System.out.println("현재 골드"+gold);
					break;
				}
				
			}
		}else {
			System.out.println("로그인 실패");
			
		}
		sc.close();
	}

}

/*for(level=1;level<15;level++){
 * System.out.println("현재 레벨"+level);
 * for(m=0;m<level*3;m++){
 * System.out.println(m+"번째 사냥성공");
 * }
 * 
 * 
 */

