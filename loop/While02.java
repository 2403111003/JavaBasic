package loop;

import java.util.Scanner;

public class While02 {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 1;
		while (num != 0) {
		System.out.print("숫자를 입력하세요 : ");
		num = input.nextInt();
		sum += num;
		}
	System.out.println("지금까지의 숫자의 합은 " + sum +"입니다.");}
}