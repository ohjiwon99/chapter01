package com.javaex.ex01;

public class Ex05 {
	public static void main(String[]args) {
		char ch01 = 'A';
		System.out.println(ch01);
		char ch02 = '황';
		System.out.println(ch02);
		//캐릭터형은 무조건 한글자 
		//문자형은 '' 넣어줘야함 ""쌍따옴표 안됨
		char ch03 = 65;
		System.out.println(ch03);
		//65라는 숫자를 넣었는데 A라는 코드값이 나온 이유는 65=A라고 표에정의
		//(정수로 넣으면 코드값으로 인식됨)
		///////////////////////////////////////////////
		
		String name = "오지원";
		System.out.println(name);
		//String에는 쌍따옴표 ,이름 여러글자가능 
	}

}
