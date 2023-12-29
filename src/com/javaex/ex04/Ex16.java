package com.javaex.ex04;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		int sum= 0;
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요[0이면종료]");
		
		
		//do while로 코드짜기
		
		do {
			no = sc.nextInt();
			sum = sum + no;
			System.out.println(sum);
		} while (no!=0);
		
		
		System.out.println("종료");
		sc.close();

	}

}
