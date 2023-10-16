package com.kh.variable;
public class VariableConversion {
	public static void main(String[] args) {
		//1. 자동형변환(암시적형변환, 묵시적형변환)
	/*
		int intNum = 100;
		System.out.println(intNum);//숫자 100을 의미.
		long longNum = intNum; //int를 long으로 자동형변환.
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float를 double로 자동형변환.
		
		// int -> long 변경하는 형변환 2가지 만들고 출력하기.
		int intNum1 = 999;
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum2 = 555;
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		// short -> int 변경하는 형변환 1가지 만들고 출력하기.
		short shortNum1 = 112;
		int intNum3 = shortNum1;
		System.out.println(intNum3);
		//float -> double 변경하는 형변환 1가지 만들고 출력하기.
		float floatNum2 = 1212.13f;
		double doubleNum2 = floatNum2;
		System.out.println(doubleNum2);
		
		//2. 명시적형변환(강제형변환)
		//long -> int
		long largeLong = 12345L;
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt);//long을 int로 강제형변환할 경우 값이 범위 안에 있지 않으면 일부 데이터는 손실된다.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제형변환할 경우 '정수 부분만 유지'된다.
		*/
		//문자와 숫자 간의 형변환 2가지 출력하기.
		//문자는 char charValue ='Z'; -> int로 변경.
		char charValue = 'Z';
		int intValue = charValue;
		System.out.println(intValue);
		
		int intValue2 = 65;
		char charValue2 = (char) intValue2;
		System.out.println(charValue2);
		//double -> int로 형변환 1가지 출력하기.
		double doubleValue = 3.14;
		int intValue3 = (int) doubleValue;
		System.out.println(intValue3);
		//int -> short로 형변환 1가지 출력하기.
		int intValue4 = 123;
		short shortValue = (short) intValue4;
		System.out.println(shortValue);
		
		
	}
}
