package com.kh.practice4.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 "1 이상의 숫자를 입력해주세요." 가 출력 되면서 다시 사용자가 값을 입력하도록 하세요. 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 1.조건 값 만들기 boolean 변수 = true or false;
		boolean isTrue = true;
		while(isTrue) { // 2. 조건 만들기
		if(num<1) {//1 이상인 숫자만 들어온다.
			System.out.println("1 이상의 숫자를 입력해주세요.");
			break;
		} else {
			for (int i=1; i<=num; i++) {
				System.out.println(i);
			}
			// 3. 조건 false 만들기
			isTrue = false;
			break; //if문이나 switch문에서 사용할 수 있다.
		}
	  }
	}		
}
