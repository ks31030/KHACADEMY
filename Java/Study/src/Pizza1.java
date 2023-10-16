import java.util.Scanner;

public class Pizza1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피자 먹을 인원의 수를 설정하세요 : ");
			int n = sc.nextInt();
	        //몇명이든 피자를 7로 나누었을 때 나머지가 있으면 +1판 하면 되나,
	        //딱 떨어지면 구태여 더 시킬 필요 없음(n%7==0).
	        int answer = (n%7==0) ? n/7 : n/7 + 1;
	        //삼항연산자 활용하여, n이 7의 배수면 n/7(참), 7의 배수가 아니면 n/7+1(거짓)
	        System.out.println("시켜야 하는 최소 피자의 수 : " + answer);
	}
}
