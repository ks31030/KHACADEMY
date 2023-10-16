package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.ArithException();
		pm.NPException();
		pm.NumFormatException();
	}
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외 처리
		int dividend = 100;
		int divisor = 0;
		try {
			int result = dividend/divisor; //0으로 나누는 시도
			System.out.println(result);
		} catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}
	}

	public void NPException() {
		String text = "Hello World";
		String subText = null;
		
		try {
			//indexOf subText에 있는 null값을 포함한 문자열 검색
			int length = text.indexOf(subText);
		} catch(NullPointerException a) {
			System.out.println("값이 없잖아요. 선생님 " + a.getMessage());
		}
	}
	
	public void NumFormatException() {
		String text = "123.45";
		try {
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch (NumberFormatException aa) {
			System.out.println("이상하게 나오잖아요 " + aa.getMessage());
		}
	
	}
}