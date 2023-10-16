package com.kh.patternMVC;

public class UserClient {

	public static void main(String[] args) {
		/*
		 MVC 패턴을 사용해서 학생정보를 다루는 곳
		 */
		//모델 객체 생성
		UserModel user = new UserModel("홍길동", 20);
		
		//뷰 객체 생성
		UserView view = new UserView();
		
		//컨트롤러 객체 생성 및 모델 뷰 설정
		UserController controller = new UserController(user, view);
	}

}
