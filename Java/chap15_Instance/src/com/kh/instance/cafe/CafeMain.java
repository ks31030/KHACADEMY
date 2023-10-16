package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe ord1 = new Cafe("아이스카페모카", 10, true);
		Cafe ord2 = new Cafe("자몽허니블랙티", 5, false);
		Cafe ord3 = new Cafe("망고에이드", 1, true);
		
		ord1.orderCoffee();
		ord2.orderCoffee();
		ord3.orderCoffee();
	}

}
