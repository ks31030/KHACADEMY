package com.kh.gettersetter.goodExam;

public class GoodPlayer {

		private String name;
		private int health;
		private int attackPower;
		
		public void setName(String name) {//�̸��� ����Ǹ� ����� set
			this.name = name;
		}
		//�����ϴ� valid 
		public void ValidName() {//ĳ�����̸��� ������ ������ ����!
			if(this.name == "") {
				this.name = "No Name";
				//System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
			}
		}
		public String getName() { //ĳ�����̸��� ��ȯ.
			return name;
		}
		public void setHealth(int health) {//�Ű������� ����� ü�� �����ϴ� ��
			this.health = health;
		}
		//�����ϴ� valid
		public void ValidHealth() {//ü���� 0 �������� ����!
			if(this.health <= 0) {
				this.health = 0;
			}
		}
		public int getHealth() { //ü���� ��ȯ.
			return health;
		}
		public void setAP(int attackPower) {//���ݷ��� ����Ǹ� ����� set
			this.attackPower = attackPower;
		}
		public void ValidAP() { //���Ἲ�ǰ� ����
			//���࿡ �Ŀ��� 0���� �۰ų� ���� ���
			if(this.attackPower <= 0) {
				this.attackPower = 0;
			}
		}
		public int getAP() {
			return attackPower;
		}
		//��¸޼��� �ۼ�
		public void displayInfo() {
			System.out.println("ĳ���� ���� : " + this.name);
			System.out.println("ü�� ���� : " + this.health);
			System.out.println("���ݷ� ���� : " + this.attackPower);
		}
		
}