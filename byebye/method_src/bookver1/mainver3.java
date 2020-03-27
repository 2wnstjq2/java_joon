package bookver1;

import java.util.Scanner;

import bookver1.PhoneInfor1;

public class mainver3 {

	// 저장공간
	static PhoneInfor1[] pBook = new PhoneInfor1[100];
	
	// 저장된 정보의 개수 : 저장시의 인덱스, 배열 반복의 조건, 저장된 정보의 개수
	static int cnt = 0;

	static Scanner sc = new Scanner(System.in);
	// 기능 : 저장, 검색(검색어로 배열의 인덱스 찾기) - 삭제

	public static void main(String[] args) {
		while (true) {

			System.out.println("--------------------------------------");
			System.out.println("원하시는 기능을 선택하세요.");
			System.out.println("1.정보입력\n2.정보검색\n3.정보삭제\n4.프로그램종료");
			System.out.println("--------------------------------------");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insert();
				break;
			case 2:
				searchInfor();
				break;
			case 3:
				deleteInfor();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("1~4의 숫자를 적어주세요.");
				break;
			}

		}
	}

	public static void insert() {

		System.out.println("이름");
		String name = sc.nextLine();
		System.out.println("전화번호");
		String pNum = sc.nextLine();
		System.out.println("생일");
		String bDay = sc.nextLine();

		PhoneInfor1 pi = null;

		if (bDay != null && bDay.trim().length() > 0) {
			pi = new PhoneInfor1(name, pNum, bDay);
		} else {
			pi = new PhoneInfor1(name, pNum);
		}

		pBook[cnt=cnt+1] = pi;
		// 저장된 횟수 증가
		// cnt++;

		System.out.println("정상적으로 저장되었습니다.");

		// System.out.println("저장된 정보의 개수는 : " +cnt);
		// pBook[cnt-1].showInfor();

	}

	public static int searchIndex(String name) {
		// index : 0~N-1
		// index -> -1

		// 찾는 인덱스가 없다 : -1
		int index = -1;

		// 인덱스 찾기
		for (int i = 0; i < cnt; i++) {
			if (pBook[i].name.equals(name)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public static void searchInfor() {
		System.out.println("찾고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();

		int index = searchIndex(name);

		// 인덱스값 -> -1:결과x, 0~cnt-1
		if (index < 0) {
			System.out.println("찾으시는 이름이 없습니다.");
		} else {
			// System.out.println(pBook[index]); 도 되지 않나?
			pBook[index].showInfor();

		}
	}

	// 덮어씌우면 삭제
	public static void deleteInfor() {
		System.out.println("삭제하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("찾으시는 정보가 없습니다.");
		} else {
			for (int i = index; i < cnt - 1; i++) {
				pBook[1] = pBook[i + 1];
			}
			System.out.println("삭제되었습니다.");
		}
	}

}
