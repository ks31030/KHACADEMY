package com.kh.genericsPractice;

import java.util.ArrayList;

import com.kh.genericsMain.Book;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
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
		//Box 객체를 com.kh.genericsPractice; 밑에 생성
		//정수형 데이터를 저장하는 Box 인스턴스 생성
		//문자열 데이터를 저장하는 Box 인스턴스 생성
		//각각 출력
		//향상된 for문 이용해서 값 모두 출력
		
		//정수형 데이터를 저장하는 Box 인스턴스 생성
		Box<Integer> intBox = new Box<>();
		intBox.put(5);
		intBox.put(1);
		intBox.put(3);
		int intValue = intBox.get();
		
		//문자열 데이터를 저장하는 Box 인스턴스 생성
		Box<String> strBox = new Box<>();
		strBox.put("Python");
		strBox.put("Java");
		strBox.put("C");
		String strValue = strBox.get();
		
		//각각 출력
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		
		//향상된 for문 이용해서 값 모두 출력
//		for(String lang : strBox) {
//			System.out.println(lang);
//		}
	}
	
}
