package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		//HashMap ����
		Map<String, Integer> hProfile = new HashMap<>();
		//�̸��� ���̸� �߰��ϰڽ��ϴ�.
		hProfile.put("ö��", 15);
		hProfile.put("����", 16);
		hProfile.put("����", 17);
		hProfile.put("����", 18);
		hProfile.put("����", 19);
		//Ư�� �л� ���� �˻�
		String hName = "����";
		//���࿡ �л��� �߿��� ���� �ִٸ� ���̸� ������.
		if(hProfile.containsKey(hName)) {
			int hAge = hProfile.get(hName);
			System.out.println(hName + "�� ���̴� " + hAge + "��.");
		} else {
			System.out.println(hName + "�� ���̸� �� �� �����ϴ�.");
		}
	}

}
