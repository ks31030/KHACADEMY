package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������ �������ּ���.");
		//int fruit = 3;
		int fruit = sc.nextInt();
		
		switch (fruit) {
			case 1:
			System.out.println("���");
			break;
			case 2:
			System.out.println("����");
			break;
			default :
			System.out.println("�߸��� �����Դϴ�.");
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �������ּ���.");
		int snack = sc.nextInt();
		
		switch (snack) {
			case 1:
				System.out.println("�����");
			break;
			case 2:
				System.out.println("�����佺");
			break;
			case 3:
				System.out.println("��īĨ");
			break;
			default :
				System.out.println("�ش� ǰ���� �����ϴ�. �ٽ� ����ּ���.");
		}
		
		
		
		/*
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ���̽�ī���ī");
		System.out.println("3. ���̽�Ƽ");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("���̽�ī���ī �ֹ��ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("���̽�Ƽ �ֹ��ϼ̽��ϴ�.");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
			
		}
		*/
	}

}
