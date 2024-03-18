package loop;

import java.util.Scanner;

public class For05 {
	public static void main(String[] agrs ) {
		Scanner input = new Scanner(System.in);
		System.out.print("양의 숫자를 입력 하세요 : ");
		int n = input.nextInt();		
		int a = 0;
		while (n < 0) {
			System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			n = input.nextInt();
		}
		for (int i = 1;i <= n;i++) {
			a += n;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+a+"입니다.");
	}
}
