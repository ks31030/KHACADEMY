package com.kh.example.practice3.model.vo;
//1. 멤버변수 생성
//- PI : double = 3.14
//- radius : int =1
//2. 생성자 this를 활용해서 만들어야 함.
//+ Circle()
//3. 정보 출력 메서드 만들기
//+ incrementRadius() : void
//+ getAreaOfCircle() : void
//+ getSizeOfCircle() : void

public class Circle {
	//1. 멤버변수 생성
	//- PI : double = 3.14
	//- radius : int = 1
	double PI = 3.14;
	int radius = 1;
	//2. 생성자 this를 활용해서 만들어야 함.
	//+ Circle()
	public Circle(double PI, int radius) {
		this.PI = PI;
		this.radius = radius;
	}
	//3. 정보 출력 메서드 만들기
	//+ incrementRadius() : void
	//+ getAreaOfCircle() : void
	//+ getSizeOfCircle() : void
	public void incrementRadius() {
		System.out.println("반지름 : " + radius++);
	}
	public void getAreaOfCircle() {
		System.out.println("면 적 : " + (radius*radius*PI));
	}
		public void getSizeOfCircle() {
		System.out.println("둘 레 : " + (2*radius*PI));
	}
	
}
