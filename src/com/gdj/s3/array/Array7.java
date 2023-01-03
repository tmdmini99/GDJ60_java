package com.gdj.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// 1.데이터 추가
		//0번 인덱스에 추가 내가 원하는 숫자
		// 2.데이터 삭제
		//0번 인덱스 삭제
		// 3.종료
		int [] ar={5,1,4};
		//int [] copy=new int[ar.length];
		
		
		//int []copy1=ar;
		while(true) {
			
		System.out.println("숫자 입력");
		int select=sc.nextInt();
		
		if(select==1) {
			System.out.println("숫자");
			select= sc.nextInt();
			int[] copy=new int[ar.length+1];
			copy[0]=select;
			for(int i=0;i<ar.length;i++){
				copy[i+1]=ar[i];
			}
			ar=copy;
		}else if(select==2) {
			int []copy=new int[ar.length-1];
			for(int i=0;i<copy.length;i++) {
				copy[i]=ar[i+1];
			}
			ar=copy;
		}else if(select == 3)
			break;
		else
			System.out.println("1,2,3번중 선택");
		
		
		}
		sc.close();
	}
}			
			
			
			
			
			
			
//		System.out.println("1번 데이터 추가 2번 데이터 삭제 3번 종료");
//		
//		
//		
//		
//		int num = sc.nextInt();
//		
//		if(num == 1) {
//			copy=new int[copy1.length+1];
//		System.out.println("어떤 숫자를 추가하시겠습니까?");
//		int plus = sc.nextInt();
//		copy[0]=plus;
//			for(int i=1; i<copy.length;i++) {
//				copy[i]=copy1[i-1];
//			}
//			for(int j=0; j<copy.length;j++) {
//				System.out.println("copy 배열 데이터"+copy[j]);
//			}
//		}else if(num == 2) {
//			copy=new int[copy1.length-1];
//			
//			for(int i=0; i<copy.length;i++) {
//				copy[i]=copy1[i+1];
//				
//			}
//			for(int j=0; j<copy.length;j++) {
//				System.out.println("copy 배열 데이터"+copy[j]);
//			}
//		}else if(num == 3)
//			break;
//		else
//			System.out.println("1,2,3번중 선택");
//		
//		copy1= copy;
//
			
			
			
			
			
			
//	}
//		
//
//	}
//
//}
