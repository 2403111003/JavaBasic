package Select;

import java.util.Scanner;

public class If04 {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
		int num = input.nextInt();
		if (num >= 90) {
		System.out.println("학점은 A입니다.");
	}
	    else if (num >= 80) {
		System.out.println("학점은 B입니다.");
	}
	    else if (num >= 70) {
		System.out.println("학점은 C입니다.");
	}
	    else if (num >= 60) {
		System.out.println("학점은 D입니다.");
	}
	    else {
	    	System.out.println("학점은 F입니다.");
	}
}}
