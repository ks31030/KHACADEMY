package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.PracticeStack();
		pm.PracticeQueue();
		
		
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ���.
		Stack<String> stack = new Stack<>();
		//stack �� �߰�
		stack.push("������");
		stack.push("����");
		stack.push("Ƣ��");
		stack.push("���");
		stack.push("����");
		stack.push("������");
		stack.push("�ָԹ�");
		//stack ������ �� ���� �� ��ȯ
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//stack ������ ��'��' ���
		stack.peek();
		//stack ũ�� ���
		stack.size();
		//stack�� ���� check
		stack.empty();
		//stack�� �ָԹ��� �ִ��� check. �ָԹ��� �����Ѵٸ� true
		stack.contains("�ָԹ�");
		//stack �� ���� ���
		System.out.println(stack);
		
	}
	
	public void PracticeStack() {
		Stack<String> stack = new Stack<>();
		//stack ��� �߰�
		stack.push("�μ�");
		stack.push("����");
		stack.push("����");
		stack.push("�¾�");
		stack.push("��");
		//stack �ֱ� �� ���� �� ��ȯ.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//stack �ֱ� ���� ���.
		stack.peek();
		//stack ũ�� ���
		stack.size();
		//stack ���� check
		stack.empty();//��������� true
		//stack�� ���� �ִ��� Ȯ��. ���� �����Ѵٸ� true
		stack.contains("��");
		//stack ���� ���
		System.out.println(stack);
	}
	
	public void PracticeQueue() {
		//ť�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		Queue<String> queue = new LinkedList<>();
		//queue ��� �߰�
		queue.offer("�Ｚ");
		queue.offer("LG");
		queue.offer("SK");
		queue.offer("����");
		queue.offer("��ȭ");
		//queue ��� ���� �� ��ȯ.
		System.out.println(queue.poll());//�Ｚ ���
		System.out.println(queue.poll());//LG ���
		//queue�� front ��� Ȯ�� �� ��ȯ.
		queue.peek();
		System.out.println(queue.peek());//�Ｚ, LG�� ���ŵǸ� SK�� �ּ��԰�. SK ���.
		//queue ũ�� ���
		queue.size();//�Ｚ, LG ���� �� ��� 3���̱� ������ 3 ���
		System.out.println(queue.size());
		//queue ���� ���
		System.out.println(queue);
		
	}

}
