package sixone;

public class Triangle {

	// 변수
	int underBar = 4;
	int highBar = 2;
	

	// 메서드
	void tran(int underBar, int j) {
		this.underBar = underBar; //this를 쓰면 이름이 같아도 알아볼수 있다
		this.highBar = j;
	}
	int area() {
		return underBar * highBar / 2;
	}
	public void showRes() {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 넓이 : ");
		System.out.println(this.area());
	}

}
