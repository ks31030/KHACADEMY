import java.util.Scanner;

public class Pizza1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �ο��� ���� �����ϼ��� : ");
			int n = sc.nextInt();
	        //����̵� ���ڸ� 7�� �������� �� �������� ������ +1�� �ϸ� �ǳ�,
	        //�� �������� ���¿� �� ��ų �ʿ� ����(n%7==0).
	        int answer = (n%7==0) ? n/7 : n/7 + 1;
	        //���׿����� Ȱ���Ͽ�, n�� 7�� ����� n/7(��), 7�� ����� �ƴϸ� n/7+1(����)
	        System.out.println("���Ѿ� �ϴ� �ּ� ������ �� : " + answer);
	}
}
