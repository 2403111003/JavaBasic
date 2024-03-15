package Select2;

import java.util.Scanner;

public class StringConv {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하세요:");
	int a = Integer.parseInt(in.next());
	int b = Integer.parseInt(in.next());	
	int c = Integer.parseInt(in.next());
	int max = a;
	if (max<b) {
		max = b;
	}
	if (max<c) {
		max = c;
	}
	System.out.println("가장큰수는"+max+"입니다."); 
	}
}
