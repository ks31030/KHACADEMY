package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nt1, nt2;
		
		System.out.print("첫번째 정수 : ");
		nt1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		nt2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (nt1 + nt2));
		System.out.println("빼기 결과 : " + (nt1 - nt2));
		System.out.println("곱하기 결과 : " + (nt1 * nt2));
		System.out.println("나누기 몫 결과 : " + (nt1 / nt2));
		System.out.println("나누기 나머지 결과 : " + (nt1 % nt2));
		
		
	}

}
