package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		//Object Ŭ���� ����

		//��ü ����
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//equals() �޼��带 ����ؼ� �� ��ü ��
		boolean isEqual = obj1.equals(obj2);
		System.out.println("obj1�� obj2�� ������ ? : " + isEqual);
		
		//hashCode()�޼ҵ带 ����Ͽ� ��ü�� �ؽ��ڵ� ���
		int hashcode1 = obj1.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj1�� �ؽ��ڵ� : " + hashcode1);
		System.out.println("obj2�� �ؽ��ڵ� : " + hashcode2);
		
		//toString() �޼��带 ����Ͽ� ��ü�� ���ڿ��� ǥ��
		String objString1 = obj1.toString();
		String objString2 = obj2.toString();
		System.out.println("obj1�� ���ڿ� ǥ�� : " + objString1);
		System.out.println("obj2�� ���ڿ� ǥ�� : " + objString2);
		
		//getClass() �޼��带 ����Ͽ� ��ü�� Ŭ���� ���� ���
		Class<?> classOfObj1 = obj1.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("obj1�� Ŭ���� : " + classOfObj1.getName());
		System.out.println("obj2�� Ŭ���� : " + classOfObj2.getName());
	}

}
