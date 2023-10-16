package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chap28_Comparator.ComparatorMain;

public class User {

	public static void main(String[] args) {
		//List ArrayList 생성 Comparator 정리
		List<String> user = new ArrayList<>();
		user.add("Yubi");
		user.add("Jojo");
		user.add("Gwanwoo");
		user.add("Jojaryong");
		user.add("Jegallyang");
		
		Collections.sort(user, new ComparatorMain());
		
		for(String n : user) {
			System.out.println(n);
		}
	}

}
