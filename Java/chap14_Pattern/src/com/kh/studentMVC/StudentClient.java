package com.kh.studentMVC;

public class StudentClient {
	//학생정보 다루는 곳
	public static void main(String[] args) {
		//모델객체 생성 Model
		StudentModel Model = new StudentModel("홍길동", 25);
		//뷰 객체 생성 View
		StudentView View = new StudentView();
		//컨트롤러 객체 생성 Controller(모델, 뷰 설정)
		StudentController Controller = new StudentController(Model, View); 
		//학생 정보 업데이트해서 출력
		Controller.updateView();
		//학생 정보 업데이트 실행
		Controller.setStudentName("이길상");
		Controller.setStuduentAge(18);
		//업데이트 된 학생 정보 출력
		Controller.updateView();
	}

}
