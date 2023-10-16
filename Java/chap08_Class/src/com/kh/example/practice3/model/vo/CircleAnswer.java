package com.kh.example.practice3.model.vo;

import com.kh.example.practice2.model.vo.Product;

public class CircleAnswer {

	public static void main(String[] args) {
		System.out.println("Circle Á¤º¸");
		Circle circle1 = new Circle(3.14, 1);
		circle1.incrementRadius();
		Circle circle2 = new Circle(3.14, 2);
		circle2.getAreaOfCircle();
		Circle circle3 = new Circle(3.14, 2);
		circle3.getSizeOfCircle();
	}

}
