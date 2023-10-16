package com.kh.todoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_Case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;

		Scanner sc = new Scanner(System.in);
		//할 일 목록 적기
		while(true) {
			System.out.println("할 일 목록 : ");
			
			for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println("할 일을 선택하세요 : ");
			System.out.println("할 일 추가는 숫자 1을 넣어 주세요.");
			System.out.println("할 일 제거는 숫자 2를 넣어 주세요.");
			System.out.println("종료하시려면 숫자 3을 넣어 주세요.");
			String choice = sc.next();
			sc.nextLine();
			
			if(choice.equals("1")||choice.equals("일")||choice.equals("One")) {
				System.out.println("할 일 추가");
				String todoItem = sc.nextLine();
				todoMap.put(taskNum++, todoItem);
				System.out.println("할 일이 추가되었습니다.");
			} else if (choice.equals("2")||choice.equals("이")||choice.equals("Two")) {
				System.out.println("제거할 일의 번호를 입력하세요.");
				int removeNum = sc.nextInt();
				if(todoMap.containsKey(removeNum)) {
					todoMap.remove(removeNum);
					System.out.println("할 일이 제거되었습니다.");
				} else {
					System.out.println("번호를 잘못 입력하셨습니다.");
				}
			} else if (choice.equals("3")||choice.equals("삼")||choice.equals("Three")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("반가웠어요. 다음에 만나요.");
				sc.close();
			} else {
				System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
			}
			
//			switch(choice) {
//				case "일" : 
//					System.out.println("할 일 추가");
//					String todoItem = sc.nextLine();
//					todoMap.put(taskNum++, todoItem);
//					System.out.println("할 일이 추가되었습니다.");
//					break;
//				case "이" :
//					System.out.println("제거할 일의 번호를 입력하세요.");
//					int removeNum = sc.nextInt();
//					if(todoMap.containsKey(removeNum)) {
//						todoMap.remove(removeNum);
//						System.out.println("할 일이 제거되었습니다.");
//					} else {
//						System.out.println("번호를 잘못 입력하셨습니다.");
//					}
//					break;
//				case "삼" :
//					System.out.println("프로그램을 종료합니다.");
//					System.out.println("반가웠어요. 다음에 만나요.");
//					sc.close();
//					System.exit(0);
//					break;
//				default :
//					System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
//			}
		}
	}
}
