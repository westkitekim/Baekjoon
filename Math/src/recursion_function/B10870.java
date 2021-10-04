package recursion_function;

import java.util.Scanner;

public class B10870 {
	public static int f_seq(int n) {
		//코드 줄이기! 
		//if(n <= 1) return n;
		if(n == 0) return 0;
		if(n == 1) return 1;
		//이전 값 2개의 합
		return f_seq(n-1) + f_seq(n-2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(f_seq(n));
		
	}
}
