package com.kh.gettersetter;
  
public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("[홍길동]");
		player1.setHealth(1000);
		player1.setAttackPower(99999);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("[길동아부지]");
		player2.setHealth(100);;
		player2.setAttackPower(30);
	
		player2.displayInfo();
		
		System.out.println("Attack 후!!!");
		
		player1.attack(player2);
	}

}
