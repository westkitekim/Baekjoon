package recursion_function;

import java.util.Scanner;

public class B10872 {
	public static int recursion(int n) {
		if(n > 0) {
			return n * recursion(n-1);
			
		}else//0���� ���ߴ� ������ ������� �ȵ�
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(recursion(N));
	}
}
