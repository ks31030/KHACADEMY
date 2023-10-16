package com.kh.example.practice3.model.vo;
//1. ������� ����
//- PI : double = 3.14
//- radius : int =1
//2. ������ this�� Ȱ���ؼ� ������ ��.
//+ Circle()
//3. ���� ��� �޼��� �����
//+ incrementRadius() : void
//+ getAreaOfCircle() : void
//+ getSizeOfCircle() : void

public class Circle {
	//1. ������� ����
	//- PI : double = 3.14
	//- radius : int = 1
	double PI = 3.14;
	int radius = 1;
	//2. ������ this�� Ȱ���ؼ� ������ ��.
	//+ Circle()
	public Circle(double PI, int radius) {
		this.PI = PI;
		this.radius = radius;
	}
	//3. ���� ��� �޼��� �����
	//+ incrementRadius() : void
	//+ getAreaOfCircle() : void
	//+ getSizeOfCircle() : void
	public void incrementRadius() {
		System.out.println("������ : " + radius++);
	}
	public void getAreaOfCircle() {
		System.out.println("�� �� : " + (radius*radius*PI));
	}
		public void getSizeOfCircle() {
		System.out.println("�� �� : " + (2*radius*PI));
	}
	
}
