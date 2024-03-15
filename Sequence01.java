package sequence;

import java.util.Scanner;

public class Sequence01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = scan.nextInt();
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = scan.nextInt();
		System.out.println();
		System.out.println("Swapping 결과 >");
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("변수 a의 값 = "+a);
		System.out.println("변수 b의 값 = "+b);
		
	}
	

}
