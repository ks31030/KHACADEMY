package com.kh.studentMVC;

public class StudentModel {
	private String name;
	private int age;
	
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("�л� ���Դϴ�.");
	}
}
