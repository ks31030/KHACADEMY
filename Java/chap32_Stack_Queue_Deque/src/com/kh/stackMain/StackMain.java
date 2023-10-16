package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//stack �� �߰� push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		/*
		 |       |
		 |   3   |
		 |   2   |
		 |___1___|
		 */
		//stack �� ��ü ���� clear()
		System.out.println(stack.pop());//stack �� ���� pop()
		System.out.println(stack.pop());
		//stack ���� ����� ��(���� �������� ���� ��) ���
		stack.peek();
		//stack�� ũ�� ���
		stack.size();
		//stack empty : ������ ��� �ִ��� check
		//��� �ִٸ� true, �ϳ��� ��� �ִٸ� false
		stack.empty();
		// stack 1�� �ִ��� check 1�� �����Ѵٸ� true
		stack.contains(1);
	}

}
