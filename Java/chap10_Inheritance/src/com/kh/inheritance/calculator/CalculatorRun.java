package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 사용
		
		Calculator cal = new Calculator(); //멤버변수 설정
		System.out.println("★★★숫자 2개 입력하여 사칙연산 값 구하기★★★");
		System.out.println();
		
		int num1, num2; //객체변수아님!
		 
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		System.out.println();
		 
		int result1 = cal.add(num1, num2);
		int result2 = cal.substruct(num1, num2);
		int result3 = cal.multiply(num1, num2);
		int result4 = cal.divide(num1, num2);
		int result5 = cal.mod(num1, num2);
		
		System.out.println("Add : " + result1);
		System.out.println("Substruct : " + result2);
		System.out.println("Multiply : " + result3);
		System.out.println("Divide : " + result4);
		System.out.println("Mod : " + result5);
	}

}
