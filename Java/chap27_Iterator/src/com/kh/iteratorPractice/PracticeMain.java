package com.kh.iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> sport = new ArrayList<>();
		sport.add("�±ǵ�");
		sport.add("�߱�");
		sport.add("����");
		sport.add("����");
		sport.add("�౸");
		
		//Iterator ����
		Iterator<String> iter = sport.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String sports = iter.next();
			System.out.print(sports + " ");
		}

	}

}
