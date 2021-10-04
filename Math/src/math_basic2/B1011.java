package math_basic2;

import java.util.Scanner;

public class B1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testNum = scan.nextInt();
		// 결과값 담을 배열
		int max = 0;
		int count = 1;
		/*
		 * 규칙찾기 1. distance 가 제곱수, max * (max + 1) 일때마다 count++ 2.
		 * 
		 */
		for (int i = 0; i < testNum; i++) {
			int position1 = scan.nextInt();
			int position2 = scan.nextInt();

			int distance = position2 - position1;
			for (int k = 1; k <= distance; k++) {
				if ((int) Math.sqrt(k) == Math.sqrt(k)) {
					max++;

				}
			}

			for (int j = 2; j <= distance; j++) {

				if ((int) Math.sqrt(j-1) == Math.sqrt(j-1)) {
					count++;

				}
				if (j-1 == max * (max + 1)) {
					count++;
				}
			}
			System.out.println(count);
		}

		scan.close();
	}
}
