package math_basic2;

import java.util.Scanner;

public class B3009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//3���� ��ǥ �Է�
		int[] coordinate1 = { scan.nextInt(), scan.nextInt()};
		int[] coordinate2 = { scan.nextInt(), scan.nextInt()};
		int[] coordinate3 = { scan.nextInt(), scan.nextInt()};
		
		scan.close();
		
		int x; int y;
		
		//������ x�� y��ǥ�� �ߺ����� �ʴ� �� ã�Ƽ� x, y�� �Ҵ�
		if(coordinate1[0] == coordinate2[0]) x = coordinate3[0];
		else if(coordinate1[0] == coordinate3[0]) x = coordinate2[0];
		//2���� 3���� ���� ��츸 ���ұ� ������ else ���
		//ó�� if ������ ������ 1, 3�� ���� ���� 2, 3 �� ���� ��찡 ���´�
		else x = coordinate1[0];
		
		if(coordinate1[1] == coordinate2[1]) y = coordinate3[1];
		else if(coordinate1[1] == coordinate3[1]) y = coordinate2[1];
		//2���� 3���� ���� ��츸 ���ұ� ������ else ���
		//ó�� if ������ ������ 1, 3�� ���� ���� 2, 3 �� ���� ��찡 ���´�
		else y = coordinate1[1];
		
		System.out.println(x + " " + y);
	}
}






