package test;

public class Quest4_2 {

	public static void main(String[] args) {

		System.out.println("문제12)");
//		자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.  
//		그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지,  
//		그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는  프로그램을 작성. 
//		프로그램 내부에 while문을 무한 루프로 구성하여 작성. 

		int i12 = 4; // 3의 배수인 짝수를 구하기위한 변수
		int even = 0;
		int sum = 0;
		int j12 = 1;
		int k12 = 0; // 카운팅

		while (sum < 1000) {
			i12 = i12 + 2;
			if ((i12 / 2) % 3 == 0) {
				even = i12;
				k12++;
				sum = even + j12;
				j12 = j12 + 2;
			}
		}
		System.out.println(sum);
		System.out.println(k12);
		
//		
//        num = 1;
//
//        sum = 0;
//
// 
//
//        while (true) {
//
//           // 전체 번호 출력
//
//           // System.out.println(num++);
//
//           // 홀수, 3의배수이며 짝수인 수를 찾아 확인
//
//           if (num % 2 == 1 || num % 2 == 0&& num % 3 == 0) {
//
//               sum = sum + num;
//               //System.out.println(sum);
//
//           }
//           // 무한반복 임시로 중지
//
//           if (sum > 1000) {
//
//               System.out.println(num+ "값을 더했을때 최초로1000이 넘어갑니다.");
//
//               System.out.println(sum);
//
//               break;
//
//           }
//           num++;
//        }
		
		System.out.println("문제13)");
//		구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.           
//		단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력

		int dan = 2;
		int k13 = 1;
		int mul13 = 0;
		for (dan = 2; dan < 10; dan = dan * 2) {
			for (k13 = 1; k13 <= dan; k13++) {
				mul13 = dan * k13;
				System.out.println(dan + "x" + k13 + "=" + mul13);
			}
		}

		System.out.println("문제14)");
//		다음 식을 만족하는 조합을 찾는 프로그램 작성.   AB+BA=99

		int a = 0;
		int b = 10;
		for (a = 1, b = 8; a < 9; a++, b--) {
			System.out.print((10 * a + b) + " ");
		}
		
//		 for (int number = 0; number < 10; number++) {
//
//	           int a, b;
//
//	           // 10a + b + 10b + a = 99 --> 11a+11b=99 --> a+b=9--> b=9-a
//
//	           a = number;
//
//	           b = 9 - a;
//
//	           System.out.println("a=" + number + " 일때, b=" + b + " 입니다.");

	}
}
