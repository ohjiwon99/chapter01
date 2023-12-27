package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간:");
		int point = sc.nextInt();
		
		int work = 10000*8;
		int Work1 = 10000*point;
		
		if (point <= 8) {
			System.out.println("임금은"+Work1+"원 입니다.");			
		}
		else if (point > 8) {
		System.out.println("임금은"+((work)+((point-8)*12000))+"원 입니다.");	
		}
		sc.close();
	}}
//한번 더 확인

/* "근무시간"출력
   근무시간 입력받기
   급여계산
   1~8:근무시간*10000
   9이상(8초과):공식
   급여출력
   "임금은 92000(계산된값)원입니다.                       
               */

/*      Scanner sc = new Scanner(System.in);
		System.out.println("근무시간:");
		
		int worktime = sc.nextInt();
		
		if(worktime<9){
		  int slary = worktime*10000;
		  System.out.println("임금은"+slary+"원 입니다.");
		  
		  }else{
		  int slary = 8*10000+(worktime-8)*12000;
		  System.out.println("임금은"+slary+"원 입니다.");
	
		*/
//  if_else{}괄호 안에 있는 변수는 사라짐.