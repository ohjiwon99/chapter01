package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//스캐너준비
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name = sc.nextLine();
		// 출력확인 System.out.println(name);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		// 출력확인 System.out.println(age);
		System.out.println("키를 입력해주세요");
		System.out.print("키: ");
		double height = sc.nextDouble();
		// 출력확인 System.out.println(height);
		System.out.println("당신의 이름은"+' '+name+' '+"나이는"+' '+age+' '+"키는"+' '+height+' '+"입니다.");
		
		sc.close();
			
		

	}

}
