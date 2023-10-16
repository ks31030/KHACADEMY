package com.kh.goodExam.game;
/*랜덤숫자 업다운 만들어보기
guess < secretNumber -> Up
guess > secreretNumber -> Down
*/
import java.util.Scanner;

public class GameController {
	//		 String  
	private GameModel model;
	private GameView view;
	
	public GameController (GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	public void runGame() {
		//최초 메시지 보여주는 거 출력하고
		view.displayMessage();
		// 스캐너 입력해서 입력값 호출
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		//컴퓨터가 생각한 숫자를 맞췄을 때 불러 올 view
		while(isTrue) { //false가 될 때까지 반복
			//숫자 추측하는 값을 입력하자
			view.displayGuessPromt();
			
			int guess = sc.nextInt();
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				//isTrue = false;
				break;
			} else {
				//컴퓨터가 생각한 숫자와 내가 입력한 숫자가 다를 때 view
				view.displayInCorrectGuess();
				view.displayAttempts(model.getAttempts());
			}
		}
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
		
		c.runGame();
	}
}
