package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserNameExam {

	public static void main(String[] args) {
		System.out.println("���� ���� ��� : ");
		//HashMap ���� UserAge
		Map<String, Integer>userInfo = new HashMap<>();
		//������ �̸��� ����
		userInfo.put("King", 13);
		userInfo.put("Queen", 17);
		userInfo.put("Prince", 43);
		userInfo.put("Princess", 36);
		userInfo.put("Citizen", 33);
		//Ư�� ���� �˻�
		String userID = "Prince";
		//��� ���� �̸��� ���� ���
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		//���� ���� ����
		String userUpdate = "Prince";
		int newAge = 50;
		userInfo.put(userUpdate, newAge);
		System.out.println(userUpdate + "�� ���̸� " + newAge + "�� �����Ͽ����ϴ�.");
		//���� Ż��
		String removeUser = "King";
		userInfo.remove(removeUser);
		System.out.println(removeUser + " ���� ���� �Ϸ�.");
		//���� ���� �̸� ���� ���
		System.out.println("���� ���� ���� ��� : ");
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	}

}
