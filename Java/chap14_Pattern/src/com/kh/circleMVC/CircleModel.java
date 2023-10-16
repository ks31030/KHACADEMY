package com.kh.circleMVC;

public class CircleModel {
	private double radius;
	private double PI = 3.14;

	public double CircleArea() {
		return radius * radius * PI;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
