package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nt1, nt2;
		
		System.out.print("ù��° ���� : ");
		nt1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		nt2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (nt1 + nt2));
		System.out.println("���� ��� : " + (nt1 - nt2));
		System.out.println("���ϱ� ��� : " + (nt1 * nt2));
		System.out.println("������ �� ��� : " + (nt1 / nt2));
		System.out.println("������ ������ ��� : " + (nt1 % nt2));
		
		
	}

}
