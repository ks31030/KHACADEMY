package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		/*
		 ArrayList �̿��ؼ�
		 ���� 3�� �����
		 2�� �����ϰ�
		 1�� �����
		 ���� �� �����ϱ�
		 */
		//ArrayList �̿��ؼ�
		ArrayList<String> toDo = new ArrayList<>();
		System.out.println("���� : " + toDo);
		//���� 3�� �����
		toDo.add("�Ͱ�");
		System.out.println("�Ͱ� �߰� : " + toDo);
		toDo.add("�Ļ�");
		System.out.println("�Ļ� �߰� : " + toDo);
		toDo.add("����");
		System.out.println("���� �߰� : " + toDo);
		
		toDo.set(2, "����");
		toDo.set(1, "���");
		System.out.println("���� üũ : " + toDo);
		
		toDo.remove(0);
		System.out.println("�Ͱ� ���� Ȯ�� : " + toDo);
		
		//ArrayList ��ȸ�ؼ� ������
		System.out.println("���� ���");
		for(String toDoThing : toDo) {
			System.out.println(toDoThing);
		}
		
		toDo.clear();
		System.out.println("��� ���� ���� : " + toDo);
		
	}

}
