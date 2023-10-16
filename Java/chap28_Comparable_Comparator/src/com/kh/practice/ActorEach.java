package com.kh.practice;

public class ActorEach implements Comparable<ActorEach>{
	private String name;
	private int age;
	
	public ActorEach(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(ActorEach otherActor) {
		//���̸� �������� ��
		return this.age - otherActor.age;
	}
	
	@Override
	public String toString() {
		return "Actor name = " + name + ", age = " + age;
		
	}
}
