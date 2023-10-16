package com.kh.practice3.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한개 입력하세요 : ");
		int num;
		num = sc.nextInt();
		if (num%2==0 && num>0) {
			System.out.println("짝수다.");
		} else if (num%2==1) {
			System.out.println("홀수다.");
		} else if (num<=0){
			System.out.println("양수만 입력해주세요.");
		} else {
			
		}
	}

}