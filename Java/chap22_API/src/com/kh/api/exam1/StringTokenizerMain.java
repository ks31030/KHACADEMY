package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ���
 						�־��� ������(�⺻:����)�� ������� ���ڿ��� ��ū���� �и�
 */
	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
//		stm.stExam1();
//		stm.stExam2();
//		stm.stExam3();
//		stm.stExam5();
//		stm.stExam6();
		stm.stringToMath();
	}
	public void stExam1() {
		String text="apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		//Tokenizer.
		//hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam3() {
		//- �����ڸ� ����ؼ� text ����� - �����ڷ� ��� ����ϱ�.
		String text = "apple, banana, grape, orange";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam5() {
	//Ư�� �ܾ� �����ϰ� �����ڷ� �и�
	String text = "This is a test. But not a real one.";
	StringTokenizer tokenizer = new StringTokenizer(text, " ,");
	
	while(tokenizer.hasMoreTokens()) {
		String word = tokenizer.nextToken();
		if(!word.equals("test")) {
			System.out.println(word);
			}
		}
	}
	public void stExam6() {
		//��¥ �����ڷ� �и�
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date, "-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("Year : " + year);
		System.out.println("Month : " + month);
		System.out.println("Day : " + day);
	}
	public void stringToMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")) {
				System.out.println("Number : " + token);
			}
		}
	}
}