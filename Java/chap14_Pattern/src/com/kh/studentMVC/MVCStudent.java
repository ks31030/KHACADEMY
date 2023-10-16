package com.kh.studentMVC;

public class MVCStudent {
	//1. model
	private String name;
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public MVCStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//2. Controller
	public class SController{
		private MVCStudent model;
		private MVCStudent view;
		
	public SController() {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.printInfo();
	}
	
	}
	
	
	//3. view
	public void printInfo() {

		System.out.println("�л����� ����");
	}
	//etc. Client
	public static void main(String[] args) {
	
		
	}

}
