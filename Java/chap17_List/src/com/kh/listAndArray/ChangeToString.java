package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ChangeToString {
	public static void main(String[] args) {
		// String���� ���� �� Array�� List ����ϱ�
		// Array ����
		String[] strArray = {"ö��", "����", "����"};
		//Array ���
		System.out.println("Array ��� : ");
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
		//enter
		System.out.println();
		
		// List ����
		List<String>strList = new ArrayList<>();//String ��ü�� �����ϴ� ArrayList
		strList.add("ö��");
		strList.add("����");
		strList.add("����");
		
		// List ���
		System.out.println("List ��� : ");
		for(String name : strList) {
			System.out.print(name + " ");
		}
	}

}
