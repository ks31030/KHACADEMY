package com.kh.goodExam.game;

public class GameView {
	private String StartMsg1 = "���� ���߱� ������ �����մϴ�.";
	private String StartMsg2 = "1���� 100 ������ ���ڸ� ���� ������.";
	public void displayMessage() {
		System.out.println(StartMsg1);
		System.out.println(StartMsg2);
	}
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�Ǵ��� ���� �Ŷ� �õ�Ƚ�� ��������.
	//1. ���� �����ϴ� �� �Է��ϱ�
	private String GuessMsg1 = "������ ���ڸ� �Է��ϼ���.";
	private String GuessMsg2 = "���ڸ� ������ϴ�.";
	private String GuessMsg3 = "���ڸ� Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	private String GuessMsg4 = "���� ����!";
	
	public void displayGuessPromt() {
		System.out.println(GuessMsg1);
	}
	public void displayCorrectGuess() {
		System.out.println(GuessMsg2);
	}
	public void displayInCorrectGuess() {
		System.out.println(GuessMsg3);
	}
	public void displayAttempts(int attempts) {
		System.out.println("�õ�Ƚ�� : " + attempts);
	}
	public void displayGameOver() {
		System.out.println(GuessMsg4);
	}
}
