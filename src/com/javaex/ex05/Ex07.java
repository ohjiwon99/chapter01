package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		//A배열
		int[] arrA= new int[3];
		
		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;
		
		
		//B배열
		int[] arrB = new int[3];
		
		//A배열의 값 B배열에 복사
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
		}

		//A배열 출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		
		
		//B배열 출력
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("---------------------------------");
		//배열 값 바꿔보기!! 확인을 위해서
		arrA[2]=10000;
		
		//A배열 출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		
		System.out.println("---------------------------------");
		
		//B배열 출력
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		

	}

}
