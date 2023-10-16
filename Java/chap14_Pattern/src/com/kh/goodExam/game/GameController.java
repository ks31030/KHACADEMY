package com.kh.goodExam.game;
/*�������� ���ٿ� ������
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
		//���� �޽��� �����ִ� �� ����ϰ�
		view.displayMessage();
		// ��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		//��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ� �� view
		while(isTrue) { //false�� �� ������ �ݺ�
			//���� �����ϴ� ���� �Է�����
			view.displayGuessPromt();
			
			int guess = sc.nextInt();
			if(model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				//isTrue = false;
				break;
			} else {
				//��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� �ٸ� �� view
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
