package free;

public class Product {//대표클래스

	int price;
	int bonusP;

	public Product(int price) {
		this.price = price;
		this.bonusP = (int) (price / 10f);

	}
	
	public static void main(String[] args) {//대표클래스(public) 밑으로
		
		Buyer b = new Buyer();
		
		Tv tv = new Tv(100);
		//Product p1 = tv;
		
		Computer com = new Computer(300);
		//Product p2 = com;
		
		Audio ad = new Audio(50);
		
		b.buy(tv);
		b.buy(com);
		b.buy(ad);
		
		b.summary();
		
		System.out.println("=========================");
		System.out.println("현재 남은 돈 : "+b.money+"만원");
		System.out.println("현재 보너스 포인트 : "+b.bonusP+"만원");
		
	}

}

class Audio extends Product {

	public Audio(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Audio";
	}
	
}

class Tv extends Product {

	public Tv(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tv";
	}

}

class Computer extends Product {

	public Computer(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Computer";
	}

}

class Buyer {
	int money = 1000;
	int bonusP = 0;
	
	//장바구니
	Product[] cart = new Product[10];
	//구매상품의 개수, 배열 입력할 때 쓰는 index 값으로 사용, 반복문 사용시 반복의 조건
	int cnt = 0;
	

	void buy(Product p) {
		if(money<p.price){
			System.out.println("no money");
			return;
		}
		money = money - p.price;
		bonusP = bonusP + p.bonusP;
		
		//바구니에 추가
		cart[cnt] = p;
		//구매상품의 개수 1 증가
		cnt++;
		
		System.out.println(p + "을 /를 구입하셨습니다.");
	}
	
	void summary() {
		//구매상품의 총 금액
		int sum=0;
		//구매 제품 리스트
		String productList = "";
		
		for(int i=0;i<cnt;i++) {
			//제품가격을 더한다
			sum = sum+ cart[i].price;
			//제품리스트
			productList = productList + cart[i] + ",";
		}
		
		System.out.println("구입한 제품의 총 금액:"+sum +"만원 입니다.");
		System.out.println("구입한 제품의 목록은"+productList+"입니다.");
	}
}







