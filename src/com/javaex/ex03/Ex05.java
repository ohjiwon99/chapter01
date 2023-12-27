package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간:");
		int point = sc.nextInt();
		int  time =10000;
		
		if (point > 8) {
			System.out.println("임금은"+(((time*8)+(point-8)*15000))+"원 입니다.");			
		}else {
			System.out.println("임금은"+(time*point)+"원 입니다.");
			
		}
		
		sc.close();

	}

}
