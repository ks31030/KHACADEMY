package com.kh.practice3.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Ѱ� �Է��ϼ��� : ");
		int num;
		num = sc.nextInt();
		if (num%2==0 && num>0) {
			System.out.println("¦����.");
		} else if (num%2==1) {
			System.out.println("Ȧ����.");
		} else if (num<=0){
			System.out.println("����� �Է����ּ���.");
		} else {
			
		}
	}

}