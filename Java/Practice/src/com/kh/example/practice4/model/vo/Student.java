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
	
	//1. ��� ����
	
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
	
	//2. ������
	public Student(int grade, int classroom, String name, double height, char gender) {
		//�ʱ�ȭ ����� �̿��� �� �ʵ� �ʱ�ȭ �ʱ�ȭ���{}
		{
		 grade = 1;
		 classroom = 2;
		 name = "�ڼ�ö";
		 height = 180.5;
		 gender = '��';
		}
	}
	//3. ��� �޼��� + information() : void
	public void information() {
		 System.out.println(grade + "�г� " + classroom + "�� " + name + " " + height + "cm�� " + gender + "���Դϴ�.");
	}

}
