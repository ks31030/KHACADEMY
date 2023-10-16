package com.kh.example.practice2.model.vo;

public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고 각각 상품명 가격 브랜드 출력하기
		System.out.println("Product 정보");
		System.out.println("");
		Product product1 = new Product("자몽허니블랙티", 7000,"스타벅스");
		product1.information();
		System.out.println("");
		Product product2 = new Product("식혜", 2500,"바나프레소");
		product2.information();
		System.out.println("");
		Product product3 = new Product("아이스아메리카노", 3000,"에슬로우커피");
		product3.information();

	}

}
