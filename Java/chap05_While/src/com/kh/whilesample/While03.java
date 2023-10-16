package com.kh.whilesample;
  
public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력
		int i = 1;
		/*i가 1부터 10까지 출력하게 하기*/
		while (i <= 10) { //i가 5보다 같거나 작을 때 true.
			//숫자가 5가 될 때 출력을 멈추고 싶어.
			System.out.println(i);//위 부등호가 참일 경우 출력.
			i++; // -> 무한루프 끝나게 만들기 / i++만 쳐도 가능.
			/*i++일 때 i가 1인 값을 먼저 대입했기 때문에 ++가 작동하지 않음. 무한루프 발생.
			 ++i일 때에는 i에 +1을 먼저 대입 1~10까지 출력 가능. 무한루프 발생하지 않음.
			 */
		}

	}

}
