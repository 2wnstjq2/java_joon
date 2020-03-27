package test;

import java.util.Scanner;

public class ArrayShuffle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] name = { "고현주", "구자윤", "김난형", "김동진", "김주연", "문영기", "박준섭", "박지은", "방창용", "양햇살", "엄예빈", "위은주", "이용재",
				"황다울", "이진형", "이택수", "장한솔", "정엄지", "정용기", "조성빈", "조지윤", "최찬영", "하재운", "홍지수" };

		String temp = null;
		System.out.println("섞을 횟수 : ");
		int shufle = kb.nextInt();
		for (int t = 0; t <= shufle; t++) {
			int i = t % name.length;
			temp = name[0];
			name[0] = name[i];
			name[i] = temp;
		}

		System.out.println("방장은 "+temp+"입니다.");
		kb.close();
	}
}
