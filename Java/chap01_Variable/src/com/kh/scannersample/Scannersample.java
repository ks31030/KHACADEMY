package com.kh.scannersample;
import java.util.Scanner;
 
public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt(); //�������� �޴� next
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		
		String name, phoneNumber;
		
		System.out.println("����� �̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.println("����� ��ȭ��ȣ�� �Է��ϼ��� : ");
		phoneNumber = sc.next(); //-�����ʱ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		*/
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		String h, f, a;
		System.out.println("����� ��̸� �Է��ϼ��� : ");
		h = sc.next();
		System.out.println("����� �����ϴ� ������ �Է��ϼ��� : ");
		f = sc.next();
		System.out.println("����� �ּҸ� �Է��ϼ��� : ");
		a = sc.next(); //������ ���� ����. �ٿ� ���� �͸� ����.
		System.out.println("����� ��̴� " + h + "�Դϴ�.");		
		System.out.println("����� �����ϴ� ������ " + f + "�Դϴ�.");		
		System.out.println("����� �ּҴ� " + a + "�Դϴ�.");		
	}
}
