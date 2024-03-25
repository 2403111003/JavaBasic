package jump;

import java.util.Scanner;

public class Break01 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int A = sc.nextInt();
		while (true) {
			if (A > 0) break;			
			System.out.println("0보다 큰 숫자를 입력 하세요.");
			System.out.print("숫자 입력 : ");
			 A = sc.nextInt();
		}
		int B = 0;
		for (int i = 0; i <= A; i++) {
			B += i;
		}
		System.out.println("1부터 "+A+"까지의 합 : "+B);
	}
}
