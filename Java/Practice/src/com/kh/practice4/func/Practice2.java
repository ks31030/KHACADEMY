package com.kh.practice4.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���." �� ��� �Ǹ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		// 1.���� �� ����� boolean ���� = true or false;
		boolean isTrue = true;
		while(isTrue) { // 2. ���� �����
		if(num<1) {//1 �̻��� ���ڸ� ���´�.
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			break;
		} else {
			for (int i=1; i<=num; i++) {
				System.out.println(i);
			}
			// 3. ���� false �����
			isTrue = false;
			break; //if���̳� switch������ ����� �� �ִ�.
		}
	  }
	}		
}
