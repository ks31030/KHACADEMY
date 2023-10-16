package com.kh.instance.cafe;

public class Cafe {
	//멤버변수 설정
	private String type; //종류
	private int size; //사이즈
	private boolean isSugar; //설탕여부
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void orderCoffee() {
		System.out.println("커피를 주문합니다.");
		System.out.println("메뉴 : " + type);
		System.out.println("크기 : " + size);
		
		if(isSugar) {
			System.out.println("설탕 추가");
		}
	}

}
