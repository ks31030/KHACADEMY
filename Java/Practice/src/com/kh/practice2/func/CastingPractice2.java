package com.kh.practice2.func;

import java.util.*;
  
public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double grd1, grd2, grd3;
		
		System.out.print("���� : ");
		grd1 = sc.nextDouble();
		
		System.out.print("���� : ");
		grd2 = sc.nextDouble();
		
		System.out.print("���� : ");
		grd3 = sc.nextDouble();
		
		double dall = (grd1 + grd2 + grd3);
		int iall = (int) dall;
		int iall2 = iall/3;
		
		System.out.println("���� : " + iall);
		System.out.print("��� : " + iall2);
	}

}
