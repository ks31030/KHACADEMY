package com.kh.practice2.UserScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		/*
		  사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
		  향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력. 
		 */
		//정수 입력받는 Scanner 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		int[] numbers = new int[5];
		//배열에다가 5개의 정수를 입력하는 for문
		for(int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
			//ArrayList 경우 colors.get(0)
			//배열은 [] 안에 넣음.
			//배열의 자리 먼저 만들어 줘야겠다.
			//바깥에 int numbers의 배열을 만들어 줘야지!
		}
		//배열의 모든 요소를 더한 결과 출력
		//조건이 최종까지 더하는 것이기 때문에 향상된for문 사용
		//또는 기본 for를 사용하고 싶다면 length 이용해서 출력 가능.
		// 	   숫자1개씩    전체숫자
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//합산된 결과 출력
		System.out.println("배열의 모든 요소를 더한 결과 : " + sum);
	
	}

}
