package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요:");
		int code = sc.nextInt();
		
		switch (code) {
		case 2: System.out.println("28일 입니다.");break;
		case 4,6,9,11: System.out.println("30일 입니다.");break;	
		default:System.out.println("31일 입니다.");break;
	}
		sc.close();
	}      
	   //default:System.out.println("31일 입니다.");break;만 해도 됨 나머지값
}       /*
          switch (month) {
             case 4:  
             case 6: 
             case 9: 
             case 11: 
             
             case 1,3,5,7,8,10,12: System.out.println("31일 입니다.");break;
             
               System.out.println("30일 입니다.");
               break;
                
             case 2: 
               System.out.println("28 입니다.");
               break; 
             default: 
               System.out.println("31일 입니다.");
               break;
               */