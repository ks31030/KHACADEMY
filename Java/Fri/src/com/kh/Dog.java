package com.kh;

public class Dog {
	//�������
		String name;
		int age;
	//������
	public Dog(String string, int i) {
		this.name = string;
		this.age = i;
	}
	//���� �޼���
	public void DogInfo() {
		System.out.println(name + "�̴� " + age + "���Դϴ�.");//��¸޼���
	}
	//���� �޼���
	public static void main(String[] args) {
		//�ν��Ͻ� ����
		Dog D = new Dog("����", 5);
		D.DogInfo();//
	}
}