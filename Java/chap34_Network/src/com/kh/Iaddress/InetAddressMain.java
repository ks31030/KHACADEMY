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
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����.
			InetAddress adrs1 = InetAddress.getByName("www.google.com");
			//IP �ּ� ���
			System.out.println("Host Name : " + adrs1.getHostName());
			System.out.println("IP Address : " + adrs1.getHostAddress());
			
			//���� ����ϴ� ��ǻ���� InetAddress ��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����.
			InetAddress adrs2 = InetAddress.getByName("www.naver.com");
			//IP �ּ� ���
			System.out.println("Host Name : " + adrs2.getHostName());
			System.out.println("IP Address : " + adrs2.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			//ȣ��Ʈ �̸� �̿��ؼ� ��ü ����.
			InetAddress adrs3 = InetAddress.getByName("www.daum.net");
			//IP �ּ� ���
			System.out.println("Host Name : " + adrs3.getHostName());
			System.out.println("IP Address : " + adrs3.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
	
	public void InetSample() {
		//ȣ��Ʈ �̸� ���� �ͼ� ��ü ����.
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			//IP �ּҸ� byte �迭�� ���
			//InetAddress ��ü���� IP �ּҸ� ����Ʈ �迭�� ����.
			//IP �ּҸ� ����Ʈ �迭�� ������ �� ����Ʈ�� ���� IP �ּҸ� �ٷ� �� ����.
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address byte�� ����.");
			for(byte ip : ipAddress) {
				System.out.print(ip + ".");
			}
			System.out.println();//����. ���� ����.
			
			//������ �� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ���.
			InetAddress[] allAddress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ����.");
			for(InetAddress addr : allAddress) {
				System.out.println(addr.getHostAddress());
			}
			//ȣ��Ʈ �̸� ���
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			//���� ȣ��Ʈ�� IP �ּ� ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Address : " + localHost.getHostAddress());
			
			//��Ƽ ĳ��Ʈ �ּ� ���� Ȯ��
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("��Ƽ ĳ��Ʈ �ּ��Դϱ�? " + isMultiCast);
			
			//ȣ��Ʈ �̸��� �̿��ؼ� InetAddress ��ü ����.
			InetAddress name = InetAddress.getByName("www.facebook.com");
			System.out.println("IP �ּ� �̸� : " + name.getHostAddress());
			
			//ȣ��Ʈ ������ �̸� ���� ����
			//ȣ��Ʈ�� ����ȭ ��(FQDN) ������ �̸��� ����.
			//FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("Ǯ ���� : " + hostFullName);
			
			//LoopPack
			boolean isLoopPack = address.isLoopbackAddress();
			System.out.println("�����ΰ���? " + isLoopPack);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
