package com.gdj.loops;

import java.util.Scanner;

public class loopFor_ex3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int id=1234;
		int pw =5678;
		//로그인 시도 총 5번 가능
		//반복문 종료 후 
		// 로그인이 성공 했으면 환영합니다 메세지 출력
		//로그인이 실패했으면 은행 방문하세요 메세지 출력
		boolean check =false;
		for(int i=0; i<5; i++) {
			System.out.println("아이디 입력");
			int idin=sc.nextInt();
			System.out.println("비밀번호 입력");
			int pwin =sc.nextInt();
			if(id == idin && pw ==pwin) {
				i=5;
				check = true;
				System.out.println("로그인 성공");
			}else
				System.out.println("로그인 실패");
		}
		if(check)
			System.out.println("환영합니다");
		else
			System.out.println("은행을 방문하세요");

		sc.close();
	}

}
