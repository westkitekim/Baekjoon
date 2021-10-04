package math_basic2;

import java.util.Scanner;

public class B3009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//3개의 좌표 입력
		int[] coordinate1 = { scan.nextInt(), scan.nextInt()};
		int[] coordinate2 = { scan.nextInt(), scan.nextInt()};
		int[] coordinate3 = { scan.nextInt(), scan.nextInt()};
		
		scan.close();
		
		int x; int y;
		
		//각각의 x와 y좌표가 중복되지 않는 값 찾아서 x, y에 할당
		if(coordinate1[0] == coordinate2[0]) x = coordinate3[0];
		else if(coordinate1[0] == coordinate3[0]) x = coordinate2[0];
		//2번과 3번이 같은 경우만 남았기 때문에 else 사용
		//처음 if 조건의 부정은 1, 3이 같은 경우와 2, 3 이 같은 경우가 남는다
		else x = coordinate1[0];
		
		if(coordinate1[1] == coordinate2[1]) y = coordinate3[1];
		else if(coordinate1[1] == coordinate3[1]) y = coordinate2[1];
		//2번과 3번이 같은 경우만 남았기 때문에 else 사용
		//처음 if 조건의 부정은 1, 3이 같은 경우와 2, 3 이 같은 경우가 남는다
		else y = coordinate1[1];
		
		System.out.println(x + " " + y);
	}
}






