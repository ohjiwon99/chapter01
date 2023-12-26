package com.javaex.ex01;

public class EX10 {

	public static void main(String[] args) {
		
		// 증감 연산자
		int a = 7;
		 
		System.out.println(a); // 7
		System.out.println(++a);// 8 ++기호는 하나를 더한다.
		// *a의 원본값이 변한건지 ++기호로 계산해서 8이된건지 알아보기위해 a를 한번 더 출력한다.
		System.out.println(a); // 8 즉 a는 8로 원본값이 변한거다.
		
		/* 답을 맞추는게 정답이 아니라 언제 ++을 써야하는지 아닌지 코드를 짜야한다*/
		
		
		//감소 연산자
		int b = 5;
		System.out.println(--b);
	}

}
