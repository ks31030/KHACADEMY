package com.kh.classSample;
//Student ��ü ����
public class Student {
	
	//1. ��� ���� (�л��� �Ӽ�)
	String name;
	int age;
	String grade;
	
	/**    ������    (�����ڴ� �޼��� �� �Ϻ�)**/
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void displayInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("�л� ���� : " + age);
		System.out.println("�л� �г� : " + grade);
	}
}
