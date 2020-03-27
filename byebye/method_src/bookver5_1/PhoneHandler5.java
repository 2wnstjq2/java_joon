package bookver5_1;

import java.util.Scanner;

//기능클래스
public class PhoneHandler5 {

	// 키보드로 입력처리
	static Scanner kb = new Scanner(System.in);
	
	static int n = 0;
	
	// 배열생성
	static PhoneInfor[] sp = new PhoneInfor[100];
		
	private static PhoneHandler5 m = new PhoneHandler5();
	
	public static PhoneHandler5 getinstance() {
		if(m==null) {
			return new PhoneHandler5();
		}else {
			return m;	
		}
	}
	
	// 배열에 값을 저장할 주소값 지정
	public void equalizing(PhoneInfor list) {
		sp[n] = list;
		showAllBasic();
		n++;
	}

	// 값입력&저장 (menu 1)
	public void insert() {
		String key;
		do {

			System.out.println("[1]대학친구 [2]회사동료");
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
			} else {
				System.out.println("*에러*");
			}
			System.out.println("다시 입력하시겠습니까? [1]yes [2]no");
			key = kb.nextLine();
			
		} while (key.equals("1"));
	}

	// 포인트 int p값 반환 -> int
	public static int point(String a) {
		int p = -1;

		for (int i = 0; i < n; i++) {
			if (sp[i].name.equals(a)) {
				p = i;
				break;
			}
		}

		return p;
	}

	public void search() {
		System.out.println("찾을 대상의 이름을 입력하세요");
		String find = kb.nextLine();

		//int f = point(find);
		
		if (point(find) < 0) {
			System.out.println("찾는 대상이 없습니다");
		} else {
			sp[point(find)].showData();
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

	public void showAllBasic() {
		for (int i = 0; i <= n; i++) {
			sp[i].showBasic();
		}
	}

}










