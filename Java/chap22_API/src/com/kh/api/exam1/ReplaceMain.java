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
		//World�� Java�� ��ü
		String reInput2 = input.replace("World","Java");
		System.out.println(reInput2);
	}
	
	public void replace3() {
		String originName = "Hello, World";
		//o�� ���� �ִ� ���ڿ��� x�� �����ϱ�
		String reInput3 = originName.replace("o", "x");
		System.out.println(reInput3);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		//fox�� cat���� �����ϱ�
		String reInput4 = originString.replace("fox", "cat");
		System.out.println(reInput4);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		//��� ���� �����ϱ�
		String reInput5 = originString.replace(" ", "");
		System.out.println(reInput5);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace ��� replaceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world", "Bye"); //replaceAll �� (?i)�� �Ѵ� ����Ͽ����� ��ҹ��� ���о��� ��ü ��.
		System.out.println(reAllstr);
	}
}
