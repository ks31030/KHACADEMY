package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class StudentRun {

	public static void main(String[] args) {
		/*
		 실행용 메서드로 기본 생성자를 통해 Student 객체 생성 후 information()으로 정보 출력
		 */
		
		System.out.println("학생의 정보 출력하기");
		Student student = new Student(3, 10, "김석", 174.5, '남');
		//정보 출력
		student.information();
	}

}
