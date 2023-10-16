/*
 변수를 선언할 때 하나의 변수명은 하나의 자료형만 가능하다.
 변수명은 재사용 가능하다.
 * int = 정수;
 * String = 문자열;
변수란, 메모리(RAM)에 값을 기록하기 위한 공간
변수의 선언 : 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것.
변수 선언 방법 :
 1) 자료형 변수명;
 2) 자료형 변수명 = 값;
*/
package com.kh.basic;

public class Variable {

	public static void main(String[] args) {
		int age = 28;
		System.out.println("나이 : " + age);
		int month = 8;
		int day = 28;
		System.out.println(month+"월"+day+"일");
		String date = "월";
		System.out.println(month+date+day+"일");
		
		// 자신의 이름과 월 일을 담은 변수를 만들어 봅시다.
		String name = "김석";
		 month = 9;
		 day = 12;
		
		System.out.println(name+month+day);
		
		
		
		
		//1. 자료형 변수명;
		int number1;
		number1 = 100;
		System.out.println("number1 : "+ number1);
		number1 = 200; //변수명은 재사용 가능하다.
		System.out.println("number1(재사용) : "+ number1);
		
		//자료형 변수명 = 변수값;
		int number2 = 300;
		System.out.println("number2 : "+ number2);
		
		String name1 = "김석";
		System.out.println("name1 : " + name1);
		name1 = "Hi 김석";
		System.out.println("name1(재사용) : " + name1);
		
		int a = 10;
		int b = 20;
		System.out.println("+ : " + a + b);
		System.out.println("* : " + a * b);
		
		//변수명 안에 숫자를 넣고 더하기 빼기 곱하기 나누기 넣기
		int number5 = 8;
		int number6 = 9;
		
		//1. 더하기(+)
		System.out.print("더하기 : ");
		System.out.println(number5+number6);
		
		//2. 빼기(-) 
		System.out.print("빼기 : ");
		System.out.println(number6-number5);
		
		//3. 곱하기(*)
		System.out.print("곱하기 : ");
		System.out.println(number5*number6);
		
		//4. 나누기(/)
		System.out.print("나누기(/) : ");
		System.out.println(number6/number5);
		
		//5. 나머지 구하기(%)
		System.out.print("나머지(%) : ");
		System.out.println(number6%number5);

	}

}
