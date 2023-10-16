package com.kh.practice3.func;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ssn;
		ssn = sc.nextInt();
		
		switch(ssn) {
		case 1 :
			System.out.println(ssn + "월은 겨울입니다.");
			break;
		case 2 :
			System.out.println(ssn + "월은 겨울입니다.");
			break;
		case 3 :
			System.out.println(ssn + "월은 봄입니다.");
			break;
		case 4 :
			System.out.println(ssn + "월은 봄입니다.");
			break;
		case 5 :
			System.out.println(ssn + "월은 봄입니다.");
			break;
		case 6 :
			System.out.println(ssn + "월은 여름입니다.");
			break;
		case 7 :
			System.out.println(ssn + "월은 여름입니다.");
			break;
		case 8 :
			System.out.println(ssn + "월은 여름입니다.");
			break;
		case 9 :
			System.out.println(ssn + "월은 가을입니다.");
			break;
		case 10 :
			System.out.println(ssn + "월은 가을입니다.");
			break;
		case 11 :
			System.out.println(ssn + "월은 가을입니다.");
			break;
		case 12 :
			System.out.println(ssn + "월은 겨울입니다.");
			break;
		default :
			System.out.println(ssn + "월은 잘못 입력된 달입니다.");
		}
	}

}