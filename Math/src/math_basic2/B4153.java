package math_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			/*
			int[] arr = {a, b, c};
			
			int max = Math.max(a, b);
			int rmax = Math.max(max, c);
			*/
			if(a == 0 && b == 0 && c == 0) { 
				break;
			}
			if(a * a == (b * b) + (c * c)) {
				System.out.println("right");
			}
			else if(b * b == (a * a) + (c * c)) {
				System.out.println("right");
			}
			else if(c * c == (a * a) + (b * b)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	}
	
}
