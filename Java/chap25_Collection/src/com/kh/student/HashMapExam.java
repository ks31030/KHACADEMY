package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap 생성
		Map<String, Integer>studentGrades = new HashMap<>();
		
		//학생과 점수를 추가하겠습니다.
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 85);
		studentGrades.put("Kim", 100);
		studentGrades.put("Won", 30);
		
		//특정 학생 성적 검색
		//Map containsKey : 맵에서 key, value 있는지 확인.
		String studentName = "Kim";
		
		//만약에 학생들 중에서 Kim 있다면 성적을 보여줘.
		if(studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "의 성적 : " + grade);
		} else {
			System.out.println(studentName + "의 성적을 찾을 수 없습니다.");
		}
		//모든 학생과 성적 출력
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		//학생 성적 수정
		String studentUpdate = "Kim";
		int newGrade = 98;
		studentGrades.put(studentUpdate, newGrade);
		System.out.println(studentUpdate + "의 성적을 " + newGrade + "로 수정했습니다.");
		
		//학생 제거
		String removeStudent = "Won";
		studentGrades.remove(removeStudent);
		System.out.println(removeStudent + "의 성적을 삭제했습니다.");
		
		//최종 학생 성적 출력
		System.out.println("최종 학생 성적 : ");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		
	}
}
