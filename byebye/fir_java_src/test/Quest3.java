package test;

public class Quest3 {

	public static void main(String[] args) {
		
	
//		int 형 변수 num1, num2, num3가 각각 10,20,30 으로 초기화 되어 있다. 
//		다음문장을 실행하면 각각 변수에는 어떠한 값이 저장되겠는가?  
//		num1=num2=num3 ;          
//		확인 하는 코드를 작성하고, 그 결과에 대해 설명.
		
		int num1, num2, num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		num1 = num2 = num3;
		
//		num2 = num3; //first
//		num1 = num2; //second
		
	//###################################	
		
//		1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성  

		int i7 = 1;
		while (i7 <= 100) {
			System.out.print(i7 + " ");
			i7++;
		}
		System.out.println("");
		
		do {
			i7--;
			System.out.print(i7 + " ");
			
		} while (i7 > 1);
		 
	}

}
