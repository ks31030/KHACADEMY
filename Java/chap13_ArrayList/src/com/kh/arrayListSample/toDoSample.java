package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		/*
		 ArrayList 이용해서
		 할일 3개 만들고
		 2개 수정하고
		 1개 지우고
		 전부 다 삭제하기
		 */
		//ArrayList 이용해서
		ArrayList<String> toDo = new ArrayList<>();
		System.out.println("할일 : " + toDo);
		//할일 3개 만들고
		toDo.add("귀가");
		System.out.println("귀가 추가 : " + toDo);
		toDo.add("식사");
		System.out.println("식사 추가 : " + toDo);
		toDo.add("숙면");
		System.out.println("숙면 추가 : " + toDo);
		
		toDo.set(2, "음주");
		toDo.set(1, "약속");
		System.out.println("수정 체크 : " + toDo);
		
		toDo.remove(0);
		System.out.println("귀가 제거 확인 : " + toDo);
		
		//ArrayList 순회해서 요소출력
		System.out.println("할일 목록");
		for(String toDoThing : toDo) {
			System.out.println(toDoThing);
		}
		
		toDo.clear();
		System.out.println("모든 할일 제거 : " + toDo);
		
	}

}
