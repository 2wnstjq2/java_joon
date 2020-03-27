package com.park.tb;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		long time1 = 0;
		long time2 = 0;
		double costTime = 0.0;
		int dayIncome = 0;

		
		// 주차면 정보
		Space[] space = new Space[20];

		String[] cars = new String[20];
		int car_last = 0; // 현재 몇 개, 마지막 요소 번호
		int[][] state = new int[20][2];
		// [0] : 주차면 변호, [1]: 차량정보번호(차번호x, cars의 요소번호)
		int log_no = 0;
		// 돈 기록
		while (true) {
			// 현재 상태, 상황, 목록 - 데이터
			for (int i = 0; i < space.length; ++i) {
				System.out.print("[" + i + ":");
				if (space[i] == null) {
				} else {
					System.out.print(space[i].carNumber);
				}
				System.out.print("]\t");
				if ((i + 1) % 5 == 0)
					System.out.println("");
			}
			// 메뉴, 기능을 입력, 선택
			System.out.println("[0]Exit [1]In [2]Out");

			int menu = Integer.parseInt(kb.nextLine());
			// 오류 검사 코드
//			String temp = kb.nextLine();
//			int menu = 100;
//			if( temp.length() > 0 ) {
//				menu = Integer.parseInt(temp);// 숫자만 입력
//			}else {
//				System.out.println("입력오류");
//			}
			// Double.parseDouble(s);
			// 선택된 처리
			if (menu == 0)
				break; // [사용자]에 의해
			// 처리 결과 보여준다, 저장하기
			if (menu == 1) { // 차 들어온다..
				// 빈 자리 확인
				int empty_space = -1;
				for (int i = 0; i < space.length; i++) {
					if (space[i] == null) {
						space[i] = new Space(i, true, null, state);
						System.out.println(i + "번 자리 있음");
						empty_space = i;
						break;
					}
				}
				if (empty_space != -1) {
					System.out.println("car number : ");
					String carnumber = kb.nextLine();

					// 들어온 시간 : 자동 기록
					space[empty_space].able = false; // 주차 했음
					space[empty_space].carNumber = carnumber;
//					space[empty_space].in = LocalDateTime.now();
					time1 = System.currentTimeMillis();

//					System.out.println(
//							space[empty_space].in.getHour() + "시 "  +
//							space[empty_space].in.getMinute() + "분 주차 완료");

					cars[car_last] = carnumber;
					++car_last;
					state[log_no][0] = empty_space;
					state[log_no][1] = car_last - 1; // 저장된요소 번호
					++log_no;
				} else
					System.out.println("Man Cha");
			} else if (menu == 2) { // 차가 나간다..
				System.out.println("car number : ");
				String carnumber = kb.nextLine();
				// 해당 차의 시간 정보 찾는다..

				// 마무리 : 빈 자리 생겼다...
				// 반복문 : for each : 요소 단위로 반복한다...
				Space result = null;
				for (int i = 0; i < space.length; i++) {
					if (space[i] != null) {
						if (space[i].carNumber.equals(carnumber)) {
							result = space[i]; // 복사 : 참조.
							space[i] = null;
							break;
						}
					}
				} // 차량 검색 끝
				if (result != null) {
					result.able = true;
//					result.out = LocalDateTime.now();
					time2 = System.currentTimeMillis();

//					System.out.println(
//							result.out.getHour() + "시 "  +
//							result.out.getMinute() + "분 출차 완료");

					costTime = (time2 - time1) / 1000.0;
					System.out.println(costTime + "초");

					// 기본 요금 + 추가 요금
					int cost = (int) (costTime * 100); // 초당 100원

					while (cost > 0) {
						System.out.println(cost + "원을 내주세요.");
						System.out.println("돈 입력 : ");
						int money = kb.nextInt();
						kb.nextLine();
						int charge = money - cost;

						if (charge >= 0) {
							System.out.println("거스름돈 : " + charge);
							System.out.println("안녕히가세요.");
							dayIncome += cost;
							break;
						} else {
							cost = cost - money;
						}
					}
				} else
					System.out.println("해당 차량 정보가 없습니다.");
			}
		}

		System.out.println("오늘 매출은 " + dayIncome + "원 입니다.");
		System.out.println("terminated bye");
		kb.close();
	} // end of main

} // end of Class
