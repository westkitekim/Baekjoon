package math_basic2;

import java.util.Scanner;

public class B3053 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		
		System.out.println();
		scan.close();
		
		System.out.println(r * r * Math.PI);//��Ŭ���� ���� ���� ��r^2
		System.out.println(2 * r * r);//r��Ʈ2 ^2 ���λ� �Ÿ� --> ���� ������ ����
		
	}
}
