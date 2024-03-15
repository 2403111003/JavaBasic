package scanner;

import java.util.Scanner;

public class Scannr02 {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요.(cm): ");
		int x = scan.nextInt();
		System.out.println("원의 넓이는 "+(PI*x*x)+"입니다.");
	}

}
