package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		    double v01 = 5/4;
		    System.out.println(v01);
		    //1.0 (1.25라고 생각하는데 정수와 정수이기 때문에 정수로 끝남)
		    double v02 = (double)5/4;
		    System.out.println(v02);
		    //1.25
		    double v03 = 5/(double)4;
		    System.out.println(v03);
		    //1.25
		    double v04 = (double)5/(double)4;
		    System.out.println(v04);
		    //1.25
		    int v05 = (int)1.3 + (int)1.8;
		    System.out.println(v05);
		    //2
		    int v06 = (int)(1.3+1.8);
		    System.out.println(v06);
		    //3
		    
		    /*
		    int v07 = (int)1.3+1.8;
		    System.out.println(v07);
		    */
		    
		    double v08 = (int)1.3+1.8;
		    System.out.println(v08);
		    //2.8		
		    		
		    		
		   
		    
		    
		    
		    

	}

}
