package loop;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력 하세요 : ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("[ 구구단 "+a+"단 ]");
		for (int i = 1;i <= 9; i++) {
			System.out.println(a+" x "+i+" = "+(a*i));
		}
	}
}
