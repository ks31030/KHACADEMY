package com.kh.practice4.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		 사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i=num; i>=1; i--) { //for문 안에 완성하기
					System.out.println(i);
				}
	
			}
		}
	}

