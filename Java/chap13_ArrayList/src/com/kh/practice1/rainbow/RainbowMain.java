package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		/*
		 ArrayList 이용해서 빨주노초파남보
		 수정 3회 1,3,5 -> 블랙, 브라운, 그린 수정
		 더하기 2회 -> 주황, [옐로우], 파랑, [연한파랑]
		 향상된 for문 이용해서 색상 출력하기
		 최후출력 빨파보
		 */
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println("colors" + colors);
		
		//빨주노초파남보
		colors.add("빨");
		colors.add("주");
		colors.add("노");
		colors.add("초");
		colors.add("파");
		colors.add("남");
		colors.add("보");
		
//		System.out.println("전체색상 : " + colors);	
		
		//수정 3회 1,3,5 -> 블랙, 브라운, 그린 수정
		colors.set(1,  "블랙");
		colors.set(3,  "브라운");
		colors.set(4,  "그린");
		
//		System.out.println("수정 : " + colors);
		
		//더하기 2회 -> 블랙, [옐로우], 그린, [연한파랑]
		colors.add(2, "옐로우");
		colors.add(6, "연한파랑");
//		System.out.println("수정 : " + colors);
		
		//향상된 for문 이용해서 색상 출력하기
		for(String AAA : colors) {
//			System.out.println(AAA);
		}
		
		//최후출력 빨파보
		//1. 인덱스 이용해서 자리출력
		System.out.println("최후출력 : " + colors.get(0) + " " + colors.get(7) + " " + colors.get(8));
		//2. 초기화 후 출력
		
	}

}
