package com.kh.practice4.func;

import java.util.Scanner;

public class Practice6 {
	// 사용자로부터 두개의 값을 입력받아 그 사이의 숫자를 모두 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int start = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int end = sc.nextInt();
		
	
		int reStart = end;//end가 start보다 작을 때 reStart로 넣어준다.
		int reEnd = start;//start가 end보다 클 때 reEnd로 넣어준다.
		
		if(start < end) {
			System.out.println(start + "부터" + end + "까지 숫자 : ");
		
		for(int i = start; i<=end; i++) {
			System.out.println(i);
		}
		}
		else if (reStart < reEnd) {
			System.out.println(reStart + "부터 " + reEnd + "까지의 숫자 : ");
			for(int i = reStart; i<=reEnd; i++) {
				System.out.println(i);
			}
		}
	}
}




/*
 int reStart, reEnd;
 if(start < end){
 int reStart = start;
 int reEnd = end;
 } else if (end < start) {
 int reStart = end;
 int reEnd = start;
 
 System.out.println(reStart + "부터 " + reEnd + "까지의 숫자 : ");
 
 } 
 */
	
	/*
	 
	 */
 