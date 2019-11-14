package bookver4;

import java.util.Scanner;

public class PhoneHandler {

	// 키보드로 입력처리
	static Scanner kb = new Scanner(System.in);
	// 배열생성
	static PhoneInfor[] sp;
	static int n = 0;

	// 배열의 인스턴스생성
	public PhoneHandler(int num) {
		sp = new PhoneInfor[num];
		n = 0;
	}

	// 배열에 값을 저장할 주소값 지정
	public static void equalizing(PhoneInfor list) {
		sp[n] = list;
		showAllBasic();
		n++;
	}

	// 메인
	public static void main(String[] args) {

		PhoneHandler chart = new PhoneHandler(100);

		while (true) {
			System.out.println("[1]save [2]search [3]delete [4]print [5]exit");
			int menu = kb.nextInt();

			switch (menu) {
			case 1:
				kb.nextLine();
				chart.insert();
				break;
			case 2:
				kb.nextLine();
				chart.search();
				break;
			case 3:
				kb.nextLine();

				chart.delete();
				break;
			case 4:
				kb.nextLine();

				chart.showAll();
				break;
			case 5:
				return;

			default:
				System.out.println("입력을 잘못하셨습니다.");
				break;
			}
		}
	}

	// 값입력&저장 (menu 1)
	public void insert() {
		String key;
		do {

			System.out.println("[1]대학친구 [2]회사동료 [3]동호회인맥");
			String choice = kb.nextLine();

			System.out.println("이름을 입력하세요 :");
			String a = kb.nextLine();
			System.out.println("전화번호를 입력하세요 :");
			String b = kb.nextLine();
			System.out.println("이메일을 입력하세요 :");
			String c = kb.nextLine();

			if (choice.equals("1")) {// 대학
				System.out.println("주소를 입력하세요 :");
				String address = kb.nextLine();
				System.out.println("전공를 입력하세요 :");
				String major = kb.nextLine();
				System.out.println("학년를 입력하세요 :");
				String year = kb.nextLine();
				equalizing(new PhoneUnivInfor(a, b, c, address, major, year));
			} else if (choice.equals("2")) {// 회사
				System.out.println("회사를 입력하세요 :");
				String company = kb.nextLine();
				equalizing(new PhoneCompaanyInfor(a, b, c, company));
			} else if (choice.equals("3")) {// 동호회
				System.out.println("취미를 입력하세요 :");
				String hobby = kb.nextLine();
				equalizing(new PhoneMoim(a, b, c, hobby));
			} else {
				System.out.println("*에러*");
			}
			System.out.println("다시 입력하시겠습니까? [1]yes [2]no");
			key = kb.nextLine();
		} while (key.equals("1"));
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

	public void search() {
		System.out.println("찾을 대상의 이름을 입력하세요");
		String find = kb.nextLine();

		int f = point(find);
		if (f < 0) {
			System.out.println("찾는 대상이 없습니다");
		} else {
			sp[f].showData();
		}

	}

	public void delete() {
		System.out.println("삭제할 대상의 이름을 입력하세요");
		String away = kb.nextLine();

		int p = point(away);

		if (p < 0) {
			System.out.println("대상이 없습니다");
		} else {
			for (int i = p; i < n; i++) {
				sp[i] = sp[i + 1];
			}
		}
		n = n - 2;
		showAllBasic();
		n++;

	}

	// 출력
	public void showAll() {
		for (int i = 0; i < n; i++) {
			sp[i].showData();
			System.out.println("-------------");
		}
	}

	public static void showAllBasic() {
		for (int i = 0; i <= n; i++) {
			sp[i].showBasic();
		}
	}

}
