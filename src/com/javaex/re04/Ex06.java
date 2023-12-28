package com.javaex.re04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int num=0;
	//int max=100;
	
    for(int i=1; i<=10; i++) {
    	//(int i=1; i<=max; i++)
    	num += i;
    	System.out.println("1까지의 합은"+num);
    }
        System.out.println("1부터 10까지의 정수의 합은"+num+"입니다.");
        //System.out.println("1부터"+max+ "까지의 정수의 합은"+num+"입니다.");
    sc.close();

}}
		

