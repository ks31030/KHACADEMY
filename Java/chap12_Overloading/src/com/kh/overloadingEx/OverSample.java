package com.kh.overloadingEx;
/*
java ������ ����µ�
OverSample.java �����
�����ε� 5�� ����� �޼��� 5�� ����ϱ�
*/

//������ ����
//������ ������ ����
//������ �Ǽ��� ������
//�װ��� ������ ����
//�ΰ��� �Ǽ��� ����
public class OverSample {
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}
	public int mul(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	public int mul(int a, int b, int c, int d, int e) {
		return a*b*c*d*e;
	}
	public int mul(int a, int b, int c, int d, int e, int f) {
	return a*b*c*d*e*f;
	}
	
	
	
	public static void main(String[] args) {
		OverSample obj = new OverSample();
		
		//�޼��� ȣ��
		System.out.println(obj.mul(10, 20));
		System.out.println(obj.mul(10, 20, 30));
		System.out.println(obj.mul(10, 20, 30, 40));
		System.out.println(obj.mul(10, 20, 30, 40, 50));
		System.out.println(obj.mul(10, 20, 30, 40, 50, 60));
		
	}

}
