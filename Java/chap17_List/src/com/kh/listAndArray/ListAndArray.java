package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();//ListArray1�� static �޸𸮿� ����Ǿ� �ֱ� ������ �ܼ��ϰ� ȣ���� �� ����.
		System.out.println();
		
		ListAndArray LA2 = new ListAndArray();
		LA2.ListArray2();
		
		// Array ����
	}
	//public void ListArray1() {
	public static void ListArray1() {
		int[] intArray = new int[2]; //ũ�Ⱑ 5�� ���� �迭 ����.
		intArray[0] = 1;
		intArray[1] = 2;
		
		//Array ���
		System.out.print("Array ��� : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		
		System.out.println(); //���๮�� ���ԵǾ� �־� enter���� ����.
		// List ����
		List<Integer>intList = new ArrayList<>(); //Integer ��ü�� �����ϴ� ArrayList
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
	
	//List ���
		System.out.print("List ��� : ");
		for(int num : intList) {
			System.out.print(num + " ");
		}
	
	}
	public void ListArray2() {
		String[] strArray = {"1", "2"};
		System.out.print("Array ��� : ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println();
		
		List<String>strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		
		System.out.print("List ��� : ");
		for(String num : strList) {
			System.out.print(num + " ");
		}

	}
	

}
