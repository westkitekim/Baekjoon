package recursion_function;

import java.util.Scanner;

public class B10870 {
	public static int f_seq(int n) {
		//�ڵ� ���̱�! 
		//if(n <= 1) return n;
		if(n == 0) return 0;
		if(n == 1) return 1;
		//���� �� 2���� ��
		return f_seq(n-1) + f_seq(n-2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(f_seq(n));
		
	}
}
