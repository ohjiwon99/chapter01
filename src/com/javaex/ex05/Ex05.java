package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		
	int[] lottoArray = new int[6];
	
	for (int i = 1; i < lottoArray.length; i++) {
		
	    lottoArray[i] = (int)(Math.random()*45)+1;
	    System.out.println(i);
	}
	
	for (int i = 1; i < lottoArray.length; i++) {
		System.out.println(lottoArray[i]);
	}
	}}
	
	
	
	
	
	
	
	
	
	
/*	for (int i = 1; i <= lottoArray.length; i++) {
		
		int a= (int)(Math.random()*45)+1;
		System.out.println(a); */

//메모리안에 있는 수가 아닌 새로운 변수를 생성해 없어지는 값이기 때문에 이 식은 놉!!!



// 정수과 랜덤 사용하기!!!!



/*  for (int i = 1; i < lottoArray.length; i++) {
	
	    lottoArray[i] = (int)(Math.random()*45)+1;
	    System.out.println(i);
	}
	
	for (int i = 1; i < lottoArray.length; i++) {
		System.out.println(lottoArray[i]);
	}
	
	
} */

