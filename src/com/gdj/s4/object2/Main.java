package com.gdj.s4.object2;

public class Main {

	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		returnTest.t1();
		int n =returnTest.t2();
		System.out.println(n);
		int [] ar =returnTest.t3();
		System.out.println(ar.length);

	}

}
