package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
		/*
		 동일한 데이터 타입을 가진 여러 값을 한곳에 저장하고 인덱스를 사용하여 각 값에 접근할 수 있도록 제공.
		 배열은 프로그램에서 데이터를 보다 효율적으로 저장하고 관리하는 데 사용.
		 데이터의 집합을 쉽게 다룰 수 있도록 도와줌.
		 배열의 구조는
		 	배열 생성 및 초기화
		 	자료형[] 배열이름 = new 자료형[크기];
		 
		 특징 :
		 1. 고정된 크기 : 생성할 때 크기가 결정되고, 크기가 고정되어있음.
                       생성 후 크기를 변경할 수 없음.
	     2. 같은 데이터 타입 : 배열 내에 모든 요소는 동일한 데이터 타입을 가져야 한다.
	     				   ex) int 타입의 배열은 모든 요소가 정수.
		 3. index 기반 접근 : 각 배열 요소는 순차적인 index를 가지며 0부터 시작해서 배열크기 -1까지의 값을 가짐.
		 				   index를 사용해서 특정 위치에 있는 요소 접근 가능.
		 				   ex) 배열크기 = 5로 줬다면 index는 0~4
	     4. 배열의 길이(length) : 배열의 길이를 알 수 있다.
	
		*/
		
		int score1, score2, score3, score4, score5;
		//score가 5개지만 나중에 score 1000개라면? -> 배열사용.
		//int 타입 배열 생성.
		
		String[] stringArray = new String[4];
		//String[] stringArray = {"","","",""};
				
				//자리번호표       0     1    2     3     4
		String[] nameArray = {"철수","영희","영수","수희","영철"};
		
		String[] stringArray1 = new String[4];
		stringArray1[0] = "가";
		System.out.println("stringArray : " + stringArray1[0]);//1
		stringArray1[1] = "나";
		System.out.println("stringArray : " + stringArray1[1]);//2
		stringArray1[2] = "다";
		System.out.println("stringArray : " + stringArray1[2]);//3
		stringArray1[3] = "라";
		System.out.println("stringArray : " + stringArray1[3]);//4
		//{가, 나, 다, 라}
		//System.out.println("stringArray : " + stringArray1[4]);//5 지정하지 않은 자리는 에러(null)가 뜸.
		String[] food = {"과자", "과일", "음식", "삼겹살"}; //index 3개짜리
		int foodLength = food.length;
		System.out.println("food 배열의 길이 : " + foodLength);
		
		
		
		
		/*int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		System.out.println(score[0]); //[I@5e91993f
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		//index 0~4까지 만들기
		//배열은 int 5개를 생성.
		for(int i = 0; i <5; i++) {
			arr[i]= sc.nextInt();
			System.out.println(arr[i]);
		}
		*/
	}

}
