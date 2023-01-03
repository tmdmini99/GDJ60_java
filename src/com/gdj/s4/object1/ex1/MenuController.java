package com.gdj.s4.object1.ex1;

import java.util.Scanner;



public class MenuController {
	//start 메서드
	//1.등록
	//2.수정
	//3.삭제
	//4.종료
	public void start() {
		boolean check = true;
		Scanner sc= new Scanner(System.in);
		StudentInput st1 =new StudentInput();
		System.out.println("학생수를 입력하세요");
		int count =sc.nextInt();
		Student [] sts = new Student[count];//100
		StudentView st2 =new StudentView();
		
		
		while(check) {
		System.out.println("1.정보 등록 2.검색 정보 3.정보 출력 4.학생 추가 5.종료");
		int nu = sc.nextInt();
		if(nu == 1) {
			st1.setAllStudents(sts);
			System.out.println("정보 등록완료");
		}else if(nu == 2) {
			Student st=st1.findStudent(sts);
			if(st !=null) {
				System.out.println("학생 정보");
				st2.view(st);
			}else
				System.out.println("찾는 학생이 없습니다");
			
		}else if(nu == 3) {
			System.out.println("출력완료 완료");
			st2.view(sts);
		}else if(nu == 4){
				sts =st1.setStudent(sts);
				System.out.println("학생수"+sts.length);
				st2.view(sts);
		}else {
			System.out.println("종료");
			break;
		}
			
		}
		
	}
	
	
	
}
