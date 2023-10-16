package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		// �̹��� ���� jpg �Ǵ� png ������ ����ȭ�鿡 ������ �� ����ȭ�鿡 ������ ���� ���� �ȿ� ������ �̹��� �����ϱ�!
		//����ȭ�鿡 ������ ����
		String newFolder = "C:\\Users\\user1\\Desktop\\lookAtThisFile";
		File nF = new File(newFolder);

		nF.mkdirs(); //mkdirs�� ���� �߻� - nF�� newFolder�� �߸� �־��� ����.
		
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";//�̹��� ���� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
		String outputFile = "C:\\Users\\user1\\Desktop\\lookAtThisFile\\hackcute.jpg";//���� �ȿ� ������ �̹��� �����ϱ�
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];//1024 ����Ʈ ũ���� ����
			int byteRead;
//			int byteRead : fis.read(buffer) �޼��带 ȣ���Ͽ� ���۷� �о� ���� ����Ʈ ���� �����ϴ� ���� ����.
			
//			������ �а� �����ϴ� ���� ����.
//			fis.read(buffer) ���Ͽ��� �����͸� �о� ���̰�
//			fos.write(buffer,0,byteRead) �о� ���� �����͸� �����.
//			������ ���� �����ϸ� -1 ��ȯ�ϸ鼭 while ����!
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�.");//���簡 ����� �Ǿ����� Ȯ���ϰ��� �ִ� �ڵ� ���.
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
