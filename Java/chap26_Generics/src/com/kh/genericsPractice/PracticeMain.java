package com.kh.genericsPractice;

import java.util.ArrayList;

import com.kh.genericsMain.Book;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {
		ArrayList<Integer>intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		ArrayList<String>strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		strList.add("People");

		printList(strList, intList);
	}

	private void printList(ArrayList<String> strList, ArrayList<Integer> intList) {
		// TODO Auto-generated method stub
		
	}

	public void practice2() {
		//Box ��ü�� com.kh.genericsPractice; �ؿ� ����
		//������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		//���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		//���� ���
		//���� for�� �̿��ؼ� �� ��� ���
		
		//������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		Box<Integer> intBox = new Box<>();
		intBox.put(5);
		intBox.put(1);
		intBox.put(3);
		int intValue = intBox.get();
		
		//���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		Box<String> strBox = new Box<>();
		strBox.put("Python");
		strBox.put("Java");
		strBox.put("C");
		String strValue = strBox.get();
		
		//���� ���
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		
		//���� for�� �̿��ؼ� �� ��� ���
//		for(String lang : strBox) {
//			System.out.println(lang);
//		}
	}
	
}
