package com.gdj.d60;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디 입력");
		int id=sc.nextInt();
		System.out.println("비밀번호 입력");
		int pw=sc.nextInt();
		
		if(id == 1234 && pw == 5678)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		sc.close();
	}

}
