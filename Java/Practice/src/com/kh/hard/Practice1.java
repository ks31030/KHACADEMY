package com.kh.hard;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 ����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		 ��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		 ���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
		 ex) 2, 3, 5, 7, 11 �� 
		 */
		//����ڷκ��� ���� �Է� �޾ƶ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int count = 1; //�Ҽ��� �ƴ� ���� ������ ��Ÿ��.
		// ��, �Է��� ���� 2���� ���� ��� "�߸� �Է��ϼ̽��ϴ�."�� ����ϼ���.
		if (num < 2) { // ���� �Է��� ���� 2���� ���� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else { //���� �Է��� ���� 2���� Ŭ ���
			//���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
			//ex) 2, 3, 5, 7, 11 �� 
			//�Ҽ��Դϴ�. �Ҽ��� �ƴմϴ�. �߸� �Է��ϼ̽��ϴ�.
			//�Ҽ����� �ƴ��� �Ǻ��ϴ� boolean
			boolean checkNum = true;
			//�Ҽ� ���θ� �Ǵ��ϱ� ���� boolean ���� checkNum �ʱ�ȭ ó������ �Ҽ� ����.
			for (int i = 2; i <= num; i++) {//2���� �Է¹��� ���� num ������ �ݺ��� �Ҽ��� ã�� ����.
				//for���� Ȱ���ؼ� ��Ÿ�� ���.
				for(int a = 2; a * a<= i; a++) {//�Է¹��� ���ڰ� ���� ���� i�� �Ҽ����� �Ǵ��ϱ� ���� �ݺ���
					/*
					 i-1 �ؾ� �� ��� a*a ��� �־��.
					 ���� i�� �Ҽ����� Ȯ���Ϸ��� 2���� i -1���� ��� ���ڷ� if�� ������ ����� ����� �� ����.
					 a * a ����ϴ� ���� :
					 ���� i�� � ���� a�� ������ �������ٸ� i�� a�� ������ i/a ���� i�� ��� �� �ϳ�.
					 �̶� i�� a���� ū ���ڷ� ���� ���� ������ �̹� a�� �������� �ʱ� ������ i/a�� i/a���� ū �ٸ� ���ڷ� ������ �������� ����.
					 a�� i�� ������ i/a ���� i�� ����̰�, a�� i/a�� ���� �ٸ� ���ڰ� �ȴ�.
					 i�� �Ҽ����� �Ǻ��ϱ� ���� 2���� i-1���� ��� ���� ��� 2���� i������ ���ڷθ� �������� �Ҽ����� �Ǻ��� �� �ִ�.
					 a * a�� ����ϴ� ���� �Ҽ� �Ǻ� �˰������� ����ȭ �ϱ� ���� ���Ǵ� ���.
					 sqrt(i) : i�� �������� ��Ÿ���� �Լ�.
					 ex) sqrt(16) ����� 4�� ��. 16�� �������� 4��� ��.
					 �Ҽ��Ǻ� sqrt(i) �Ҽ��� �Ǻ��� �� i�� �Ҽ����� Ȯ���ϱ� ���� 2���� sqrt(i)������ ���ڷθ� ������
					 ��귮�� ���̰� ȿ�������� �Ҽ��� �Ǻ��� �� ����.
					 */
					if(i % a == 0) {
					//���࿡ �Ҽ��� �ƴ� ���
						checkNum = false;
						count++;
						break;
					}
					if(checkNum) {
						//�Ҽ��� �� ���� ���.
						System.out.println(i);//��� �޼ҵ� �ۼ�
					}
					checkNum = true;
				}
				System.out.println("�Ҽ��� �� ���� : " + (num - count));
				// ��� ���� �˻簡 ���� ��, �Ҽ��� �ƴ� ���� ������ ���� �Ҽ��� �� ������ ���.
			}
		}

	}

}