package com.kh.practice4.func;

import java.util.Scanner;

public class Practice6 {
	// ����ڷκ��� �ΰ��� ���� �Է¹޾� �� ������ ���ڸ� ��� ����ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int start = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int end = sc.nextInt();
		
	
		int reStart = end;//end�� start���� ���� �� reStart�� �־��ش�.
		int reEnd = start;//start�� end���� Ŭ �� reEnd�� �־��ش�.
		
		if(start < end) {
			System.out.println(start + "����" + end + "���� ���� : ");
		
		for(int i = start; i<=end; i++) {
			System.out.println(i);
		}
		}
		else if (reStart < reEnd) {
			System.out.println(reStart + "���� " + reEnd + "������ ���� : ");
			for(int i = reStart; i<=reEnd; i++) {
				System.out.println(i);
			}
		}
	}
}




/*
 int reStart, reEnd;
 if(start < end){
 int reStart = start;
 int reEnd = end;
 } else if (end < start) {
 int reStart = end;
 int reEnd = start;
 
 System.out.println(reStart + "���� " + reEnd + "������ ���� : ");
 
 } 
 */
	
	/*
	 
	 */
 