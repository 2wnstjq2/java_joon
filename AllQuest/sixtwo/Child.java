package sixtwo;

public class Child {

	// 변수
	int mable;
	
	
//	// 플레이어 이름
//
//    String pName;
//
//    // 생성자 : 초기화 메서드, 인스턴스 생성시에 반드시 한번 실행
//
//    Boy(String name, int num){
//
//        pName = name;
//
//        mNum = num;    
//
//    }
    

	// 메서드
	void mableLose(int m) {
		mable = mable - m;
	}
	void mableGet(int p) {
		mable = mable + p;
	}

}
