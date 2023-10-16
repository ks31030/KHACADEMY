package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		//Object 클래스 예제

		//객체 생성
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//equals() 메서드를 사용해서 두 객체 비교
		boolean isEqual = obj1.equals(obj2);
		System.out.println("obj1와 obj2는 같은가 ? : " + isEqual);
		
		//hashCode()메소드를 사용하여 객체의 해시코드 출력
		int hashcode1 = obj1.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj1의 해시코드 : " + hashcode1);
		System.out.println("obj2의 해시코드 : " + hashcode2);
		
		//toString() 메서드를 사용하여 객체를 문자열로 표현
		String objString1 = obj1.toString();
		String objString2 = obj2.toString();
		System.out.println("obj1의 문자열 표현 : " + objString1);
		System.out.println("obj2의 문자열 표현 : " + objString2);
		
		//getClass() 메서드를 사용하여 객체의 클래스 정보 출력
		Class<?> classOfObj1 = obj1.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("obj1의 클래스 : " + classOfObj1.getName());
		System.out.println("obj2의 클래스 : " + classOfObj2.getName());
	}

}
