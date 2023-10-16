package com.kh;

public class Dog {
	//멤버변수
		String name;
		int age;
	//생성자
	public Dog(String string, int i) {
		this.name = string;
		this.age = i;
	}
	//리턴 메서드
	public void DogInfo() {
		System.out.println(name + "이는 " + age + "살입니다.");//출력메서드
	}
	//메인 메서드
	public static void main(String[] args) {
		//인스턴스 생성
		Dog D = new Dog("가을", 5);
		D.DogInfo();//
	}
}