package com.kh.patternMVC;
/*
1. 학생 정보 표현
private 이름 나이
getter setter
*/
public class UserModel {
	private String name;
	private int age;
	
	public UserModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("유저 모델입니다.");
	}

}
