package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("[ȫ�浿]");
		
		player1.setHealth(-10); // -10ü�� �������ְ�
		player1.ValidHealth(); // -10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)���� �����Ѵ�.
		
		player1.setAP(-20);
		player1.ValidAP();
		
		player1.displayInfo();
		
		System.out.println();
		
		GoodPlayer player2 = new GoodPlayer();
		
		player2.setName("[�輮]");
		
		player2.setHealth(1000);
		player2.ValidHealth();
		
		player2.setAP(-30);
		player2.ValidAP();
		
		player2.displayInfo();
	
	}

}
