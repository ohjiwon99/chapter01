package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수:");
		int point = sc.nextInt();
		
		if(point>=60) {
			//True
			System.out.println("합격입니다."); 
		}                  // 한블럭
		else {
			//False
			System.out.println("불합격입니다.");
		}                 // 두블럭
		
		 sc.close();

	}

}
