package com.kh.classSample;
//Student 객체 생성
public class Student {
	
	//1. 멤버 변수 (학생의 속성)
	String name;
	int age;
	String grade;
	
	/**    생성자    (생성자는 메서드 중 일부)**/
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void displayInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 학년 : " + grade);
	}
}
