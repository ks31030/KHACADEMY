package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		pm.practice1();
		pm.practice2();
		
	}
	public void practice1() {
		//���ڿ� �����̱� ��� append
		StringBuffer sb1 = new StringBuffer();
		sb1.append("���� ");//������ �� ����
		sb1.append("������ �� ����");
		//������ �� ���
		System.out.println(sb1);
		}
		
	public void practice2() {
		//���ڿ� ������ ���� ������ �� ����
		StringBuffer str = new StringBuffer();
		str.append("���� ������ �� ����");
		//���ڿ� ����
		str.replace(3,5, "�߽�");
		System.out.println(str.toString());
		//���ڿ� ������
		str.reverse();
		System.out.println(str.toString());

		}
		
	}
