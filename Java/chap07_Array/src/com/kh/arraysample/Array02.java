package com.kh.arraysample;

public class Array02 {
	public static void main(String[] args) {
		//1. �迭�� ���̸� ����
		int[] num = new int[10]; //���̰� 3�� �迭 ����
		//1~10������ �ݺ����� �̿��ؼ�
		/*for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			//System.out.println(num[i]);
		}
		//������� �迭 index�� ���� �� �� ���� ���.
		for (int i = 1; i < num.length; i++) {
			System.out.println(num[i]);
			//���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ����� �̿��� �������.
			//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�.
			//��°� : 10 9 8 7 6 5 4 3 2 1
		}
		
		for(int i = 9; i < num.length; i--) {
			num[i] = i + 1;
			System.out.println(num[i]);
		
	}*/
		int[] numbers = new int[10];
		//int value = 10; //numbers.length = 10�̱� ������
		int value = numbers.length;
		//      0     0 <       10        i+1
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = value--;
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
		//2. ���̰� 5�� String �迭 ����
		//"���", "��", "����", "������", "����"�� �ʱ�ȭ�� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		
		String[] fruits = {"���", "��", "����", "������", "����"}; //String �迭 ���� �� �ʱ�ȭ
		//�� ����ϱ�
		System.out.println(fruits[1]);
		
	}
}

