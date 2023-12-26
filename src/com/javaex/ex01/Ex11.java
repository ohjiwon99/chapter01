package com.javaex.ex01;

public class Ex11 {

	public static void main(String[] args) {
		int b = 10;
		System.out.println(b); // 10
		System.out.println(b++); // 10 (11로 안나타나는 이유는 나중에 맨 뒤에 올림)
		System.out.println(b); // 11
		System.out.println(b--); //11 (위와 같이 나중에 맨 뒤에 적용)
		System.out.println(b); //10
		
		System.out.println("----------------------------------");
		
		int no = 10;
		System.out.println(++no+3); //14 11+3(앞에 더하기)
		System.out.println(no--+3); //14 11+3(나중에 빼기)
        
		System.out.println("----------------------------------");
		
		int no1 = 11;
		
		++no1;
		++no1;
		System.out.println(no1);//13
		
	}

}
