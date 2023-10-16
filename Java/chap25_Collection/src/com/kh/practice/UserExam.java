package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		//HashMap 생성
		Map<String, Integer> hProfile = new HashMap<>();
		//이름과 나이를 추가하겠습니다.
		hProfile.put("철수", 15);
		hProfile.put("영수", 16);
		hProfile.put("영희", 17);
		hProfile.put("미희", 18);
		hProfile.put("민희", 19);
		//특정 학생 성적 검색
		String hName = "미희";
		//만약에 학생들 중에서 미희 있다면 나이를 보여줘.
		if(hProfile.containsKey(hName)) {
			int hAge = hProfile.get(hName);
			System.out.println(hName + "의 나이는 " + hAge + "세.");
		} else {
			System.out.println(hName + "의 나이를 알 수 없습니다.");
		}
	}

}
