package com.kh.example.practice2.model.vo;

public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ� ���� ��ǰ�� ���� �귣�� ����ϱ�
		System.out.println("Product ����");
		System.out.println("");
		Product product1 = new Product("�ڸ���Ϻ�Ƽ", 7000,"��Ÿ����");
		product1.information();
		System.out.println("");
		Product product2 = new Product("����", 2500,"�ٳ�������");
		product2.information();
		System.out.println("");
		Product product3 = new Product("���̽��Ƹ޸�ī��", 3000,"�����ο�Ŀ��");
		product3.information();

	}

}
