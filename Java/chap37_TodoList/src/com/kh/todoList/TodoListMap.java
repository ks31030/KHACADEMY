package com.kh.todoList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TodoListMap{
	private HashMap<String, String> tasks;
	
	public TodoListMap() {
		tasks = new HashMap<String, String>();
	}
	public void addTask(String task) {
		tasks.put(task, task);
	}
	public void removeTask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("잘못된 인덱스.");
		}
	}
	public void showTodoList() {
		Iterator<String> ir = tasks.keySet().iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			String task = tasks.get(key);
			System.out.println(task);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		TodoListMap todoList = new TodoListMap();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할 일 추가 : add, 삭제 : remove, 확인 : list, 종료 : exit 입력하세요.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요. ");
				String task = sc.nextLine();
				todoList.addTask(task);
				//equalsIgnoreCase
			} else if (choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine())-1;
					todoList.removeTask(index);
				} catch (Exception e) {
					System.out.println("유효하기 않은 입력입니다.");
				}
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.showTodoList();
			} else if (choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("애플리케이션 종료");
		sc.close();
	}
}