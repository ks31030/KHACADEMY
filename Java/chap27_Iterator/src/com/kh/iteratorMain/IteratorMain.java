package com.kh.iteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
 Iterator
  컬렉션(데이터그룹)을 반복(Iterator)하면서 요소에 접근하는 데 사용되는 인터페이스.
  다양한 컬렉션 유형(ArrayList, HashSet 등)에 사용할 수 있음.
  컬렉션의 요소를 읽고 삭제하는 데 사용.
  컬렉션의 크기나 내부 구조에 관계 없이 요소에 접근할 수 있음.
 */
	public static void main(String[] args) {
		//ArrayList 생성 및 요소 추가
		ArrayList<String> music = new ArrayList<>();
		music.add("피아노");
		music.add("힙합");
		music.add("바이올린");
		
		//Iterator 생성
		Iterator<String> iter = music.iterator();
		
		//Iterator를 사용하여 요소 반복
		while(iter.hasNext()) {
			String music1 = iter.next();
			System.out.println(music1);
		}
		
		//Iterator 사용하여 요소 삭제.
		iter = music.iterator(); //다시 iterator 초기화
		while(iter.hasNext()) {
			String music1 = iter.next();
			//만약 바이올린이 들어오면 삭제하길 원함.
			if(music1.equals("바이올린")){
				iter.remove();
			}
			System.out.println(music1);
		}
		
		//삭제 후 ArrayList 출력
		System.out.println("삭제 후 출력");
		for(String a : music) {
			System.out.println(a);
		}
	}
 
}
