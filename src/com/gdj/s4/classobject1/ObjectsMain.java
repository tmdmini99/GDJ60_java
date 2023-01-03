package com.gdj.s4.classobject1;

public class ObjectsMain {

	public static void main(String[] args) {
		System.out.println("Start");
		//main은 프로그램을 실행 목적
		//Test의 목적
		//main은 어느 클래스 안에 있던 상관 x
		//학생 한명 생성
		
		//객체 생성
		//변수 선언과 거의 동일
		//클래스명 변수명은 = new 클래스명();  = 객체생성
		Student st =new Student();
		st.name = "전승민";
		st.num= 20;
		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);
		System.out.println(st.avg);
		
		//학생 객체 생성
		Student st1 =new Student(); //학생 객체 생성
		st1.name ="학생";
		st1.num =20;
		st1.kor=30;
		System.out.println(st == st1);
		
		st = st1;
		System.out.println(st.name);
		st.name ="winter"; //같은 주소값을 보고 있기때문에 st의 이름을 바꿔도 st1의 이름도 같이 바뀜
		System.out.println(st1.name);
		System.out.println(st.kor);
		
		
		//가비지 collector
		//객체 생성후 객체 주소가 참조변수와 연결되어 있지 않을경우 메모리에 공간확보를위해서 가비지 컬랙터가 가바지 주소를 지움
		System.out.println("finish");

	}

}
