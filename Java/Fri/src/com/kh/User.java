package com.kh;

			//��ü
public class User {
//	�������
	String userName;
	int userAge;
	int userHeight;
	
	//������
	public User(String string, int i, int d) {
		this.userName = string;
		this.userAge = i;
		this.userHeight = d;
				}
	//�޼���
	public void User1(){
		System.out.println(userName);
		System.out.println(userAge);
		System.out.println(userHeight);
	}
	
	//���� �޼���
	public static void main(String[] args) {
//		������  �ν��Ͻ�				 �Ű�����
		User    s   = new User("�輮", 28, 174);
//		s.User();
		s.User1();
	}



}
