package sixtwo;

public class Main2 {

//	문제2.
//	다음조건을 만족하는 클래스를 구성하자. 구슬치기와 딱지치기
//	어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다.
//	놀이를 통한 구슬을 주고받음을 표현하는 메서드가 존재한다.
//	두 번째 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의미하는 것이다.
//	조건을 만족하는 클래스를 정의하였다면, 다음조건을 만족하는 인스턴스를 각각 생성하자. ( 하나의 클래스만 작성하자 )
//	어린이 1의 보유자산  구슬 15개
//	어린이 2의 보유자산  구슬 9개
//	인스턴스의 생성이 완료되면 다음의 상황을 main 메서드 내에서 시뮬레이션 하자.
//	“1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다”
//	“2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.”
//	마지막으로 각각의 어린이의 보유 구슬의 개수를 출력하고 프로그램 종료.

	public static void main(String[] args) {

		Child kid1 = new Child();
		Child kid2 = new Child();

		kid1.mable = 15;
		kid2.mable = 9;

//1게임 > 1아이 +2개 > 2아이 -2개
//2게임 > 1아이 -7개 > 2아이 +7개

//1게임
		kid1.mableGet(2);
		kid2.mableLose(2);

//2게임
		kid1.mableLose(7);
		kid2.mableGet(7);

		System.out.println("현재 구슬 개수 : ");
		System.out.println("1번아이 : " + kid1.mable);
		System.out.println("2번아이 : " + kid2.mable);

	}

}
