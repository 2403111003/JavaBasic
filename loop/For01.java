package loop;

import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력 하세요 : ");
		int a = input.nextInt();
		int b = 0;
				
		for (int i = 1;i <= a;i++) {
			b += i;
		}
	System.out.println("1부터 "+a+"까지의 합은 "+b+"입니다.");}

}