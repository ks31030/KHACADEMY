package com.kh.superSample;
//상속 받아서 super() super. 차이점 확인
/*
 super = 부모클래스의 변수나 메서드에 접근하기 위해 사용.
 super() = 부모클래스의 생성자를 호출하기 위해 사용.
 			서브클래스의 생성자에서 첫번째 줄에 호출 되어야 함.
 */
public class Parent {
	String name;
	
	Parent(){
		System.out.println("부모클래스의 기본 생성자입니다.");
	}
	
	Parent(String name){
		this.name = name;
		System.out.println("부모클래스의 문자열 파라미터 생성자입니다. 이름 : " + name);
	}
	
	public void show() {
		System.out.println("부모클래스의 show 메서드입니다. ");
	}
	
	
	
	
}
