package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("[홍길동]");
		
		player1.setHealth(-10); // -10체력 저장해주고
		player1.ValidHealth(); // -10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		
		player1.setAP(-20);
		player1.ValidAP();
		
		player1.displayInfo();
		
		System.out.println();
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName("[김석]");
		
		player2.setHealth(1000);
		player2.ValidHealth();
		
		player2.setAP(-30);
		player2.ValidAP();
		
		player2.displayInfo();
	
	}

}
