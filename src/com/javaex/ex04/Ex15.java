package com.javaex.ex04;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요[0이면종료]");
		
		//while break;으로 코드짜기
		while(true) {
			int no = sc.nextInt();
			
			if(no==0) {
				System.out.println("종료");
			break;}
			
			//else생략가능
			//더하기
			sum=sum+no;
			System.out.println("합계:"+sum);}
		sc.close();		}
	}
			

			
	     //if else로 코드짜기	

	/*	if(no!=0) {
			//더하기
			sum=sum+no;
			System.out.println("합계:"+sum);
			
		}else {
			System.out.println("종료");
			break;
		}*/
		
	
		
		
		//입력받기
		//no가 0이면 종료
		
		//no가 0이 아니면 
		//합계계산
		
		//입력받기
		
		
		
		
		
	
	


