package com.kh.example.practice3.model.vo;

public class Circle {
		public int getRadius() {
		return radius;
	}
		public double getPI() {
			return PI;
		}
	public void setRadius(int radius) {
		this.radius = radius;
	}
		//�������
	 	//private final double PI = 3.14;
		//public static final double PI = 3.14;
		final double PI = 3.14; //���n
		private int radius = 1; //����
	
		//������
		public Circle() {
			//�⺻������
			
		}		
		//�޼ҵ�
		//�������� ���� ���
		public void inRadius() {
			//������ ���� ������ų ���� ������ �� �ִ�!
			radius++;
		}
		public void AreaCircle() {
			//���� ���̸� ����ϰ� ����ϴ� �޼���
			double area = PI * radius * radius;
			System.out.println("���� ���� : " + area);
		}
		public void SizeOfCircle() {
			System.out.println("���� ũ��(������) : " + radius);
		}
	}
		
		



