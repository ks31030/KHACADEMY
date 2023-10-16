package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {

	public static void main(String[] args) {
/*
	     ����                       ��
	      |                        |
		  V                        V 
	   [first] <-> [second] <-> {third}
   ^                                      ^
   |                                      |
[     ]                                [     ]
*/
		//ArrayDequeue ����Ͽ� Dequeue ����.
		Deque<String> deque = new ArrayDeque<>();
		//Deque ��� �߰�
		deque.addFirst("First");
		deque.addLast("Last");
		//�� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		//�� �հ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		//��� �ִ��� Ȯ��
		System.out.println(deque.isEmpty());//��� ������ true

	}

}
