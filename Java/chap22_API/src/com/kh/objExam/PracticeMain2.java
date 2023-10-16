package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		pm.practice1();
		pm.practice2();
		
	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb1 = new StringBuffer();
		sb1.append("¿À´Ã ");//Àú³áÀº ¹¹ ¸ÔÁö
		sb1.append("Àú³áÀº ¹¹ ¸ÔÁö");
		//µ¡ºÙÀÎ ÈÄ Ãâ·Â
		System.out.println(sb1);
		}
		
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â ¿À´Ã Àú³áÀº ¹¹ ¸ÔÁö
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀº ¹¹ ¸ÔÁö");
		//¹®ÀÚ¿­ »ğÀÔ
		str.replace(3,5, "¾ß½Ä");
		System.out.println(str.toString());
		//¹®ÀÚ¿­ µÚÁı±â
		str.reverse();
		System.out.println(str.toString());

		}
		
	}
