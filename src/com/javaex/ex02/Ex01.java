package com.javaex.ex02;

public class Ex01 {
	public static void main(String[]args) {
		
		//어떠한 메모리 안에 넣어도 되고 내가 직접 입력해도 가능
		//println 과 print의 차이점(줄바꿈의 차이)
		
		int i = 12345;
	    char c = '한';
	    double d = 3.14;
	    String s = "한";
		String str = "안녕하세요";
		String name = "오지원";
		String hello = "굿모닝";
	
		
		
		System.out.println(i);
		System.out.println(12345);
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		System.out.print(name);
		System.out.println(str);
		
	    System.out.println("------------------------------");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("------------------------------");
		System.out.println(hello + hello);
		System.out.println(name +'님'+ " " + hello + hello);
		System.out.println("제이름은"+name+"입니다");
		
		System.out.println("------------------------------");
		
	      System.out.println(i + i);
	      System.out.println(d + d);
	      System.out.println(i + d);
	      System.out.println(c + c);
	      System.out.println(s + s);
	      //문자열이 들어가면 전부 문자열로 인식
	      System.out.println(name + i + d);
	      
	      System.out.println("------------------------------");
	      System.out.println("안녕\"하세\"요");//(\"=>문자로인식)
	      System.out.println("안녕\\하\\세요");//(\\=>역슬래쉬)
	      System.out.println("안녕\n하세요");//(\n=>줄바꿈기호)
	      System.out.println("안녕\t하세요");//(\t=>일정거리벌어짐)
	      
	      
		
	    		
	    
	    		
	}   

}
