package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		/*
		 ArrayList �̿��ؼ� ���ֳ����ĳ���
		 ���� 3ȸ 1,3,5 -> ��, ����, �׸� ����
		 ���ϱ� 2ȸ -> ��Ȳ, [���ο�], �Ķ�, [�����Ķ�]
		 ���� for�� �̿��ؼ� ���� ����ϱ�
		 ������� ���ĺ�
		 */
		ArrayList<String> colors = new ArrayList<>();
		
		System.out.println("colors" + colors);
		
		//���ֳ����ĳ���
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		
//		System.out.println("��ü���� : " + colors);	
		
		//���� 3ȸ 1,3,5 -> ��, ����, �׸� ����
		colors.set(1,  "��");
		colors.set(3,  "����");
		colors.set(4,  "�׸�");
		
//		System.out.println("���� : " + colors);
		
		//���ϱ� 2ȸ -> ��, [���ο�], �׸�, [�����Ķ�]
		colors.add(2, "���ο�");
		colors.add(6, "�����Ķ�");
//		System.out.println("���� : " + colors);
		
		//���� for�� �̿��ؼ� ���� ����ϱ�
		for(String AAA : colors) {
//			System.out.println(AAA);
		}
		
		//������� ���ĺ�
		//1. �ε��� �̿��ؼ� �ڸ����
		System.out.println("������� : " + colors.get(0) + " " + colors.get(7) + " " + colors.get(8));
		//2. �ʱ�ȭ �� ���
		
	}

}
