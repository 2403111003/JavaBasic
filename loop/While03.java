package loop;

import java.util.Scanner;

public class While03 {
	public static void main(String[] agrs) {
		int a = 1;
		
		while (a == 1) {
			System.out.print("숫자를 입력 하세요 : ");
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			
			if (x % 2 == 0) {
				System.out.println(">> 짝수입니다.");
			}
			else {
				System.out.println(">> 홀수입니다.");
			}
		System.out.print("게속 하시겠습니까? (0-멈춤/1-계속) : ");
		a = input.nextInt();
		}	
	}
}