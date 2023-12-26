package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		//일반적인 경우
		double pi = 3.14;
		double result = pi*5*5;
		System.out.println(result);
		
		//pi값을 변경하는 경우
		pi = 3.142365;
		double circleaera = pi*5*5;
		System.out.println(circleaera);
	
		//final 변수를 못바꾸게 고정 코드
		final double pi2 =3.14;
		double result02 = pi2*5*5;
		System.out.println(result02);
		

	}

}
