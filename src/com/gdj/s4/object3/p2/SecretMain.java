package com.gdj.s4.object3.p2;


import com.gdj.s4.object3.p1.Secret;

public class SecretMain {

	public static void main(String[] args) {
		Secret secret = new Secret();
		com.gdj.s4.object3.p2.Secret secret2 =new com.gdj.s4.object3.p2.Secret();
		secret.s1();
		secret.money=1;
		//같은 이름의 클래스를 main에서 사용하려면 둘중에 하나는 풀 패키지 명을 명시 해야함
		
		Test test =new Test();
		System.out.println(test.point);
		//secret.s2();
		

	}

}
