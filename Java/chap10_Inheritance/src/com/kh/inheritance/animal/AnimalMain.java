package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		 
		Cat myCat = new Cat("����");
		myCat.info();
		myCat.run();
		myCat.eat();
		
		Lion myLion = new Lion("�ɹ�");
		myLion.info();
		myLion.speak();
		myLion.eat();
		
		Monkey myMonkey = new Monkey("����");
		myMonkey.info();
		myMonkey.eat();
	}

}

