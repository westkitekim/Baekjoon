package math_basic2;

import java.util.ArrayList;
import java.util.Scanner;

public class B9020 {
	// ���� 4 <= n <= 10000
	// ���� 0 ~ 10000
	// main�Լ�, getPrimeNum()���� ���
	public static boolean[] primeNum = new boolean[10001];

	// static ��ü �������� �ٷ� ���
	public static void getPrimeNum() {
		primeNum[0] = primeNum[1] = true;

		for (int i = 2; i <= Math.sqrt(primeNum.length); i++) {
			if (primeNum[i])
				continue;
			for (int j = i * i; j < primeNum.length; j += i) {
				primeNum[j] = true;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();;
		Scanner scan = new Scanner(System.in);
		// �Ҽ� �Ǻ�
		getPrimeNum();
		int T = scan.nextInt();
		// T�� 1���� �ٿ����鼭 Testcase ������ŭ ����

		while (T-- > 0) {
			
			int n = scan.nextInt();
			int firstNum = n / 2;
			int secondNum = n / 2;
			
			//����� ���� ������ �����Ƿ� �Ҽ� + �Ҽ��� ã�� ������ �ݺ�
			while (true) {
				if (!primeNum[firstNum] && !primeNum[secondNum]) {
					//System.out.println(firstNum + " " + secondNum);
					list.add(Integer.toString(firstNum) + " " + Integer.toString(secondNum));
					break;
				}
				firstNum--;
				secondNum++;
			}
			
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
