package com.kh.practice3.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� Ȯ��");
		int scr1, scr2, scr3;
		scr1 = sc.nextInt();
		System.out.println("���� ���� : " + scr1);
		scr2 = sc.nextInt();
		System.out.println("���� ���� : " + scr2);
		scr3 = sc.nextInt();
		System.out.println("���� ���� : " + scr3);
		
		System.out.println("�հ� : " + (scr1 + scr2 + scr3));
		
		int scr4 = (scr1 + scr2 + scr3);
		System.out.println("��� : " + (scr4/3));
		
		int scr5 = scr4/3;
		if(scr5>=60) {
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		}
	}