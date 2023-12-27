package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     System.out.println("숫자를입력하세요");
		System.out.println("숫자:");
		int point = sc.nextInt();
		
		if(point%2==1) {
			//양수일때
			System.out.println("홀수입니다.");
			
		} else if (point%2==0) {
			System.out.println("짝수입니다.");
		}
		
		
		else if (point < 0) {
			//음수일때
			System.out.println("음수입니다.");
		} else {
			//0일때
			System.out.println("0입니다.");
		}	
		
		
		sc.close();

	}
/*  if(point % 2 == 1) 
	'%'는 나머지를 계산하는 연산자 입니다.
	홀수는 2로 나누면 나머지가 1이 되고,
	짝수는 2로 나누면 나머지가 0이 됩니다. 
	*/


	}


