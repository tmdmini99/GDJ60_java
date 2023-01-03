package com.gdj.s3.array;

import java.util.Scanner;

public class Array8 {

   public static void main(String[] args) {
      int [] ar= {5,9,8,3,6};
      //9,8,6,5,3  내림차순
      //3,5,6,8,9  오름차순
      //0번 인덱스에 있는 값을 1,2,3,4인덱스랑 비교
      //
      int [] ar1= new int[ar.length];
      for(int i=0;i<ar1.length;i++) {
         ar1[i] = ar[i];
      }
     Scanner sc = new Scanner(System.in);
     System.out.println("1번 오름 차순 2번 내림차순");
     int num = sc.nextInt();
      if(num == 1) {
      for(int i=0;i<ar.length;i++){
         
     for(int j=0;j<ar.length;j++) {
            
            if(ar[i]>ar[j]) {
               ar1[j]=ar[i];
               ar[i]=ar[j];
               ar[j]=ar1[j];
              
               
               
               
            }//if문
            
            
            
            
         }//두번째 for문
         
         
      }//첫번째 for문
      for(int k=0; k<ar1.length;k++) {
          System.out.println(ar[k]);   
       }
      }
      else {
      for(int i=0;i<ar.length;i++){
          
            for(int j=0;j<ar.length;j++) {
                   System.out.println("i"+i);
                   System.out.println(ar[i]);
                   System.out.println(ar[j]);
                   
                   if(ar[i]<ar[j]) {
                      ar1[j]=ar[i];
                      ar[i]=ar[j];
                      ar[j]=ar1[j];
                     
                      
                      
                      
                   }//if문
                   
                   
                   
                   
                }//두번째 for문
                
                
             }
      for(int k=0; k<ar1.length;k++) {
         System.out.println(ar[k]);   
      }

      }
      sc.close();
   }

}