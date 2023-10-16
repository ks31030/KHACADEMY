package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//stack 값 추가 push()
		stack.push(1);
		stack.push(2);
		stack.push(3);
		/*
		 |       |
		 |   3   |
		 |   2   |
		 |___1___|
		 */
		//stack 값 전체 제거 clear()
		System.out.println(stack.pop());//stack 값 삭제 pop()
		System.out.println(stack.pop());
		//stack 가장 상단의 값(가장 마지막에 넣은 값) 출력
		stack.peek();
		//stack의 크기 출력
		stack.size();
		//stack empty : 스택이 비어 있는지 check
		//비어 있다면 true, 하나라도 들어 있다면 false
		stack.empty();
		// stack 1이 있는지 check 1이 존재한다면 true
		stack.contains(1);
	}

}
