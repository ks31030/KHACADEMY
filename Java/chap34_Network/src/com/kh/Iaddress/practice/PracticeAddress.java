package com.kh.Iaddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		//������ �ּ� �߰��ϱ�
		try {
			InetAddress address = InetAddress.getByName("www.instagram.com");
			InetAddress[] allAddress = InetAddress.getAllByName("www.instagram.com");
			System.out.println("�ν�Ÿ�׷��� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ����.");
			System.out.println("All Host Name : " + address.getHostName() + " All Host Address : " + address.getHostAddress());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
