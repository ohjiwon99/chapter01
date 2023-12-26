package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		//자동형변환
		int var00 = 3+5;
		System.out.println(var00);
		
		double var02 = 3+3.5;
		System.out.println(var02);
		
		//////////////////////////////
		//강제형변환
		float var04 = 111.6345f;
		int var05 = (int)var04;
		System.out.println(var04);
		System.out.println(var05);
	    //소수점 사라짐 왜냐 내가 강제로 바꿨으니까 ㅇㅋ?
		
		//축소형변환(int-->byte)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02); //값이 변하지 않는다. *이유공부하기
		
		//축소형변환(int-->byte)
		int v03 = 203029770;
		byte v04 = (byte)v03;
		System.out.println(v04); //값이 변하는 이유 공부
		
		//확대 형변환(byte-->int)
		byte v05 = 127;
		int v06 = (int) v05;
		System.out.println(v06); //값이 그대로 나오는 이유 공부
		
		//실수-->정수
	    double v07 = 5.57;
	    int v08 = (int)v07;
	    System.out.println(v08);
	    
	    //정수-->실수
	    int v09 = 7;
	    double v10 = (double)v09;
	    System.out.println(v10);
	  
  
	    
		
	}

}
