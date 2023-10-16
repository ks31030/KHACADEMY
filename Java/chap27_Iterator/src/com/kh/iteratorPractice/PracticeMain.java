package com.kh.iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		// ArrayList 생성 및 요소 추가
		ArrayList<String> sport = new ArrayList<>();
		sport.add("태권도");
		sport.add("야구");
		sport.add("씨름");
		sport.add("유도");
		sport.add("축구");
		
		//Iterator 생성
		Iterator<String> iter = sport.iterator();
		
		//Iterator를 사용하여 요소 반복
		while(iter.hasNext()) {
			String sports = iter.next();
			System.out.print(sports + " ");
		}

	}

}
