package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ChangeToString {
	public static void main(String[] args) {
		// String으로 변경 후 Array와 List 출력하기
		// Array 예제
		String[] strArray = {"철수", "영희", "영수"};
		//Array 출력
		System.out.println("Array 요소 : ");
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		//enter
		System.out.println();
		
		// List 예제
		List<String>strList = new ArrayList<>();//String 객체를 저장하는 ArrayList
		strList.add("철수");
		strList.add("영희");
		strList.add("영수");
		
		// List 출력
		System.out.println("List 요소 : ");
		for(String name : strList) {
			System.out.print(name + " ");
		}
	}

}
