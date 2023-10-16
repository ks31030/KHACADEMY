package com.kh.overloadingEx;
/*
java 파일을 만드는데
OverSample.java 만들고
오버로딩 5개 만들고 메서드 5개 출력하기
*/

//정수형 곱셈
//세개의 정수형 곱셈
//세개의 실수형 나눗셈
//네개의 정수형 덧셈
//두개의 실수형 뺄셈
public class OverSample {
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}
	public int mul(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	public int mul(int a, int b, int c, int d, int e) {
		return a*b*c*d*e;
	}
	public int mul(int a, int b, int c, int d, int e, int f) {
	return a*b*c*d*e*f;
	}
	
	
	
	public static void main(String[] args) {
		OverSample obj = new OverSample();
		
		//메서드 호출
		System.out.println(obj.mul(10, 20));
		System.out.println(obj.mul(10, 20, 30));
		System.out.println(obj.mul(10, 20, 30, 40));
		System.out.println(obj.mul(10, 20, 30, 40, 50));
		System.out.println(obj.mul(10, 20, 30, 40, 50, 60));
		
	}

}
