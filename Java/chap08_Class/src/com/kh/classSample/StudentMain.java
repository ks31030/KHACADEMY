package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 인스턴트 생성
		Student student1 = new Student("김석", 20, "1학년");
		// 학생 정보 출력
		student1.displayInfo();

		/*학생을 3명 만들어서 3명 출력하기*/
		Student student2 = new Student("김철수", 20, "1학년");
		student2.displayInfo();
		Student student3 = new Student("김민수", 21, "2학년");
		student3.displayInfo();
		Student student4 = new Student("김영수", 22, "3학년");
		student4.displayInfo();

	}

}
