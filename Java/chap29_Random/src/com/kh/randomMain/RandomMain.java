package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����.
//���� : �������� ������� ��
public class RandomMain {

	public static void main(String[] args) {
		//�ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();
//		rm.RandomExam();
	}
	
	public void Lotto() {
		Random rd = new Random();//������ü����.
		//ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		//�ߺ��� ���ϱ� ���� set�� ����� �� ����.
		//6���� ���ڸ� �� ��.
		while(lottoNum.size()<6) {//0, 1, 2, 3, 4, 5
			// 1~45 ������ �����ؼ� ���� ����
			int ranNum = rd.nextInt(45)+1;//0~99 ���̿��� 1��. +1�� ���ִ� ���� : 1���� 45���� �� �߿� 1���� �̾ƾ� �ϱ� ����.
			//�����ϴ� �� ���� �ߺ�X. �ߺ��� ���� list�� ����� �� ����.
			if(!lottoNum.contains(ranNum)) {//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���.
				lottoNum.add(ranNum);
			}
		}
		System.out.print("�ζ� ��ȣ : " + lottoNum);
	}
	
	public void RandomExam() {
		Random rd = new Random();//������ü����.
		
		//1. ���� ���� ������ ������ ������ �����߰ڴ�.
		int ranI = rd.nextInt(100)+1;//0~99 ���̿��� 1��
		System.out.println(ranI);
		
		//2. �Ǽ� ���� ������ ������ ������ �����߰ڴ�.
		double ranD = rd.nextDouble();//0.0~1.0 ���̿��� 1��
		System.out.println(ranD);
		
		//3. boolean �� �������� ����.
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}
