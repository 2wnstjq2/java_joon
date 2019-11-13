package five;

public class FourPrimNumber {

//	전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 
//	소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 			1.boolean
//	이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.	2.print
//	 
//	소수 : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수 

	public static void main(String[] args) {

		int p;

		areYouPrime(6);

		System.out.println("1~100까지의 소수 : ");
		for (p = 2; p <= 100; p++) {
			if (p == 2 || p == 3 || p == 5 || p == 7) {
				System.out.print(p + " ");
				;// 기초 소수
			} else {
				if (p % 2 == 0 || p % 3 == 0 || p % 5 == 0 || p % 7 == 0) {// 기초소수를 다른 값들에 나눠줌
					continue;
				} else {
					System.out.print(p + " ");
					;
				}
			}
		}

	}

	public static void areYouPrime(int p) {

		boolean pri;
		if (p == 2 || p == 3 || p == 5 || p == 7) {
			pri = true;// 기초 소수
		} else {
			if (p % 2 == 0 || p % 3 == 0 || p % 5 == 0 || p % 7 == 0) {// 기초소수를 다른 값들에 나눠줌
				pri = false;
			} else {
				pri = true;
			}
		}

		System.out.println(pri);
	}

}

//public static void main(String[] args) {
//	  for(int k = 1; k<=100; k++) {
//	   if(prime(k)) {
//	    System.out.println(k);
//	   }
//	  }
//	 }
//
//	 static boolean prime(int a) {
//	  boolean result = true;
//	  if(a <= 1) {
//	   result = false;
//	  }
//	  for(int i = a-1; i >1; i-- ) {
//	   if(a%i == 0) {
//	    result = false;
//	    break;
//	   }
//	  }
//	  return result;
//	 }
