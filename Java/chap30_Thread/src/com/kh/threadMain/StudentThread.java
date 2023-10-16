package com.kh.threadMain;

public class StudentThread extends Thread{
	private String studentName;
	
	public StudentThread(String name) {
		this.studentName = name;
	}
	@Override
	public void run() {
		System.out.println(studentName + "(��)�� ���θ� �����մϴ�.");
		try {
			Thread.sleep(4000);//�����尡 2�� ���� ���� ���·� �ֵ��� �մϴ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(studentName + "(��)�� ���θ� ��Ĩ�ϴ�.");
	}
}
