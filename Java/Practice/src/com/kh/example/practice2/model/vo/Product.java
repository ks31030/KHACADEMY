package com.kh.example.practice2.model.vo;

public class Product {
	protected String pName = "AIR_FORCEe";
	protected int price = 110000;
	protected String brand = "NIKE";
	public String product;
	
	
	//ȣ�� �޼��� �ۼ��Ͽ� �� ȣ��
	
	public void information() {
		System.out.println("��ǰ�� : " + pName);
		System.out.println("�� �� : " + price);
		System.out.println("�귣�� : " + brand);
	}

}
