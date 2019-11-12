package fruit2;

public class FruitSeller2 {
	//상태값 : 사과의 개수, 수익금, 사과의 가격
	int numofApple;			// 사과의 개수
	int myMoney; 					// 수익금
	final int APLLE_PRICE; 	// 사과 1개의 가격
	
	
//	public FruitSeller2(int money, int num, int price) {
//		numofApple = num;
//		myMoney = money;
//		APLLE_PRICE = price;
//	}
	
////	public FruitSeller2(int numofApple, int myMoney, int price) {
//		this.numofApple = numofApple;		//this 현재 인스턴스주소를 갖는 참조변수
//		this.myMoney = myMoney;
//		APLLE_PRICE = price;
////	}

	public FruitSeller2(int numofApple, int myMoney, int aPLLE_PRICE) {
	super();
	this.numofApple = numofApple;
	this.myMoney = myMoney;
	APLLE_PRICE = aPLLE_PRICE;
	} // 자동완성 // Source-제너레이트 컨~필드

	public FruitSeller2(FruitSeller2 fs) {
		this.numofApple = fs.numofApple;
		this.myMoney = fs.myMoney;
		this.APLLE_PRICE = fs.APLLE_PRICE;
	}
	
	public FruitSeller2() {
		this(20,0,500);
	}


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
