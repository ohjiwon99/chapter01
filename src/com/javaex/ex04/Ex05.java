package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		
	    for(int i=1; i<=10; i++) {
	    	
	    	num += i;
	    	//num = num + i;
	    }
	    System.out.println("1부터 10까지의 정수의 합은"+num+"입니다.");
	    sc.close();

	}}//처음에 루프문 안에 sysout울 넣어서 반복됬었다 !!
