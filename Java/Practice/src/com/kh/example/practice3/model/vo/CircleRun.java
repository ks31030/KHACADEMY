package com.kh.example.practice3.model.vo;

import com.kh.example.practice3.model.vo.Circle;

public class CircleRun {

	public static void main(String[] args) {
		// �⺻������ ��ü ����!
		Circle circle = new Circle();
		
		//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ����غ���!!
		System.out.println("�ʱ⿡ ���� ������ �˰� �ʹ�.");
		//inRadius
		circle.AreaCircle();
		circle.SizeOfCircle();
		//AreaCircle
		//SizeOfCircle
		
		circle.inRadius();
		
		//���� �ѷ��� ���̰� ������ 1�� ������ ���� ��� ����ϱ�
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaCircle();
		circle.SizeOfCircle();
	}
}
