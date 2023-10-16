package com.kh.personMVC;

import java.util.Scanner;

public class PersonView {

	public String getNameInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		return sc.next();
	}
	
	public String getHobbyInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("취미을 입력하세요 : ");
		return sc.next();
	}
}