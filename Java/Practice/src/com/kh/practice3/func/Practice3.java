package com.kh.practice3.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나의 성적 확인");
		int scr1, scr2, scr3;
		scr1 = sc.nextInt();
		System.out.println("국어 점수 : " + scr1);
		scr2 = sc.nextInt();
		System.out.println("수학 점수 : " + scr2);
		scr3 = sc.nextInt();
		System.out.println("영어 점수 : " + scr3);
		
		System.out.println("합계 : " + (scr1 + scr2 + scr3));
		
		int scr4 = (scr1 + scr2 + scr3);
		System.out.println("평균 : " + (scr4/3));
		
		int scr5 = scr4/3;
		if(scr5>=60) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		}
	}