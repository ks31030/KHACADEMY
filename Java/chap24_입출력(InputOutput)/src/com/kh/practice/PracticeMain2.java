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
	//폴더 연속으로 2개 만들기 Desktop\이름1\이름2
	public void Practice1() {
		String nameFile = "C:\\Users\\user1\\Desktop\\kim\\seok";
		File nf = new File(nameFile);
		
		if(!nf.exists()) {
			nf.mkdir();//make directory - 폴더, 카테고리
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
	}
	//폴더 연속으로 3개 만들기 Java_Workspace\chap25_
	public void Practice2() {
		String nameFile = "C:\\Users\\user1\\Java_Workspace\\chap25_\\왜안돼\\되잖아";
		File nf = new File(nameFile);
		if(!nf.exists()) {
			nf.mkdir();//make directory - 폴더, 카테고리
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		nf.mkdirs();
//		try {
//			FileWriter w = new FileWriter("C:\\\\Users\\\\user1\\\\Java_Workspace\\\\chap25_\\ch\\ap");
//			w.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		필요가 없는 구문임. 여기서 파일에 무언가를 쓰는 것이 아니라 단순히 폴더만 만드는 것이기 때문에 try-catch 구문 사용 불필요!!		
	}
	//폴더 연속으로 5개 만들기 Documents\myPlace\Music\Korean\kPop\Group
	public void Practice3() {
		String nameFile = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPop\\Group";
		File nf = new File(nameFile);
		if(!nf.exists()) {
			nf.mkdir();//make directory - 폴더, 카테고리
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		nf.mkdirs();
	}
}
