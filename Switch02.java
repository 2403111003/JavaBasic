package Select;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("당신의 등급을 입력 하세요 :");
		String a = in.next();
		
		switch(a) {
		case "A","B" :
			System.out.println("아주 열심히 하셨군요~~~!!");
			break;
		case "C" :
			System.out.println("남들만큼 하셨네요~~~");
			break;
		case "D" :
			System.out.println("조금더 노력이 필요합니다.");
			break;
		case "F" :
			System.out.println("교수실로 찾아오세요");
			break;
		default	:
			System.out.println("등급을 입력하세요 ");
			
		}
		
	}
}
