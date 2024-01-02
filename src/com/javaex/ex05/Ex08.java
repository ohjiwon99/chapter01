package com.javaex.ex05;

import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
		// new가 두개이기 때문에 배열은 두개!!
		int[]leftArray = new int[] {10,20,30};
		int[]rightArray = new int[] {10,20,30};
		
		//방갯수 비교
		if (leftArray.length==rightArray.length) {
			//방의 갯수가 같으면
			//세부검사
			for (int i = 0; i < leftArray.length; i++) {
				if (leftArray[i]!=rightArray[i]) {//같은 방의 값이 다르면
					System.out.println(i+"번째의 값이 다릅니다.");
					
				}
			}
		}else {//방의 갯수가 다르면
			System.out.println("두배열의 크기가 다릅니다.");
		}
		
		
		
		
	/*
		leftArray[0]=10;
		leftArray[1]=20;
		leftArray[2]=30;
		
		for (int i = 0; i < leftArray.length; i++) {
			System.out.println(leftArray[i]);
			
		}System.out.println("----------------------------");
		
		for (int i = 0; i < rightArray.length; i++) {
			System.out.println(rightArray[i]);
		}	
			//값이 같은경우
			System.out.println("   ");
		
		
		
		System.out.println("----------------------------");
		
		
		leftArray = new int[3]; 
		rightArray = new int[4]; 
		
		for (int i = 0; i < leftArray.length; i++) {
			System.out.println(leftArray[i]);	
			
		}System.out.println("----------------------------");	
		
		for (int i = 0; i < rightArray.length; i++) {
			System.out.println(rightArray[i]);
			
		}//배열의 갯수가 다를경우
		System.out.println("두배열의 크기가 다릅니다.");
		
		System.out.println("----------------------------");
	
		// 배열의 값이 다를떄
		
		leftArray[1]=2000;
		System.out.println(leftArray[1]);	
			
		System.out.println("----------------------------");	
		
		System.out.println(rightArray[1]);
		
		System.out.println("1번쨰의 값이 다릅니다.");*/
		
		
	}
	
       

}
