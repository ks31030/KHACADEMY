package com.kh.gettersetter;
  
public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("[ȫ�浿]");
		player1.setHealth(1000);
		player1.setAttackPower(99999);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("[�浿�ƺ���]");
		player2.setHealth(100);;
		player2.setAttackPower(30);
	
		player2.displayInfo();
		
		System.out.println("Attack ��!!!");
		
		player1.attack(player2);
	}

}
