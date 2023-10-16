package com.kh.Iaddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		//도메인 주소 추가하기
		try {
			InetAddress address = InetAddress.getByName("www.instagram.com");
			InetAddress[] allAddress = InetAddress.getAllByName("www.instagram.com");
			System.out.println("인스타그램에 지정된 모든 호스트의 IP 주소를 배열로 얻음.");
			System.out.println("All Host Name : " + address.getHostName() + " All Host Address : " + address.getHostAddress());
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
