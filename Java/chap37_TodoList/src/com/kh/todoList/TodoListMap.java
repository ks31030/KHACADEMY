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
			System.out.println("�߸��� �ε���.");
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
			System.out.println("�� �� �߰� : add, ���� : remove, Ȯ�� : list, ���� : exit �Է��ϼ���.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���. ");
				String task = sc.nextLine();
				todoList.addTask(task);
				//equalsIgnoreCase
			} else if (choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine())-1;
					todoList.removeTask(index);
				} catch (Exception e) {
					System.out.println("��ȿ�ϱ� ���� �Է��Դϴ�.");
				}
			} else if (choice.equalsIgnoreCase("list")) {
				todoList.showTodoList();
			} else if (choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close();
	}
}