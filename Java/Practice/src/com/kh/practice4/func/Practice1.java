package com.kh.practice4.func;

import java.util.Scanner;

public class Practice1 {
	/*
	  1�� ����.
	  ����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
	  ��, �Է��� ���� 2���� ���� ��� "�߸� �Է��ϼ̽��ϴ�."�� ����ϼ���.
	  ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���."�� ����ϼ���.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");//�Ѱ��� ���� �Է¹޴´�.
		int num = sc.nextInt();//����ڷκ��� �Է¹��� �� �ִ� ����
		
		if(num<1) {//���� 1 �̸��� ���ڰ� �Էµƴٸ�
			//"1 �̻��� ���ڸ� �Է����ּ���."�� ���
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {//1 �̻��� ���ڸ� ���´�.
			//1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
			for (int i=1; i<=num; i++) {
				System.out.println(i + " ");
			}
		}
	}

}
