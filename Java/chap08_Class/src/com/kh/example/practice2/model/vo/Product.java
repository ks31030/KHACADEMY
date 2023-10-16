package com.kh.example.practice2.model.vo;
 //1. ������� ����
 //- pName : String
 //- price : int
 //- brand : String
 //2. ������ this�� Ȱ���ؼ� ������ ��.
 //+ Product()
 //3. ���� ��� �޼��� �����
 //+ information() : void
 
public class Product {
	 //1. ������� ����
	 //- pName : String - price : int - brand : String
	String pName;
	int price;
	String brand;
	 //2. ������ this�� Ȱ���ؼ� ������ ��.
	 //+ Product()
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	 //3. ���� ��� �޼��� �����
	 //+ information() : void
	public void information() {
		System.out.println("��ǰ�� : " + pName);
		System.out.println("�� �� : " + price + "��");
		System.out.println("�귣�� : " + brand);
	}
}
