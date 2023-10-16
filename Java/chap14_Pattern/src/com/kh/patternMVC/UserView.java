package com.kh.patternMVC;
// 정보를 화면에 출력
public class UserView {
	
	public void displayInfo(String userName, int userAge) {
		System.out.println("학생 정보");
		System.out.println("이름 : " + userName);
		System.out.println("나이 : " + userAge);
	}

}
