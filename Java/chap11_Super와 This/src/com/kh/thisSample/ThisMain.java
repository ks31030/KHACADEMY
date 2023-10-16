package com.kh.thisSample;

public class ThisMain {
/*
 this 객체(=인스턴스) 자신을 가리키는 참조변수 객체(=인스턴스)의 주소가 저장.
 this() 현재 클래스의 다른 생성자를 호출하는 데 사용.
 */
	public static void main(String[] args) {
		int x = 10; //정수 x에 10값 할당
		int y = x; //참조변수 y. x를 가리킨다.

		x = 20;
		y = x;
		System.out.println("y : " + y);
		
		int[] list1 = {1, 2, 3};
		int[] list2 = list1; //list2가 참조변수.
	}
	
	class MyClass{
		int myField;
		//첫번째 생성자
		MyClass(){
			this(0);//this() 사용해서 다른 생성자 호출
		}
		//두번째 생성자
		MyClass(int value){
			this.myField = value;
		}
		void printValue() {
			System.out.println("myField의 값 : " + this.myField);
		}
	}
	public class thisMain {
		public void main(String[] args) {
			MyClass obj1 = new MyClass();//첫번째 생성자 호출
			MyClass obj2 = new MyClass(10);//두번째 생성자 호출
			
			obj1.printValue();
			obj2.printValue();
			
		}
	}

}
