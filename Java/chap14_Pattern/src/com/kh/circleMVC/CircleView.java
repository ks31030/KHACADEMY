package com.kh.circleMVC;

import java.util.Scanner;

public class CircleView {
	public double getUserInput() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			return sc.nextDouble();
			
		}
	public void runResult(double result) {
		System.out.println("��� : " + result);
	}
		
	}

