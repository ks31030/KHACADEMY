package com.kh.whilesample;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; //sum은 0인 상태
		System.out.println("5 이하의 정수를 입력해주세요.");
		int num = sc.nextInt(); //아직 어떤 값을 받을 지는 모름.
	
		while(sum <= 10) {
			sum += num;
			num = num + 1;
			System.out.println("num : " + num); // *질문사항
			System.out.println("sum : " + sum);
		}
		
	}

}
