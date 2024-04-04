package NoOP;

import java.util.Scanner;

public class mg0523 {
	static final int NUM_MENU = 4;
	static String[][] bookList = { { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
			{ "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
			{ "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } };
	static int[] cartList = { 0, 0, 0};
	static int numCartItem = 0;
	public static void main(String[] args) {
		displaywelcome();

		boolean quit = false;
		while (!quit) {
			int menu = displayGetmenu();
			switch (menu) {
			case 1:
				menuBooklist();
				break;
			case 2:
				menuCartlist();
				break;
			case 3:
				menuAddCartItem();
				break;
			case 4:
				menuClearCart();
				break;
			case 0:
				menuExit();
				quit = true;
				break;
			default:
				menuWrongNumber();
			}
		}
	}

	static void displaywelcome() {
		String welcome = "*****************************************\n" + "*     Welcome to MinGyu Book Market     *\n"
				+ "*****************************************";
		System.out.println(welcome);
	}

	static int displayGetmenu() {
		System.out.printf("=========================================\n" + "1. 도서 목록 보기\n" + "2. 장바구니 보기\n"
				+ "3. 장바구니에 도서 추가\n" + "4. 장바구니 비우기\n" + "0. 종료\n" + "=========================================\n");
		System.out.print(">> 메뉴 선택 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	static void menuBooklist() {
		System.out.printf(">> 도서 목록 \n" + "------------------------------------------------------------------------ \n");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s %s %s %s %s\n", bookList[i][0], bookList[i][1], bookList[i][2], bookList[i][3],
					bookList[i][4]);
		}
		System.out.printf("------------------------------------------------------------------------ \n");
	}

	static void menuCartlist() {
		if (numCartItem == 0) {
			System.out.printf(">> 장바구니가 비어 있습니다. \n");
		} else {
			System.out.printf(">> 장바구니 보기 \n"
					+"------------------------------------------------------------------------ \n");
			for(int i = 0;i < cartList.length; i++) {
				if (cartList[i] != 0)
					System.out.printf("%s권, %s, %s, %s, %s \n",cartList[i],bookList[i][1],bookList[i][2],bookList[i][3],bookList[i][4]);
		}
			System.out.printf("------------------------------------------------------------------------ \n");
	}
}
	static void menuAddCartItem() {
		Scanner sc = new Scanner(System.in);
		boolean h = true;
		boolean l = true;
		while (l) {
			menuBooklist();
			System.out.printf("추가할 도서 ID 입력 : ");
			String t = sc.next();
			switch (t) {
			case "ID2401":
				cartList[0] += 1;
				numCartItem++;
				System.out.printf(">> 장바구니 추가 : ");
				System.out.printf("%s\n", bookList[0][1]);
				l = false;
				h = false;
				break;
			case "ID2402":
				cartList[1] += 1;
				numCartItem++;
				System.out.printf(">> 장바구니 추가 : ");
				System.out.printf("%s\n", bookList[1][1]);
				l = false;
				h = false;
				break;
			case "ID2403":
				cartList[2] += 1;
				numCartItem++;
				System.out.printf(">> 장바구니 추가 : ");
				System.out.printf("%s\n", bookList[2][1]);
				l = false;
				h = false;
				System.out.print(numCartItem);
				break;
			default:
				l = false;
			}
			/*
			 * for (int i = 0; i < cartList.length; i++) { if
			 * (bookList[i][0].equals(t)) { cartList[numCartItem++] = i;
			 * System.out.printf(">> 장바구니 추가 : "); System.out.printf("%s\n",
			 * bookList[i][1]); l = false; h = false; break; } }
			 */
		}
		if (h) {
			System.out.printf(">> 없는 ID 입니다. 도서 목록에 있는 ID를 입력 하세요. \n");
		}
	}

	static void menuClearCart() {
		if (numCartItem != 0) {
			for (int i = 0; i < cartList.length; i++) {
				cartList[i] = 0;
			}
			numCartItem = 0;
			System.out.printf(">> 장바구니에 있는 아이템을 모두 삭제하였습니다. \n");
		}else {
			System.out.printf(">> 장바구니가 비어 있습니다. \n");
		}
	}

	static void menuExit() {
		System.out.printf(">> MinGyu Book Market을 종료합니다. \n");
	}

	static void menuWrongNumber() {
		System.out.printf("없는 메뉴입니다. 0번부터 " + NUM_MENU + "번까지의 메뉴 중에서 선택하세요. \n");
	}
}