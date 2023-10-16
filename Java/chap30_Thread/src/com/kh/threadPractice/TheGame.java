package com.kh.threadPractice;

import java.util.Random;

public class TheGame implements Runnable {
	boolean a = false;
	
	@Override
	public void run() {
		while(!a) {
			int rv = new Random().nextInt(10);
			System.out.println("랜덤숫자 : " + rv);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게임 종료");
			
		}
	}

}
