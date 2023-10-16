package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		/*
		//���࿡ ��¥�� ���� ��¥�� ������ ���� �� ������ �����
		
		String filePath = "�����ۼ���/����� IO.txt";
		System.out.println("����");
		//FileWriter fWriter = new FileWriter(filePath, true);
		//true : ���� ���� �̾� ����
		//false : ���� ���� ����
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("������ �����߽��ϴ�.");
			} else {
				System.out.println("�̹� �����ϴ� �����Դϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String fileName = f.getName();
		//FileReader fReader = new FileReader(f);
		*/
		try{
			FileWriter writer = new FileWriter("abcde.txt");
			writer.write("���� ���� �������� �׽�Ʈ");//���� ����
			writer.close();//���� �ȿ� ������ �� ���� �ݱ�
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();//������ �� ������ �ݾ� �ֱ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
