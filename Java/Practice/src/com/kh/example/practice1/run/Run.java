package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// 1. Member�� ��ü�� ����
		/*
		 ���࿡ char ���� �ְ� ������ ''�� �־� ��� ��. ex) '��'
		*/
		Member member = new Member("stay", "moon", 20, 'M', "010", "staymoon@yahoo.com");
		// 2. changeName() �� ����
		member.changeName("������");
		// 3. printName()�� �̿��� ���
		member.printName();
	}

}