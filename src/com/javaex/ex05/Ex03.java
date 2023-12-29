package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// 

		int[] intArray = new int[5];
		
		intArray[0]=3;
		intArray[1]=6;
		intArray[2]=9;
		intArray[3]=12;
		intArray[4]=55;
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i);
			
		}
		
		System.out.println("========두가지 방법 사용 가능==========");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
			
		}
		
		/*
		System.out.println(intArray[0]);
		System.out.println(intArray[4]);
		*/
		// System.out.println(intArray); 이 문법에는 이렇게 출력할 수 없음 

	}


