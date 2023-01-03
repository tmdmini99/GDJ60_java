package com.gdj.s3.array;

public class Array5 {

	public static void main(String[] args) {
		// 
		int []ar1 = {1,2,3};
		int []ar2 = new int[ar1.length-1];
		
		for(int i=0;i<ar2.length;i++) {
			ar2[i]=ar1[i];
			
		}
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
			//한줄 선택 home +shift+end
			//커서가 뒤에있을때 shift+home
			//커서가 앞에 있을때 shift+end
			
		}

	}

}
