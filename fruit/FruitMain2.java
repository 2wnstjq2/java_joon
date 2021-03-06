package fruit2;

public class FruitMain2 {

	public static void main(String[] args) {
		// 셀러1 생성
		FruitSeller2 seller;			// 참조변수 생성 : 인스턴스의 주소를 저장
		//seller = new FruitSeller2(0, 30, 1500);	//인스턴스 생성 > 인스턴스 메모리의 주소값을 반환
		seller = new FruitSeller2();
		
		// 셀러2 생성
			//	FruitSeller2 seller2 = new FruitSeller2(0, 10, 1000);
		FruitSeller2 seller2 = new FruitSeller2(seller);
		
		// 바이어 생성	
		FruitBuyer2 buyer = new FruitBuyer2(10000); // 참조변수&인스턴스 생성
		
		// 구매자가 5000원 어치 사과를 구매
		buyer.buyApple(seller, 3000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("*판매자1의 현재 상황");
		seller.showSaleResult();
		System.out.println("*판매자2의 현재 상황");
		seller2.showSaleResult();
		
		System.out.println("----------------------------------");
		System.out.println("*구매자의 현재 상황");
		buyer.showBuyResult();

	}

}
