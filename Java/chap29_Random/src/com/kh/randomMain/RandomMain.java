package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Random : 난수를 생성하기 위해 사용되는 클래스.
//난수 : 무작위로 만들어진 수
public class RandomMain {

	public static void main(String[] args) {
		//로또 번호 생성기
		RandomMain rm = new RandomMain();
		rm.Lotto();
//		rm.RandomExam();
	}
	
	public void Lotto() {
		Random rd = new Random();//랜덤객체생성.
		//ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();
		//중복을 피하기 위해 set을 사용할 수 있음.
		//6개의 숫자만 들어갈 것.
		while(lottoNum.size()<6) {//0, 1, 2, 3, 4, 5
			// 1~45 범위를 지정해서 난수 생성
			int ranNum = rd.nextInt(45)+1;//0~99 사이에서 1개. +1을 해주는 이유 : 1부터 45까지 수 중에 1개를 뽑아야 하기 때문.
			//존재하는 지 여부 중복X. 중복된 값이 list에 저장될 수 있음.
			if(!lottoNum.contains(ranNum)) {//!가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프.
				lottoNum.add(ranNum);
			}
		}
		System.out.print("로또 번호 : " + lottoNum);
	}
	
	public void RandomExam() {
		Random rd = new Random();//랜덤객체생성.
		
		//1. 정수 범위 내에서 랜덤인 난수를 만들어야겠다.
		int ranI = rd.nextInt(100)+1;//0~99 사이에서 1개
		System.out.println(ranI);
		
		//2. 실수 범위 내에서 랜덤인 난수를 만들어야겠다.
		double ranD = rd.nextDouble();//0.0~1.0 사이에서 1개
		System.out.println(ranD);
		
		//3. boolean 값 랜덤으로 생성.
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}
