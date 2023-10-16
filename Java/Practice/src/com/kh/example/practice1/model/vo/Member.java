package com.kh.example.practice1.model.vo;
  
public class Member {
	/*
1. �������
- memberId : String
- memberPwd : String
- memberName : String
- age : int
- gender : char
- phone : String
- email : String
2. ������
+ Member()
3. ��� �޼ҵ�
+ changeName(name:String):void
+ printName():void
	*/
	//1. �������
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	//2. ������
	public Member(String memberId, String memberPwd, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	//3. ��� �޼ҵ�
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println();
	}
}
