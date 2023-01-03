package com.gdj.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		int [] ar= {8,5,13,9,6};
		
		//키보드로 부터 삭제하고 싶은 값을 입력받기
		//삭제하고 나머지값 넣기
		Scanner sc =new Scanner(System.in);
		System.out.println("삭제하고 싶은 값 입력");
		int delete =sc.nextInt();
		int []copy=new int[ar.length-1];
		int k = 0;
		for(int i=0; i<ar.length;i++) {
		
			if(ar[i] == delete) {
				continue;
			}
			copy[k]=ar[i];
			k++;
			
		}
		for(int i=0; i<copy.length;i++) {
			System.out.println(copy[i]);
		}
		

		sc.close();
	}

}
