package com.kh.tcpMain;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception {
//		try {
			//���� ������ ��Ʈ ��ȣ�� ���� ����.
			//���� �ּҿ� ��Ʈ ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ� ��.
			Socket socket = new Socket("localHost", 4444);
			System.out.println("Server Connect");
			//���� �� �ڵ�
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("HI SERVERRR");
			printStream.flush();
			//�����κ��� �о� ��.
			InputStream inStream = socket.getInputStream();
			Scanner sc = new Scanner(inStream);
			System.out.println("[Client] Server : " + sc.nextLine());
			
			socket.close();
			System.out.println("Byte Server See you later!");
			
//			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			//���� �Ǵ��� �׽�Ʈ �޽���
//			out.println("�ȳ� ����?");
//			//�����κ��� �޽��� ���޵Ǵ��� Ȯ�� �׽�Ʈ
//			String response = in.readLine();
//			System.out.println("���� ���� : " + response);
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
