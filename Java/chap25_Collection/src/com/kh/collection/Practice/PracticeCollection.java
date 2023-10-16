package com.kh.collection.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add �غ��� for�� ����ϱ�
		pList.add("������");
		pList.add("��Ź��");
		pList.add("û�ұ�");
		
		System.out.println("List : ");
		
		for(String stuff : pList) {
			System.out.println(stuff);
		}
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� for�� ��� �ߺ��� �� add �ؾ� ��.
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		pSet.add("��");
		
		for(String jam : pSet) {
			System.out.println(jam);
		}
	}
	
	public void practiceMap() {
		//Ű�� ���� �̿��ؼ� map put�� ���� ���� for������ ����ϱ�
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("�ұ�", 1);
		pMap.put("����", 2);
		pMap.put("����", 3);
		pMap.put("����", 4);
		pMap.put("����", 5);
		pMap.put("����", 8);
		
		for(String seasoning : pMap.keySet()) {
			int spoon = pMap.get(seasoning);
			System.out.println(seasoning + " : " + spoon + "ū��");
		}
		
		
		
		
		
		
		
		
		
	}
}