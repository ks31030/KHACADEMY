package com.kh.example.practice4.model.vo;
/*
 - grade : int
- classroom : int
- name : String
- height : double
- gender : char
+ Student()
+ information() : void
 */
public class Student {
	
	//1. 멤버 변수
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}	
	public String getName() {
		return name;
	}	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2. 생성자
	public Student(int grade, int classroom, String name, double height, char gender) {
		//초기화 블록을 이용해 각 필드 초기화 초기화블록{}
		{
		 grade = 1;
		 classroom = 2;
		 name = "박성철";
		 height = 180.5;
		 gender = '남';
		}
	}
	//3. 출력 메서드 + information() : void
	public void information() {
		 System.out.println(grade + "학년 " + classroom + "반 " + name + " " + height + "cm인 " + gender + "자입니다.");
	}

}
