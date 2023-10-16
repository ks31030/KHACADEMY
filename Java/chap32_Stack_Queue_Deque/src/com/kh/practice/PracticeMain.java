package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.PracticeStack();
		pm.PracticeQueue();
		
		
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용.
		Stack<String> stack = new Stack<>();
		//stack 값 추가
		stack.push("떡볶이");
		stack.push("순대");
		stack.push("튀김");
		stack.push("김밥");
		stack.push("오뎅");
		stack.push("슬러시");
		stack.push("주먹밥");
		//stack 최후의 값 삭제 후 반환
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//stack 최후의 값'만' 출력
		stack.peek();
		//stack 크기 출력
		stack.size();
		//stack이 빈지 check
		stack.empty();
		//stack에 주먹밥이 있는지 check. 주먹밥이 존재한다면 true
		stack.contains("주먹밥");
		//stack 값 최종 출력
		System.out.println(stack);
		
	}
	
	public void PracticeStack() {
		Stack<String> stack = new Stack<>();
		//stack 요소 추가
		stack.push("민수");
		stack.push("하은");
		stack.push("정연");
		stack.push("승애");
		stack.push("석");
		//stack 최근 값 삭제 후 반환.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//stack 최근 값만 출력.
		stack.peek();
		//stack 크기 출력
		stack.size();
		//stack 빈지 check
		stack.empty();//비어있으면 true
		//stack에 석이 있는지 확인. 석이 존재한다면 true
		stack.contains("석");
		//stack 최종 출력
		System.out.println(stack);
	}
	
	public void PracticeQueue() {
		//큐에 요소 추가 반환 삭제하고 while 사용해보기
		Queue<String> queue = new LinkedList<>();
		//queue 요소 추가
		queue.offer("삼성");
		queue.offer("LG");
		queue.offer("SK");
		queue.offer("현대");
		queue.offer("한화");
		//queue 요소 제거 후 반환.
		System.out.println(queue.poll());//삼성 출력
		System.out.println(queue.poll());//LG 출력
		//queue의 front 요소 확인 후 반환.
		queue.peek();
		System.out.println(queue.peek());//삼성, LG가 제거되면 SK가 최선입값. SK 출력.
		//queue 크기 출력
		queue.size();//삼성, LG 제거 후 요소 3개이기 때문에 3 출력
		System.out.println(queue.size());
		//queue 최종 출력
		System.out.println(queue);
		
	}

}
