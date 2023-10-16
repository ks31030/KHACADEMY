package com.kh.Iaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public static void main(String[] args) {
		InetAddressMain	inetMain = new InetAddressMain();
//		inetMain.InetExam();
		inetMain.InetSample();
	}
	public void InetExam() {
		try {
			//호스트 이름 이용해서 객체 생성.
			InetAddress adrs1 = InetAddress.getByName("www.google.com");
			//IP 주소 출력
			System.out.println("Host Name : " + adrs1.getHostName());
			System.out.println("IP Address : " + adrs1.getHostAddress());
			
			//내가 사용하는 컴퓨터의 InetAddress 객체 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//호스트 이름 이용해서 객체 생성.
			InetAddress adrs2 = InetAddress.getByName("www.naver.com");
			//IP 주소 출력
			System.out.println("Host Name : " + adrs2.getHostName());
			System.out.println("IP Address : " + adrs2.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//호스트 이름 이용해서 객체 생성.
			InetAddress adrs3 = InetAddress.getByName("www.daum.net");
			//IP 주소 출력
			System.out.println("Host Name : " + adrs3.getHostName());
			System.out.println("IP Address : " + adrs3.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
	
	public void InetSample() {
		//호스트 이름 갖고 와서 객체 생성.
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			//IP 주소를 byte 배열로 얻기
			//InetAddress 객체에서 IP 주소를 바이트 배열로 얻음.
			//IP 주소를 바이트 배열로 얻으면 각 바이트를 통해 IP 주소를 다룰 수 있음.
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address byte로 얻음.");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			System.out.println();//개행. 띄어쓰기 역할.
			
			//도메인 명에 지정된 모든 호스트의 IP 주소를 배열로 얻기.
			InetAddress[] allAddress = InetAddress.getAllByName("www.google.com");
			System.out.println("구글에 지정된 모든 호스트의 IP 주소를 배열로 얻음.");
			for(InetAddress addr : allAddress) {
				System.out.println(addr.getHostAddress());
			}
			//호스트 이름 얻기
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			//지역 호스트의 IP 주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Address : " + localHost.getHostAddress());
			
			//멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티 캐스트 주소입니까? " + isMultiCast);
			
			//호스트 이름을 이용해서 InetAddress 객체 생성.
			InetAddress name = InetAddress.getByName("www.facebook.com");
			System.out.println("IP 주소 이름 : " + name.getHostAddress());
			
			//호스트 완전한 이름 가져 오기
			//호스트의 정규화 된(FQDN) 도메인 이름을 얻음.
			//FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("풀 네입 : " + hostFullName);
			
			//LoopPack
			boolean isLoopPack = address.isLoopbackAddress();
			System.out.println("룹팩인가요? " + isLoopPack);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
