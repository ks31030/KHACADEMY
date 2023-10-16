package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    char name1, name2;
		
		System.out.print("문자 : ");
		name1 = sc.next().charAt(0);
		System.out.print(name1 + " unicode : ");
		int iname1 = name1;
		System.out.println(iname1);
		
		System.out.print("문자 : ");
		name2 = sc.next().charAt(0);
		System.out.print(name2 + " unicode : ");
		int iname2 = name2;
		System.out.println(iname2);
		
		
		
	}

}
