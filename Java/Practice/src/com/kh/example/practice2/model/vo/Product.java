package com.kh.example.practice2.model.vo;

public class Product {
	protected String pName = "AIR_FORCEe";
	protected int price = 110000;
	protected String brand = "NIKE";
	public String product;
	
	
	//호출 메서드 작성하여 각 호출
	
	public void information() {
		System.out.println("제품명 : " + pName);
		System.out.println("가 격 : " + price);
		System.out.println("브랜드 : " + brand);
	}

}
