package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}

	public void speak() {
		System.out.println(getName() + "(��)�� �θ�¢�´�.");
	}
	public void eat() {
		System.out.println(getName() + "(��)�� Ƽ���� �Դ´�.");
	}
}
