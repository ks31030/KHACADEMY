package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// 1. Member의 객체를 생성
		/*
		 만약에 char 값을 넣고 싶으면 ''를 넣어 줘야 함. ex) '남'
		*/
		Member member = new Member("stay", "moon", 20, 'M', "010", "staymoon@yahoo.com");
		// 2. changeName() 값 변경
		member.changeName("뉴네임");
		// 3. printName()를 이용해 출력
		member.printName();
	}

}
