package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	
	public void eat() {
		System.out.println(getName() + "(��)�� �ٳ����� �԰ɽ��� �Դ´�.");
	}
}
