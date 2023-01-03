package com.gdj.s4.object1.ex1;

public class StudentView {
	//viewOne 
	//어디선가 학생 한명을 받아서 학생의 모든 정보를 출력하는 메서드
	//viewList
	//학생들을 받아서 학생의 모든 정보를 출력
	
	public void viewList(Student [] st) {
						//sts
		for(int i=0; i<st.length;i++) {
			//Student st =sts[i];
			//
	
			System.out.println("학생의 이름"+st[i].name);
			System.out.println("학생의 번호"+st[i].num);
			System.out.println("학생의 국어점수"+st[i].kor);
			System.out.println("학생의 수학점수"+st[i].math);
			System.out.println("학생의 영어점수"+st[i].eng);
			System.out.println("학생의 종합점수"+st[i].total);
			System.out.println("학생의 평균"+st[i].avg);
		}
		
	}
	
	
	
	
	
	
	public void viewOne(Student st) {
		System.out.println("학생의 이름"+st.name);
		System.out.println("학생의 번호"+st.num);
		System.out.println("학생의 국어점수"+st.kor);
		System.out.println("학생의 수학점수"+st.math);
		System.out.println("학생의 영어점수"+st.eng);
		System.out.println("학생의 종합점수"+st.total);
		System.out.println("학생의 평균"+st.avg);
	
	}
	
}
