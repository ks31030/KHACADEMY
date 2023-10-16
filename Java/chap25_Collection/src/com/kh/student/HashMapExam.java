package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap ����
		Map<String, Integer>studentGrades = new HashMap<>();
		
		//�л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 85);
		studentGrades.put("Kim", 100);
		studentGrades.put("Won", 30);
		
		//Ư�� �л� ���� �˻�
		//Map containsKey : �ʿ��� key, value �ִ��� Ȯ��.
		String studentName = "Kim";
		
		//���࿡ �л��� �߿��� Kim �ִٸ� ������ ������.
		if(studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�.");
		}
		//��� �л��� ���� ���
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		//�л� ���� ����
		String studentUpdate = "Kim";
		int newGrade = 98;
		studentGrades.put(studentUpdate, newGrade);
		System.out.println(studentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		
		//�л� ����
		String removeStudent = "Won";
		studentGrades.remove(removeStudent);
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�.");
		
		//���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
	}
}
