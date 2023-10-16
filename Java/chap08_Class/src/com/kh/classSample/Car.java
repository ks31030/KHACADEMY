package com.kh.classSample;

public class Car {
	//1. ���� �ʵ� �������
	String brand;
	String model;
	int speed;
	boolean engineOn;
	/*========================================
	 ������� �ؿ��� ��� �޼���� ����.
	 */
	//2. �����ڴ� �޼����� ����.
	//���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��.
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	
	//�������� �޼���
	public void startEngine() {//
		//���࿡ ������ true ���� �õ�.
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼��� �ۼ�.
		} else {//������ false�� �̹� ������ ���� �ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
		
	}
	
	//���� �޼���
	public void accelrate(int amount) {
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			System.out.println("�ӵ� ���Դϴ�.");
		} else {
			//������ false�� ������ ���� �־� �ӵ��� �� �� ����.
			System.out.println("�ӵ��� �� �� �����ϴ�.");
		}
	
		
	}


}
