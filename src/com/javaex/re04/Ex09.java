package com.javaex.re04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌때마다 1씩 증가 시킵니다.
		//i 반복문
		for(int i=2; i<=9; i++) {
			System.out.println(i);
            
  	    // 위에서 i의 값이 2라면 2x1 ~ 2x9 까지 진행 합니다.
        // 이 반복문(Q)가 종료되면 위의 반복문 변수 i가 1 증가하여 다시 3x1 ~ 3x9 까지 진행하는 식으로 9단까지 반복 합니다
		for(int Q=1; Q < 10; Q++) {
		System.out.println(i + " x " + Q + " = " + i * Q);
			}
		System.out.println();
		
		
		/*int num=2;
		int sum=9;
	    for(int i=1; i<9; i++) {
	    	
	    	num = 2*i;
	    	System.out.println("2*"+i+"="+num);
	    }
	        System.out.println(".......");
	        
	        for(int i=3; i<10; i++) {
		    	
		    	sum = 9*i;
		    	System.out.println("9*"+i+"="+sum);
		    }*/
	        
	        
	    sc.close();
	}}}
		


