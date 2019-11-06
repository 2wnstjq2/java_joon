package fruit;

public class FruitSeller {
	//상태값 : 사과의 개수, 수익금, 사과의 가격
	int numofApple = 20;			// 사과의 개수
	int myMoney; 					// 수익금
	final int APLLE_PRICE = 1000; 	// 사과 1개의 가격
	
	
	//기능 : 판매, 판매 데이터 출력
	
	//판매기능 : 돈get > 사과개수 계산 > 사과개수 변경 > 돈변경 > 사과개수 반환
	
	int saleApple(int money) {
		//판매할 사과의 개수
		int num = money/APLLE_PRICE;	//사과의 개수
		numofApple = numofApple - num;	//남은 사과개수
		myMoney = myMoney + money;		//보유한 돈				
		return num;						//사과의 개수 반환
	}
	
	//판매결과출력
	
	void showSaleResult() {
		System.out.println("남은 사과의 개수 : "+numofApple);
		System.out.println("보유금액 : "+myMoney);
	}
	
	
	
	
	
}
