package com.kh.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + " : 주인이 달린다!");
	}
	@Override
	//animal에 적혀 있는 eat을 고양이 안에서만 다시 정의 내린다.
	public void eat() {
		System.out.println(getName() + "(이)가 먹는 중 먹이통을 뺏을 것ㅋ");
	}
}
