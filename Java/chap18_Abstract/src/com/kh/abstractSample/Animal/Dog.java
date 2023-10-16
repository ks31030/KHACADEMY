package com.kh.abstractSample.Animal;

public class Dog extends Animal {
	private String name;
	//
	
	public Dog(String name) {
		super(name);
		this.name = name;
	}
	//@Override
	public void makeSound() {
		System.out.println("¼Ò¸®");
		//return name;
	}
}