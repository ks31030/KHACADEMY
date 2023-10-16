package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		int choice;
		choice = sc.nextInt();
		
		/*if (choice==1) {
			System.out.println("입력메뉴입니다.");
		} else if (choice==2) {
			System.out.println("수정메뉴입니다.");
		} else if (choice==3) {
			System.out.println("조회메뉴입니다.");
		} else if (choice==4) {
			System.out.println("삭제메뉴입니다.");
		} else if(choice==7){
			System.out.println("프로그램이 종료됩니다.");
		}
		*/
		switch(choice) {
			case 1:
				System.out.println("입력");
			break;	
			case 2:
				System.out.println("수정");
				break;	
			case 3:
				System.out.println("조회");
				break;	
			case 4:
				System.out.println("삭제");
				break;	
			case 7:
				System.out.println("종료");
				break;	
			default :
				System.out.println("잘못 입력된 번호입니다.");
		}
	}

}