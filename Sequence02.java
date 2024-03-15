package sequence;

import java.util.Scanner;

public class Sequence02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요(원):");
		int n = scan.nextInt();
		int num500 = n / 500;
		int num100 = n % 500 / 100;
		System.out.println(">>500원 동전 "+num500+"개와 100원 동전 "+num100+"개가 필요합니다.");
				
	}

}
