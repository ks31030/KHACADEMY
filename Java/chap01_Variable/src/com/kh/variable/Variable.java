package com.kh.variable;
 
public class Variable {
	public static void main(String[] args) {
		// 1. 변수의 이름은 영문자, 숫자, 언더스코어, 달러($)로 구성할 수 있다.
		
		// 2. 변수의 이름은 숫자로 시작할 수 없다.
		
		// 3. 변수 이름 사이에는 공백을 포함할 수 없다.
		// 언어의 규칙으로 띄어쓰기는 무언가 새로 시작할 때 사용하기 때문에 사용하지 않는다.
		
		// 4. 자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못 한다.
		
		// 1. 실수형(소수점이 있는 숫자 : float, double)
		float pie1 = 3.141241245f; //float은 f나 F를 작성한다.
		double pie2 = 3.141241245;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		// 2. 정수형
		// byte -128 ~ 127까지 사용 가능.
		//byte bt = -129; //int로 변경하거나 값을 + byte 넣어 줘야 한다.
		byte bt = -127; //-129 이하와 128 이상부터 출력이 되지 않는 것 확인.
		System.out.println(bt);
		//short -32,768 ~ 32,767까지 사용 가능.
		//short shrt = -32769; //-32769 이하와 32768 이상부터 출력이 되지 않는 것 확인.
		short shrt = -32767;
		System.out.println(shrt);
		
		// int -2,147,483,648 ~ 2,147,483,647까지 사용 가능.
		int nt = -2147483648;
		System.out.println(nt);
		
		// long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807까지 사용 가능.
		long lng = 2000L; //뒤에 L, l을 붙여준다.
		System.out.println(lng);
		
		// 3. 문자형
		// char 문자형. 문자를 한 문자만 포함할 수 있다.
		//      '';
	    char chr1 = 'a';
	    System.out.println(chr1);
	    
		// String은 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨.
		// 기본적인 자료형에 들어가지 않기 때문에 String으로 표현됨.
		// String ""나 '' 안에 글자를 작성할 것(규칙).
		//String name = "안녕하세요.";
		
		// 4. 논리형
		// boolean 은 true와 false를 표현한다.
		// 사용방법 : boolean bln = true; false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("안녕하세요. 저는 홍길동입니다.");
		String name = "홍길동";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		// 한번 타입을 선언한 변수는 재선언을 하지 않고 그대로 사용해도 된다.
		// 한번 선언한 타입을 다른 타입으로 재선언할 수 없다.
		// 선언한 타입을 다른 타입으로 변경해서 선언할 수 없다.
		name = "박철수";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		
		int age = 22;
		String baseball = "야구";
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		System.out.println("저의 나이는 " + age + "살이고, ");
		System.out.println("저의 취미는 " + baseball + "입니다.");
		
		char score = 'a';
		System.out.println("저의 성적은 " + score + "입니다.");
	
	}
}
