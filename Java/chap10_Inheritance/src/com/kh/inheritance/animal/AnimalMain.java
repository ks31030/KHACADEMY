package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("°¡À»");
		myDog.info();
		myDog.speak();
		myDog.eat();
		 
		Cat myCat = new Cat("·¹¿Ë");
		myCat.info();
		myCat.run();
		myCat.eat();
		
		Lion myLion = new Lion("½É¹Ù");
		myLion.info();
		myLion.speak();
		myLion.eat();
		
		Monkey myMonkey = new Monkey("¸ùÀÌ");
		myMonkey.info();
		myMonkey.eat();
	}

}

