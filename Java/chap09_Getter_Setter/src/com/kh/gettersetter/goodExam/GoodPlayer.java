package com.kh.gettersetter.goodExam;

public class GoodPlayer {

		private String name;
		private int health;
		private int attackPower;
		
		public void setName(String name) {//이름이 변경되면 저장될 set
			this.name = name;
		}
		//검증하는 valid 
		public void ValidName() {//캐릭터이름에 공백이 없는지 검증!
			if(this.name == "") {
				this.name = "No Name";
				//System.out.println("이름을 넣지 않았습니다.");
			}
		}
		public String getName() { //캐릭터이름을 반환.
			return name;
		}
		public void setHealth(int health) {//매개변수에 저장된 체력 저장하는 곳
			this.health = health;
		}
		//검증하는 valid
		public void ValidHealth() {//체력이 0 이하인지 검증!
			if(this.health <= 0) {
				this.health = 0;
			}
		}
		public int getHealth() { //체력을 반환.
			return health;
		}
		public void setAP(int attackPower) {//공격력이 변경되면 저장될 set
			this.attackPower = attackPower;
		}
		public void ValidAP() { //무결성되게 검증
			//만약에 파워가 0보다 작거나 같을 경우
			if(this.attackPower <= 0) {
				this.attackPower = 0;
			}
		}
		public int getAP() {
			return attackPower;
		}
		//출력메서드 작성
		public void displayInfo() {
			System.out.println("캐릭터 정보 : " + this.name);
			System.out.println("체력 정보 : " + this.health);
			System.out.println("공격력 정보 : " + this.attackPower);
		}
		
}