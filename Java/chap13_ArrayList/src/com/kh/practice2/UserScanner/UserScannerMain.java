package com.kh.practice2.UserScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		/*
		  ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
		  ���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���. 
		 */
		//���� �Է¹޴� Scanner �����
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���.");
		int[] numbers = new int[5];
		//�迭���ٰ� 5���� ������ �Է��ϴ� for��
		for(int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
			//ArrayList ��� colors.get(0)
			//�迭�� [] �ȿ� ����.
			//�迭�� �ڸ� ���� ����� ��߰ڴ�.
			//�ٱ��� int numbers�� �迭�� ����� �����!
		}
		//�迭�� ��� ��Ҹ� ���� ��� ���
		//������ �������� ���ϴ� ���̱� ������ ����for�� ���
		//�Ǵ� �⺻ for�� ����ϰ� �ʹٸ� length �̿��ؼ� ��� ����.
		// 	   ����1����    ��ü����
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//�ջ�� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : " + sum);
	
	}

}
