package com.kh.practice4.func;

import java.util.Scanner;

public class Practice8 {
	// ����ڷκ��� �Է¹��� ������ ���� ����ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���. ");
		
		int num = sc.nextInt();
		System.out.println(num + "��");//Ű����� �Է��� ���ڰ� ���� ��.
		for(int i=1; i<=9; i++) {
			int result = num*i;
			System.out.println(num + "*" + i + " = " + result);
		}

	}

}
