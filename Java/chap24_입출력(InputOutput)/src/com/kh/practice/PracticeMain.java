package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {//��� �����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop//Java.txt");
			//���� ����
			w.write("Java �ڹپ�");
			//���� �ݱ�
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		//������ ����� ���� �ȿ� ���� �����
		//���� �ȿ� ���� �ۼ��ϱ�
		// windows : \
		// Linux or MAC : /
		// File.separator
		String fp = ("C:\\Users\\user1\\Java_Workspace\\eheheheheh");//���ϴ� ��� ����
		//���� �����
		File f = new File(fp);
		//exists �̹� �����ϴ��� Ȯ��
		if(!f.exists()) {
			f.mkdir();//make directory - ����, ī�װ�
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\user1\\Java_Workspace\\Gerard");
			fw.write("����� ��");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
