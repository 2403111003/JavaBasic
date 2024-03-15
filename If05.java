package Select;

import java.util.Scanner;

public class If05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 ");
		int a = in.nextInt();
		
		if (a<0) {
			System.out.println("양수가 아닙니다.");
		}
		else {
			if (a%2==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
	}

}
