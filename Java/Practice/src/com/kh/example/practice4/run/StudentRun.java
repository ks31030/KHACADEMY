package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class StudentRun {

	public static void main(String[] args) {
		/*
		 ����� �޼���� �⺻ �����ڸ� ���� Student ��ü ���� �� information()���� ���� ���
		 */
		
		System.out.println("�л��� ���� ����ϱ�");
		Student student = new Student(3, 10, "�輮", 174.5, '��');
		//���� ���
		student.information();
	}

}
