package com.kh.api.exam1;

public class FormatterMain {
	/*
	 Formatter ���ڿ��� ����ȭ �ϴ� �� ���Ǵ� Ŭ����
	 �ؽ�Ʈ ����� ���ϴ� ���Ŀ� �°� �������ϰ� ���� �� �����ϰ� ���.
	 */
	public static void main(String[] args) {
		String name = "Kim";
		int age = 30;
		double salary = 50000.50;
		
		//Formatter ����Ͽ� ���ڿ��� ����ȭ
		//.2 �Ҽ��� ���� �ڸ����� �����ϴ� �� ���. �Ҽ��� ���� ���ڸ����� ���
		String formatString = String.format("�̸� : %s, ���� : %d, ���� : %.2f", name, age, salary);
		
		//����ȭ �� ���ڿ� ���
		System.out.println(formatString);
	}

}
