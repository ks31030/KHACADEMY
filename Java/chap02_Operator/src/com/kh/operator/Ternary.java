package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. 삼항 연산자
		/*
		 삼항 = 일항 ? 이항 : 삼항;
		 조건을 평가하고 세가지 값 중 하나를 반환.
		 조건 ? 값1 : 값2 형태로 사용.
		 조건 ? 값1(=true):값2(=false)
		 값1은 조건이 참일 때 출력.
		 값2는 조건이 거짓일 때 출력.
		*/
		// ex) 나이가 20 이상은 성인인가 미성년자인가?
		int age = 20;
		String status = (age>=20) ? "성인" : "미성년자";
		System.out.println(status);
		
		int score = 85;
		String result = (score>=60) ? "합격" : "불합격";
		System.out.println(result);
		
		int number = -5;
		String sign = (-5>0) ? "true" : "false";
		System.out.println(sign);
		
		int temperature = 25;
		String weather = (temperature>21) ? "적당한 날씨" : "추운 날씨";
		System.out.println(weather);
		
		//숫자 7의 값을 짝수인지 홀수인지 1가지 출력하기.
		
		int num = 7;
		String sNum = (num%2==0) ? "짝수" : "홀수";
		System.out.println(sNum);
		
		int number2 = -5;
		String sign2 = (number2>0) ? "양수" : (number2<0) ? "음수" : "0";
		System.out.println(sign2);
		
	}

}
