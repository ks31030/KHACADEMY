package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {
	// 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			
		}			
		System.out.println("sum : " + sum);
	}

}
