package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		// 이미지 파일 jpg 또는 png 파일을 바탕화면에 저장한 후 바탕화면에 폴더를 만들어서 폴더 안에 복사한 이미지 저장하기!
		//바탕화면에 폴더를 만들어서
		String newFolder = "C:\\Users\\user1\\Desktop\\lookAtThisFile";
		File nF = new File(newFolder);

		nF.mkdirs(); //mkdirs에 오류 발생 - nF에 newFolder를 잘못 넣었기 때문.
		
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";//이미지 파일 jpg 또는 png 파일을 바탕화면에 저장한 후
		String outputFile = "C:\\Users\\user1\\Desktop\\lookAtThisFile\\hackcute.jpg";//폴더 안에 복사한 이미지 저장하기
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];//1024 바이트 크기의 버퍼
			int byteRead;
//			int byteRead : fis.read(buffer) 메서드를 호출하여 버퍼로 읽어 들인 바이트 수를 저장하는 변수 선언.
			
//			파일을 읽고 복사하는 동안 사용됨.
//			fis.read(buffer) 파일에서 데이터를 읽어 들이고
//			fos.write(buffer,0,byteRead) 읽어 들인 데이터를 출력함.
//			파일의 끝에 도달하면 -1 반환하면서 while 종료!
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
				System.out.println("파일이 복사되었습니다.");//복사가 제대로 되었는지 확인하고자 넣는 코드 블록.
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
