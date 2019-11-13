package project;

import java.util.Scanner;

public class PhoneInfor2 {

	// 키보드로 입력처리
	static Scanner kb = new Scanner(System.in);
	// 배열생성
	static Savepoint[] sp = new Savepoint[100];
	// 순서잡을 변수
	static int n = 0;

	public static void main(String[] args) {
		while (true) {
			System.out.println("[1]save [2]search [3]delete [4]exit");
			int menu = kb.nextInt();

			switch (menu) {
			case 1:
				kb.nextLine();
				insert();
				break;
			case 2:
				kb.nextLine();
				search();
				break;
			case 3:
				kb.nextLine();
				delete();
				break;
			case 4:
				return;
			default:
				System.out.println("입력을 잘못하셨습니다.");
				break;
			}
		}
	}

	public static void insert() {

		System.out.println("이름을 입력하세요 :");
		String a = kb.nextLine();
		System.out.println("전화번호를 입력하세요 :");
		String b = kb.nextLine();
		System.out.println("생년월일을 입력하세요 :(원치 않으면 '0'를 입력하세요)");
		String c = kb.nextLine();

		Savepoint list = null;

		if (c.equals("0")) {
			list = new Savepoint(a, b);
		} else {
			list = new Savepoint(a, b, c);
		}

		sp[n] = list;
		show();
		n++;

	}

	public static void show() {
		System.out.println("------------------------");
		for (int i = 0; i <= n; i++) {
			sp[i].showMe();
		}
		System.out.println("------------------------");
	}

	// 포인트 int p값 반환
	public static int point(String a) {
		int p = -1;

		for (int i = 0; i < n; i++) {
			if (sp[i].name.equals(a)) {
				p = i;
			}
		}

		return p;
	}

	public static void search() {
		System.out.println("찾을 대상의 이름을 입력하세요");
		String find = kb.nextLine();

		sp[point(find)].showMe();

	}

	public static void delete() {
		System.out.println("삭제할 대상의 이름을 입력하세요");
		String away = kb.nextLine();

		int p = point(away);

		for (int i = p; i <= n - 1; i++) {
			sp[i] = sp[i + 1];
		}
		n = n - 2;
		show();

	}

}
