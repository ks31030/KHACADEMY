package com.kh.personMVC;

import java.util.Scanner;

public class PersonView {

	public String getNameInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		return sc.next();
	}
	
	public String getHobbyInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		return sc.next();
	}
}