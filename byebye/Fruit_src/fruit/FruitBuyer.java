package fruit;

public class FruitBuyer {

	//상태 값 : 보유금액, 사과개수
	int myMoney = 10000; 	//보유금액 : 초기값 = 만원
	int numofAplle;			//사과개수 : 기본값 = 0
	
	//기능 : 구매, 구매 현황		
	//구매 : 구매할 셀러, 구매할 금액 > 셀러에게 판매요청(금액) > 사과의 개수 변경 > 금액변경
	void buyApple(FruitSeller seller, int money) { //구매할 셀러, 금액
		//구매한 사과의 개수
		int num = seller.saleApple(money);
		numofAplle = numofAplle + num;		//사과의 개수변경
		myMoney = myMoney - money;			//금액변경
		
	}
	
	void showBuyResult() {
		System.out.println("현재 보유금액 : "+myMoney);
		System.out.println("내가 가진 사과 개수 : "+numofAplle);
	}
	
}
