package com.kh.variable;
public class VariableConversion {
	public static void main(String[] args) {
		//1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
	/*
		int intNum = 100;
		System.out.println(intNum);//���� 100�� �ǹ�.
		long longNum = intNum; //int�� long���� �ڵ�����ȯ.
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float�� double�� �ڵ�����ȯ.
		
		// int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�.
		int intNum1 = 999;
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum2 = 555;
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		// short -> int �����ϴ� ����ȯ 1���� ����� ����ϱ�.
		short shortNum1 = 112;
		int intNum3 = shortNum1;
		System.out.println(intNum3);
		//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�.
		float floatNum2 = 1212.13f;
		double doubleNum2 = floatNum2;
		System.out.println(doubleNum2);
		
		//2. ���������ȯ(��������ȯ)
		//long -> int
		long largeLong = 12345L;
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt);//long�� int�� ��������ȯ�� ��� ���� ���� �ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ��������ȯ�� ��� '���� �κи� ����'�ȴ�.
		*/
		//���ڿ� ���� ���� ����ȯ 2���� ����ϱ�.
		//���ڴ� char charValue ='Z'; -> int�� ����.
		char charValue = 'Z';
		int intValue = charValue;
		System.out.println(intValue);
		
		int intValue2 = 65;
		char charValue2 = (char) intValue2;
		System.out.println(charValue2);
		//double -> int�� ����ȯ 1���� ����ϱ�.
		double doubleValue = 3.14;
		int intValue3 = (int) doubleValue;
		System.out.println(intValue3);
		//int -> short�� ����ȯ 1���� ����ϱ�.
		int intValue4 = 123;
		short shortValue = (short) intValue4;
		System.out.println(shortValue);
		
		
	}
}
