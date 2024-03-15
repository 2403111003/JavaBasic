package scanner;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 타입 숫자를 입력 하세요 : ");
		int a = scan.nextInt();
		System.out.print("실수 타입 숫자를 입력 하세요 : ");
		double b = scan.nextDouble();
		System.out.println();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		}

}
