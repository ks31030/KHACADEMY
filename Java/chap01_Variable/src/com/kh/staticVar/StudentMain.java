package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh�л�1");
		//System.out.println(stKim.serialNum);
		/*
		 �б����� �л� ȸ������
		 �켱 �츮 �б� �л��� �´��� Ȯ��
		 �츮 �б� �л� ����Ű;
		 �ø���ѹ��� �����ؼ� -> 20
		 kh�л�1 20
		 kh�л�2 20
		 */
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("Kh�л�2");
		System.out.println("Kh stKim :");
		System.out.println(stKim.serialNum);
		System.out.println("Kh kh.Lee : ");
		System.out.println(khLee.serialNum);
	
	}
}
