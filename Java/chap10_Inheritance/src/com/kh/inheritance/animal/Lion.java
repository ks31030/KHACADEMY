package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}

	public void speak() {
		System.out.println(getName() + "(이)가 부르짖는다.");
	}
	public void eat() {
		System.out.println(getName() + "(이)가 티몬을 먹는다.");
	}
}
