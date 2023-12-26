package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		//int var01 = a+b;(var01은 많이 사용할 경우 폴더처럼 넣어두는 개념)
        System.out.println(a+b);
        //9 ( a+b=c , 7+2=9 )
        System.out.println(a-b); // 7-2=5
        System.out.println(a/b); // 7/2=3 (정수)
        System.out.println(a*b); // 7*2=14
        System.out.println(a%b); // 7%2=1(나누었을때,나머지값) 
        
        System.out.println("----------------------------");
        //% 연산자 자세히
        System.out.println(7/2); //3
        System.out.println(7.0/2); //3.5
        System.out.println(7%2); //1
        System.out.println(7.0%2); //1.0
        
        System.out.println("----------------------------");
        //부호연산자(+,-)
        int var = -3;
        int pvar = +var; // +(-3)==>-3
        int mvar = -var; // -(+3)==>+3
        System.out.println(pvar);
        System.out.println(mvar);

        
        
        
        
	}

}
