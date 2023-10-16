package com.kh.gettersetter;

public class PlayerCharacter {

		private String name;
		private int health;
		private int attackPower;
	/*
	 getter
	 	데이터 복사본을 던져주기 때문에 원래 객체의 데이터는 손상시키지 않음. 원본 데이터는 안전함.
	 */
		public String getName() {
			return name;
		}
		public int getHealth() {
			return health;
		}
		public int getAttackPower() {
			return attackPower;
		}
	/*
	 setter
	 	외부에서 메서드를 통해 데이터에 접근을 하게 된다면 메서드는 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있음.
	 */
		public void setName(String name) {
			this.name = name;
		}
	
		public void setHealth(int health) {
			if(health>0) {
				this.health = health;
			} else { //체력이 0 이하라면 체력을 표시할 가치도 없다.
				System.out.println("체력이 없습니다.");
			}
			
		}
		//0 미만의 값을 넣어도 0 이하의 값이 출력되지 않음.
		public void setAttackPower(int attackPower) {
			//만약에 파워가 0보다 클 경우
			if(attackPower > 1) {
				this.attackPower = attackPower;
			} else {
				this.attackPower = 0;
				System.out.println("파워가 부적절합니다.");
			}
		}

		
		//캐릭터 정보 출력
		public void displayInfo() {
			System.out.println("캐릭터 정보 : " + name);
			System.out.println("체력 정보 : " + health);
			System.out.println("공격력 : " + attackPower);
		}
		
		//캐릭터 공격하는 출력 메서드
		public void attack(PlayerCharacter target) {
			System.out.println(name + "(이)가 공격을 했습니다. " + target.getName() + "에게 " + attackPower + " 데미지 발생!");
		}
		
		//다른 캐릭터로부터 공격 받았을 때 메서드
		public void takeDamage() {
			System.out.println("공격받았습니다.");
		}
}
