package loop;

import java.util.Scanner;

public class DoWhlic01 {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		do 	{System.out.print("숫자를 입력 하세요 : ");
			num = input.nextInt();
			sum += num;
		}while(num != 0);
		System.out.println("지금까지의 입력한 숫자의 합은 "+ sum + "입니다.");
	}
}