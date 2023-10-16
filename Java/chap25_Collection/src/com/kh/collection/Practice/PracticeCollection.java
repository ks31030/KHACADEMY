package com.kh.collection.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 for문 출력하기
		pList.add("정수기");
		pList.add("세탁기");
		pList.add("청소기");
		
		System.out.println("List : ");
		
		for(String stuff : pList) {
			System.out.println(stuff);
		}
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 for문 출력 중복된 값 add 해야 함.
		pSet.add("가");
		pSet.add("나");
		pSet.add("다");
		pSet.add("라");
		
		for(String jam : pSet) {
			System.out.println(jam);
		}
	}
	
	public void practiceMap() {
		//키와 값을 이용해서 map put한 다음 향상된 for문으로 출력하기
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("소금", 1);
		pMap.put("설탕", 2);
		pMap.put("후추", 3);
		pMap.put("식초", 4);
		pMap.put("물엿", 5);
		pMap.put("간장", 8);
		
		for(String seasoning : pMap.keySet()) {
			int spoon = pMap.get(seasoning);
			System.out.println(seasoning + " : " + spoon + "큰술");
		}
		
		
		
		
		
		
		
		
		
	}
}