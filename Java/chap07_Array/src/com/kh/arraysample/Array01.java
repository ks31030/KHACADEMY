package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		// ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��.
		/*
		 ������ ������ Ÿ���� ���� ���� ���� �Ѱ��� �����ϰ� �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����.
		 �迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴ� �� ���.
		 �������� ������ ���� �ٷ� �� �ֵ��� ������.
		 �迭�� ������
		 	�迭 ���� �� �ʱ�ȭ
		 	�ڷ���[] �迭�̸� = new �ڷ���[ũ��];
		 
		 Ư¡ :
		 1. ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����Ǿ�����.
                       ���� �� ũ�⸦ ������ �� ����.
	     2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ �Ѵ�.
	     				   ex) int Ÿ���� �迭�� ��� ��Ұ� ����.
		 3. index ��� ���� : �� �迭 ��Ҵ� �������� index�� ������ 0���� �����ؼ� �迭ũ�� -1������ ���� ����.
		 				   index�� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ����.
		 				   ex) �迭ũ�� = 5�� ��ٸ� index�� 0~4
	     4. �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�.
	
		*/
		
		int score1, score2, score3, score4, score5;
		//score�� 5������ ���߿� score 1000�����? -> �迭���.
		//int Ÿ�� �迭 ����.
		
		String[] stringArray = new String[4];
		//String[] stringArray = {"","","",""};
				
				//�ڸ���ȣǥ       0     1    2     3     4
		String[] nameArray = {"ö��","����","����","����","��ö"};
		
		String[] stringArray1 = new String[4];
		stringArray1[0] = "��";
		System.out.println("stringArray : " + stringArray1[0]);//1
		stringArray1[1] = "��";
		System.out.println("stringArray : " + stringArray1[1]);//2
		stringArray1[2] = "��";
		System.out.println("stringArray : " + stringArray1[2]);//3
		stringArray1[3] = "��";
		System.out.println("stringArray : " + stringArray1[3]);//4
		//{��, ��, ��, ��}
		//System.out.println("stringArray : " + stringArray1[4]);//5 �������� ���� �ڸ��� ����(null)�� ��.
		String[] food = {"����", "����", "����", "����"}; //index 3��¥��
		int foodLength = food.length;
		System.out.println("food �迭�� ���� : " + foodLength);
		
		
		
		
		/*int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		System.out.println(score[0]); //[I@5e91993f
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		//index 0~4���� �����
		//�迭�� int 5���� ����.
		for(int i = 0; i <5; i++) {
			arr[i]= sc.nextInt();
			System.out.println(arr[i]);
		}
		*/
	}

}
