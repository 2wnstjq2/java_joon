package bookver1;

import java.util.Scanner;

import bookver1.PhoneInfor1;

public class mainver2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("_____________________________");
			System.out.println("이름");
			String name = sc.nextLine();
			System.out.println("전화번호");
			String pNum = sc.nextLine();
			System.out.println("생일");
			String bDay = sc.nextLine();

			// 사용자가 입력한 생일 데이터 비교 : 공백 여부
			// System.out.println("문자열의 개수: " + bDay.trim().length());//trim:앞과 뒤의 공백 제거
			if (bDay != null && bDay.trim().length() > 0) {
				new PhoneInfor1(name, pNum, bDay).showInfor();
			} else {
				new PhoneInfor1(name, pNum).showInfor();
			}
			sc.close();
		} // while
	}

}
