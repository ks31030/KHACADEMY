package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		
		str = sc.next();
		str.charAt(0);
		System.out.println("ù��° ���� : " + str.charAt(0));
		str.charAt(1);
		System.out.println("�ι�° ���� : " + str.charAt(1));
		str.charAt(2);
		System.out.println("����° ���� : " + str.charAt(2));
	}

}
/*
 char chr = str.charAt(0); ���ڸ� 1�ھ� ����
 ���ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� �� ����.
 �ڸ� ��ġ ���ؼ� ����ϱ�
 
 String str = s.substring(indexnum);
 ���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����.
 ���۸� ���ص� �ǰ� ���� �����ص� ��.
 ���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�.
 */