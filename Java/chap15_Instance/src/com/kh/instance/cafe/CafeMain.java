package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe ord1 = new Cafe("���̽�ī���ī", 10, true);
		Cafe ord2 = new Cafe("�ڸ���Ϻ�Ƽ", 5, false);
		Cafe ord3 = new Cafe("�����̵�", 1, true);
		
		ord1.orderCoffee();
		ord2.orderCoffee();
		ord3.orderCoffee();
	}

}
