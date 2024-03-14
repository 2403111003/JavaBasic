package Select;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입렷하세요.");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int max = x;
		
		if (y > max) {
			max = y;
		}
		
		if (z > max) {
			max = z;
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		}
	

}
