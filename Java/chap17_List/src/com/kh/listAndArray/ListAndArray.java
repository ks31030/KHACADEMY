package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();//ListArray1는 static 메모리에 저장되어 있기 때문에 단순하게 호출할 수 있음.
		System.out.println();
		
		ListAndArray LA2 = new ListAndArray();
		LA2.ListArray2();
		
		// Array 예제
	}
	//public void ListArray1() {
	public static void ListArray1() {
		int[] intArray = new int[2]; //크기가 5인 정수 배열 생성.
		intArray[0] = 1;
		intArray[1] = 2;
		
		//Array 출력
		System.out.print("Array 요소 : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		
		System.out.println(); //개행문자 포함되어 있어 enter같은 역할.
		// List 예제
		List<Integer>intList = new ArrayList<>(); //Integer 객체를 저장하는 ArrayList
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
	
	//List 출력
		System.out.print("List 요소 : ");
		for(int num : intList) {
			System.out.print(num + " ");
		}
	
	}
	public void ListArray2() {
		String[] strArray = {"1", "2"};
		System.out.print("Array 요소 : ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		System.out.println();
		
		List<String>strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		
		System.out.print("List 요소 : ");
		for(String num : strList) {
			System.out.print(num + " ");
		}

	}
	

}
