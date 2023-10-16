package com.kh.threadPractice;

import java.io.IOException;

public class MainSample {
	static boolean a = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread gg = new Thread(new TheGame());
		gg.start();
		
		try {
			System.in.read();
			a = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
