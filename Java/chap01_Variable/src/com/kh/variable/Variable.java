package com.kh.variable;
 
public class Variable {
	public static void main(String[] args) {
		// 1. ������ �̸��� ������, ����, ������ھ�, �޷�($)�� ������ �� �ִ�.
		
		// 2. ������ �̸��� ���ڷ� ������ �� ����.
		
		// 3. ���� �̸� ���̿��� ������ ������ �� ����.
		// ����� ��Ģ���� ����� ���� ���� ������ �� ����ϱ� ������ ������� �ʴ´�.
		
		// 4. �ڹٿ��� �̸� ������ ���� ���� �̸����� ������� �� �Ѵ�.
		
		// 1. �Ǽ���(�Ҽ����� �ִ� ���� : float, double)
		float pie1 = 3.141241245f; //float�� f�� F�� �ۼ��Ѵ�.
		double pie2 = 3.141241245;
		System.out.print("float : ");
		System.out.println(pie1);
		System.out.print("double : ");
		System.out.println(pie2);
		
		// 2. ������
		// byte -128 ~ 127���� ��� ����.
		//byte bt = -129; //int�� �����ϰų� ���� + byte �־� ��� �Ѵ�.
		byte bt = -127; //-129 ���Ͽ� 128 �̻���� ����� ���� �ʴ� �� Ȯ��.
		System.out.println(bt);
		//short -32,768 ~ 32,767���� ��� ����.
		//short shrt = -32769; //-32769 ���Ͽ� 32768 �̻���� ����� ���� �ʴ� �� Ȯ��.
		short shrt = -32767;
		System.out.println(shrt);
		
		// int -2,147,483,648 ~ 2,147,483,647���� ��� ����.
		int nt = -2147483648;
		System.out.println(nt);
		
		// long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807���� ��� ����.
		long lng = 2000L; //�ڿ� L, l�� �ٿ��ش�.
		System.out.println(lng);
		
		// 3. ������
		// char ������. ���ڸ� �� ���ڸ� ������ �� �ִ�.
		//      '';
	    char chr1 = 'a';
	    System.out.println(chr1);
	    
		// String�� �⺻���� �ڷ����� ������ ������ �⺻������ ����.
		// �⺻���� �ڷ����� ���� �ʱ� ������ String���� ǥ����.
		// String ""�� '' �ȿ� ���ڸ� �ۼ��� ��(��Ģ).
		//String name = "�ȳ��ϼ���.";
		
		// 4. ����
		// boolean �� true�� false�� ǥ���Ѵ�.
		// ����� : boolean bln = true; false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("�ȳ��ϼ���. ���� ȫ�浿�Դϴ�.");
		String name = "ȫ�浿";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		// �ѹ� Ÿ���� ������ ������ �缱���� ���� �ʰ� �״�� ����ص� �ȴ�.
		// �ѹ� ������ Ÿ���� �ٸ� Ÿ������ �缱���� �� ����.
		// ������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ������ �� ����.
		name = "��ö��";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		
		int age = 22;
		String baseball = "�߱�";
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.");
		System.out.println("���� ���̴� " + age + "���̰�, ");
		System.out.println("���� ��̴� " + baseball + "�Դϴ�.");
		
		char score = 'a';
		System.out.println("���� ������ " + score + "�Դϴ�.");
	
	}
}
