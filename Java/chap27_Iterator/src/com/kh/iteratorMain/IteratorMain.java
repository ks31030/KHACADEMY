package com.kh.iteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
 Iterator
  �÷���(�����ͱ׷�)�� �ݺ�(Iterator)�ϸ鼭 ��ҿ� �����ϴ� �� ���Ǵ� �������̽�.
  �پ��� �÷��� ����(ArrayList, HashSet ��)�� ����� �� ����.
  �÷����� ��Ҹ� �а� �����ϴ� �� ���.
  �÷����� ũ�⳪ ���� ������ ���� ���� ��ҿ� ������ �� ����.
 */
	public static void main(String[] args) {
		//ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�ǾƳ�");
		music.add("����");
		music.add("���̿ø�");
		
		//Iterator ����
		Iterator<String> iter = music.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String music1 = iter.next();
			System.out.println(music1);
		}
		
		//Iterator ����Ͽ� ��� ����.
		iter = music.iterator(); //�ٽ� iterator �ʱ�ȭ
		while(iter.hasNext()) {
			String music1 = iter.next();
			//���� ���̿ø��� ������ �����ϱ� ����.
			if(music1.equals("���̿ø�")){
				iter.remove();
			}
			System.out.println(music1);
		}
		
		//���� �� ArrayList ���
		System.out.println("���� �� ���");
		for(String a : music) {
			System.out.println(a);
		}
	}
 
}
