package com.kh.arraysample;

import java.util.Scanner;
  
public class Array03 {
	public static void main(String[] args) {
		/*
		 1. ���ڿ��� �Է� �޾� 
		 2. ���� �ϳ� �ϳ� �迭�� �ְ� 
		 	- String �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
		 	- char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
		 	- String �ȿ� char�迭�� ����� �ִ� �༮ -> toCharArray
		 	- ex) String �ȳ��ϼ��� = {'��','��','��','��','��'} 
		 3. �˻��� ���� Scanner
		 4. ���ڰ� ���ڿ��� � ���� ������
		 5. ���° �ε����� ��ġ����
		 6. �ε��� ����ϱ� 
		 */ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���."); //1. ���ڿ��� �Է� �޾�
		String inputString = sc.next();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���."); //�˻��� ����
		char searchChar = sc.next().charAt(0); //ù��°
		//���ڿ��� -> ���ڷ� ��ȯ.
		//�ȳ��ϼ���. -> {'��' '��' '��' '��' '��'}
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		//���ڿ��� -> ���ڷ� ��ȯ.
		//String -> char
		//�˻��� ���ڰ�`
		char[] charString = inputString.toCharArray();
		//���ڿ��� � ���� ������ -> length
		int charCount = charString.length;
		System.out.println("charCount : " + charCount);
		//���° �ε����� ��ġ���� �ε��� ����ϱ� -> index
		//�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		int count = 0;
		System.out.println(inputString + "�� " + searchChar + "�� �����ϴ� ��ġ(�ε���)");
		//�ݺ����� ����ؼ� ��ġ ã��.
		for(int i = 0; i < charCount; i++) {
			//���࿡ ���� �� ���ڸ� �˻����� �� �� ���ڴ� ���° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if(charString[i] == searchChar) {//charString[i] �������� �ƴ϶� i���� �Ǿ�� �ϴ� ������
				//searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ� �־�� ��.
				//���ڹ迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
				System.out.println(i);
				
			}
			count++;
		}
		
	}

}
