package com.kh.finalSample;

import java.io.FileWriter;

public class FileOMain {
	public static void main(String[]  args) {
		
		try {
			FileWriter fw = null;
								//�ι�° ������ ���� boolean true �����Ǹ� �ش� ���Ͽ� �̾��.
			fw = new FileWriter("file.txt",true);
			fw.write("1000");
			fw.write("10000");
			fw.close();
		} catch (Exception e) {//Exception�� ��� �����ϴ� ����.
			e.printStackTrace();
		}
	}
}
	