package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		/*
		//만약에 날짜가 오늘 날짜인 폴더가 없을 때 폴더를 만들고
		
		String filePath = "설명작성란/입출력 IO.txt";
		System.out.println("생성");
		//FileWriter fWriter = new FileWriter(filePath, true);
		//true : 파일 끝에 이어 쓰기
		//false : 파일 덮어 쓰기
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("파일을 생성했습니다.");
			} else {
				System.out.println("이미 존재하는 파일입니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String fileName = f.getName();
		//FileReader fReader = new FileReader(f);
		*/
		try{
			FileWriter writer = new FileWriter("abcde.txt");
			writer.write("파일 덮어 써지는지 테스트");//파일 쓰기
			writer.close();//파일 안에 내용을 다 쓰면 닫기
			
			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();//파일을 다 읽으면 닫아 주기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
