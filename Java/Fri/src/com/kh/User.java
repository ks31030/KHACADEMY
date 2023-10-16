package com.kh;

			//객체
public class User {
//	멤버변수
	String userName;
	int userAge;
	int userHeight;
	
	//생성자
	public User(String string, int i, int d) {
		this.userName = string;
		this.userAge = i;
		this.userHeight = d;
				}
	//메서드
	public void User1(){
		System.out.println(userName);
		System.out.println(userAge);
		System.out.println(userHeight);
	}
	
	//메인 메서드
	public static void main(String[] args) {
//		생성자  인스턴스				 매개변수
		User    s   = new User("김석", 28, 174);
//		s.User();
		s.User1();
	}



}
