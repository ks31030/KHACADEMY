package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //��ĳ�� ���
		
		Calculator cal = new Calculator(); //������� ����
		System.out.println("�ڡڡڼ��� 2�� �Է��Ͽ� ��Ģ���� �� ���ϱ�ڡڡ�");
		System.out.println();
		
		int num1, num2; //��ü�����ƴ�!
		 
		System.out.print("ù��° ���� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		num2 = sc.nextInt();
		System.out.println();
		 
		int result1 = cal.add(num1, num2);
		int result2 = cal.substruct(num1, num2);
		int result3 = cal.multiply(num1, num2);
		int result4 = cal.divide(num1, num2);
		int result5 = cal.mod(num1, num2);
		
		System.out.println("Add : " + result1);
		System.out.println("Substruct : " + result2);
		System.out.println("Multiply : " + result3);
		System.out.println("Divide : " + result4);
		System.out.println("Mod : " + result5);
	}

}
