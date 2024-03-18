package loop;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력 하세요 : ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int f = 1;
		
		for (int i = a;i != 0;i--) {
			f *= i;
		}
	System.out.println(f);}
}			
		