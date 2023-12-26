package com.javaex.ex01;

public class EX12 {

	public static void main(String[] args) {
		// 관계 연산자
		int n1 = 5;
		int n2 = 3;
		
		//boolean result = 5<3;      //f
		//System.out.println(result);
		
		System.out.println(n1<n2); //5<3 f
		System.out.println(n1>n2); //5>3 t
		
		System.out.println(n1<=n2); //5<=3 f
		System.out.println(n1>=n2); //5>=3 t
		System.out.println(3<=n2); //3<=3 t
		
		System.out.println(n1==n2); //5==3 f
		System.out.println(n1!=n2); //5!=3 t(부정문 n1과 n2가 다른가?)

	}

}
