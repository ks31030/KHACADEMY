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
		//나이를 기준으로 비교
		return this.age - otherActor.age;
	}
	
	@Override
	public String toString() {
		return "Actor name = " + name + ", age = " + age;
		
	}
}
