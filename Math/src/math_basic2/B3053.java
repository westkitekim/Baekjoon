package math_basic2;

import java.util.Scanner;

public class B3053 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		
		System.out.println();
		scan.close();
		
		System.out.println(r * r * Math.PI);//유클리드 원의 넓이 πr^2
		System.out.println(2 * r * r);//r루트2 ^2 도로상 거리 --> 원이 나오지 않음
		
	}
}
