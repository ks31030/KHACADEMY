package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserNameExam {

	public static void main(String[] args) {
		System.out.println("유저 정보 출력 : ");
		//HashMap 생성 UserAge
		Map<String, Integer>userInfo = new HashMap<>();
		//유저의 이름과 나이
		userInfo.put("King", 13);
		userInfo.put("Queen", 17);
		userInfo.put("Prince", 43);
		userInfo.put("Princess", 36);
		userInfo.put("Citizen", 33);
		//특정 유저 검색
		String userID = "Prince";
		//모든 유저 이름과 나이 출력
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		//유저 나이 수정
		String userUpdate = "Prince";
		int newAge = 50;
		userInfo.put(userUpdate, newAge);
		System.out.println(userUpdate + "의 나이를 " + newAge + "로 수정하였습니다.");
		//유저 탈퇴
		String removeUser = "King";
		userInfo.remove(removeUser);
		System.out.println(removeUser + " 계정 삭제 완료.");
		//최종 유저 이름 나이 출력
		System.out.println("최종 유저 정보 출력 : ");
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	}

}
