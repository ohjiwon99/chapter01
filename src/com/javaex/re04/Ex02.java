package com.javaex.re04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
	    System.out.println("단을 입력하세요");
	    System.out.println("단: ");
	    int dan = sc.nextInt();
	    int i = 0;
	    //int time =1;
	    
	    while(i<=9) {
	    //반복
	    //System.out.println(dan + "*"1~9+"="+dan*?);
	    System.out.println(dan + "*" + i + "="+ dan*i);
	    //(dan + "*" + i + "=") 문자형 값을 곱한게 아니고 붙힌거다.  dan*i 이 식이 곱한거!);
	
	    i++;
	    //time++;
		//0부터 시작이 아니라 구구단으로 1로 시작하고 싶을 경우 변수 하나 더 만들어도 됌
	    //System.out.println(dan + "*" + time + "="+ dan*time);
	    
	    //System.out.println(dan + "*" + (i+1) + "="+ dan*i);
	    //변수를 새로 사용하지 않을경우 식을 보고 하나 더해줘도 가능
	    
		
	}
	
	
	sc.close();

}}
