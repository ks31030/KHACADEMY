package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("문자열을 입력하세요 : ");
		
		str = sc.next();
		str.charAt(0);
		System.out.println("첫번째 문자 : " + str.charAt(0));
		str.charAt(1);
		System.out.println("두번째 문자 : " + str.charAt(1));
		str.charAt(2);
		System.out.println("세번째 문자 : " + str.charAt(2));
	}

}
/*
 char chr = str.charAt(0); 문자를 1자씩 읽음
 한자리씩 보기 때문에 apple 1자가 넘어가 출력을 할 수 없음.
 자리 위치 정해서 출력하기
 
 String str = s.substring(indexnum);
 한자리가 아니라 자리를 지정해서 출력할 수 있음.
 시작만 정해도 되고 끝을 지정해도 됨.
 시작만 작성할 경우 시작한 인덱스 위치부터 끝까지 출력된다.
 */