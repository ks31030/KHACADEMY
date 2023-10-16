package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh학생1");
		//System.out.println(stKim.serialNum);
		/*
		 학교에서 학생 회원가입
		 우선 우리 학교 학생이 맞는지 확인
		 우리 학교 학생 인증키;
		 시리얼넘버를 수정해서 -> 20
		 kh학생1 20
		 kh학생2 20
		 */
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("Kh학생2");
		System.out.println("Kh stKim :");
		System.out.println(stKim.serialNum);
		System.out.println("Kh kh.Lee : ");
		System.out.println(khLee.serialNum);
	
	}
}
