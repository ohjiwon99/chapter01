package com.javaex.ex05;

public class Ex09 {
    //String args = new String[3];
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+"번째방의 값:"+args[i]);
		}
		
		//-h
		if (args[0].equals("-h")) {
			System.out.println("[-h]: 도움말");
			System.out.println("[-v]: 버전정보");
			System.out.println("[-m]: 만든사람");
			
		}

	}

}
