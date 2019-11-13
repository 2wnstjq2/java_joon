package sixtwo;

public class Oneclass {
	
	    // 구슬의 개수
	    int mNum; // 구슬의 개수를 저장
	    // 생성자 : 초기화 메서드, 인스턴스 생성시에 반드시 한번 실행
	    
	    public void boy(int num){
	      mNum = num;  
	    }
  
	    // 게임 승리

	    void gameWin(int mNum, Oneclass boy){
	        win(mNum);
	        boy.lose(mNum);
	    }
	    
	    // 구슬의 증가
	    void win(int num) {
	        mNum = mNum + num;
	    }
	    // 구슬의 감소
	    void lose(int num) {
	        mNum -= num;
	    }
 
	public void main(String[] args) {
		
Oneclass boy1 = new Oneclass();
Oneclass boy2 = new Oneclass();
	
	        boy1.showNumber();

	        boy2.showNumber();

	      System.out.println("=================================");


	        /* 게임 플레이 */

	        // 1차 게임 : 어린이1이 구슬 2개 획득

	        boy1.gameWin(2, boy2);

	        boy1.showNumber();

	        boy2.showNumber();

	      System.out.println("=================================");

	        // 2차 게임 : 어린이2가 구슬 7개 획득

	        boy2.gameWin(7, boy1);

	        /* 각각의 어린이들의 구슬의 개수 현황 출력 */

	        boy1.showNumber();

	        boy2.showNumber();

	}

	private void showNumber() {
		// TODO Auto-generated method stub
		System.out.println(mNum);
	}
}


