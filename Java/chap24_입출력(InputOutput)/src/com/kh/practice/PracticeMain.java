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
	
	public void practice1() {//경로 설정해서 파일 만들기
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop//Java.txt");
			//파일 쓰기
			w.write("Java 자바쓰");
			//파일 닫기
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		//폴더를 만들고 폴더 안에 파일 만들기
		//파일 안에 내용 작성하기
		// windows : \
		// Linux or MAC : /
		// File.separator
		String fp = ("C:\\Users\\user1\\Java_Workspace\\eheheheheh");//원하는 경로 설정
		//폴더 만들기
		File f = new File(fp);
		//exists 이미 존재하는지 확인
		if(!f.exists()) {
			f.mkdir();//make directory - 폴더, 카테고리
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\user1\\Java_Workspace\\Gerard");
			fw.write("제라드 골");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
