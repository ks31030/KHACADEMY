package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
	}
	//���� �������� 2�� ����� Desktop\�̸�1\�̸�2
	public void Practice1() {
		String nameFile = "C:\\Users\\user1\\Desktop\\kim\\seok";
		File nf = new File(nameFile);
		
		if(!nf.exists()) {
			nf.mkdir();//make directory - ����, ī�װ�
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
	}
	//���� �������� 3�� ����� Java_Workspace\chap25_
	public void Practice2() {
		String nameFile = "C:\\Users\\user1\\Java_Workspace\\chap25_\\�־ȵ�\\���ݾ�";
		File nf = new File(nameFile);
		if(!nf.exists()) {
			nf.mkdir();//make directory - ����, ī�װ�
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		nf.mkdirs();
//		try {
//			FileWriter w = new FileWriter("C:\\\\Users\\\\user1\\\\Java_Workspace\\\\chap25_\\ch\\ap");
//			w.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		�ʿ䰡 ���� ������. ���⼭ ���Ͽ� ���𰡸� ���� ���� �ƴ϶� �ܼ��� ������ ����� ���̱� ������ try-catch ���� ��� ���ʿ�!!		
	}
	//���� �������� 5�� ����� Documents\myPlace\Music\Korean\kPop\Group
	public void Practice3() {
		String nameFile = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPop\\Group";
		File nf = new File(nameFile);
		if(!nf.exists()) {
			nf.mkdir();//make directory - ����, ī�װ�
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		nf.mkdirs();
	}
}
