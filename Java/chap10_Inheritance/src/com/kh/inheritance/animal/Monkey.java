package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	
	public void eat() {
		System.out.println(getName() + "(이)가 바나나를 게걸스레 먹는다.");
	}
}
