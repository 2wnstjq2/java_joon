package bookver5;

import java.util.Scanner;

public class PhoneMain5 {
	
	// 키보드로 입력처리
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		
		PhoneHandler5 chart = PhoneHandler5.getinstance();

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

}
