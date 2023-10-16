package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain rm = new ReplaceMain();
		rm.replace1();
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replace5();
		rm.replaceAll();
	}
	
	public void replace1() {
		String input1 = "Hello, World!";
		String reInput1 = input1.replace(" ", "-" );
		System.out.println(reInput1);
		String input2 = reInput1.replace("-","");
		System.out.println("input2 : " + input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World를 Java로 교체
		String reInput2 = input.replace("World","Java");
		System.out.println(reInput2);
	}
	
	public void replace3() {
		String originName = "Hello, World";
		//o로 적혀 있는 문자열들 x로 변경하기
		String reInput3 = originName.replace("o", "x");
		System.out.println(reInput3);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		//fox를 cat으로 변경하기
		String reInput4 = originString.replace("fox", "cat");
		System.out.println(reInput4);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		//모든 공백 제거하기
		String reInput5 = originString.replace(" ", "");
		System.out.println(reInput5);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace 대신 replaceAll을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)world", "Bye"); //replaceAll 과 (?i)를 둘다 사용하였더니 대소문자 구분없이 대체 됨.
		System.out.println(reAllstr);
	}
}
