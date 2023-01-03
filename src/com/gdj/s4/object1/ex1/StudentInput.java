package com.gdj.s4.object1.ex1;

import java.util.Scanner;

public class StudentInput {
	//setStudent
	//학생 한명을 객체를 생성해서, 이름,번호,국어,영어,수학 입력
	//총점, 평균 계산
	
	//setAllStudents로 값 받아오기
	//매개변수로 학생배열을 받아서 
	//배열의 수만큼 학생 객체를 생성해서
	//총점 평균 계산
	//배열에 집어넣으면 됨
	Scanner sc =new Scanner(System.in);
	//findStudent
	//학생배열을 받아서 학생의 번호를 입력 받아서 일치하는 학생을 리턴 없으면 null
	public Student findStudent(Student [] sts) {
		
		System.out.println("학생 번호 입력");
		int stnum = sc.nextInt();
		for(int i=0; i<sts.length;i++) {
			if(sts[i].num == stnum) {
				return sts[i];
			}
				//else 해서 
				//return null을 해버리면 sts[]가 0일 경우 for문이 돌지 않고
				//3번째가 내가 찾는 번호 일 경우 else로 바로 null이 나와서 오류가 뜸
			
			
				
			}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Student[] setStudent(Student [] sts) {
		Student [] stss =new Student[sts.length+1];

		for(int i=0; i<sts.length;i++) {
			stss[i]=sts[i];
		}
		
		Student st =new Student();
		System.out.println("이름 입력");
		st.name=sc.next();
		System.out.println("번호 입력");
		st.num=sc.nextInt();
		System.out.println("국어점수 입력");
		st.kor=sc.nextInt();
		System.out.println("영어 점수 입력");
		st.eng=sc.nextInt();
		System.out.println("수학 점수입력");
		st.math=sc.nextInt();
		st.total=st.kor+st.eng+st.math;
		st.avg=st.total/3;
		System.out.println("총점"+st.total);
		System.out.println("평균"+st.avg);
		
		stss[sts.length]=st;
		
		
		return stss;
		
		
			
	}
	public void setAllStudents(Student []sts) {
		
			
		for(int i=0; i<sts.length;i++) {
			Student st =new Student();
			
			System.out.println("이름 입력");
			st.name=sc.next();
			System.out.println("번호 입력");
			st.num=sc.nextInt();
			System.out.println("국어점수 입력");
			st.kor=sc.nextInt();
			System.out.println("수학 점수입력");
			st.math=sc.nextInt();
			System.out.println("영어 점수 입력");
			st.eng=sc.nextInt();
			st.total=st.kor+st.math+st.eng;
			st.avg=st.total/3;
			
			sts[i] = st;
			
		}
		
		
	}
	
}
