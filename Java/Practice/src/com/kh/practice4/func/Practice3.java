package com.kh.practice4.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		 ����ڷκ��� �Ѱ��� ���� �Է¹޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		 ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
				for (int i=num; i>=1; i--) { //for�� �ȿ� �ϼ��ϱ�
					System.out.println(i);
				}
	
			}
		}
	}

