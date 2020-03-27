package iot.java.oop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TutorialMain {

	public static void main(String[] args) throws IOException {
		// Collections : 다수의 데이터들을 모은 집합체 : 자료구조(보이질 않아서 힘들다)
		//	참조형(클래스 객체) : 위치(주소)로 접근하는 방식
		//	객체명.멤버명(변수, 함수(메서드)) : 객체명 == null 아무것도 할 수 없다...
		// 선형구조 : 배열(연속), 연결리스트(비연속- 방향:단방향, 양방향-네트워킹)
		// 비선형구조 : 망(거미줄), 트리, 그래프
//		testLinkedList();	
//		List<String> list = new ArrayList<String>();// 제네릭, 제너릭
//		list.add("first string1");
//		list.add("first string2");
//		list.add("first string3");
//		list.add("first string4");
//		list.add("first string5");
//		System.out.println(list.size());
//		for(String el : list ) {
//			System.out.println(el);
//		}
		
		testTree();

	}

	
	private static void testTree() throws IOException {
		// 트리는 어렵다... 방법이 많기 때문이다...
		//	하나의 노드에 하위 개념 노드 2개 갖는다... 
		//	노드 추가 : 기준 : 종류
		// 왼쪽, 오른쪽 - 작은 값 왼쪽, 큰 값 오른쪽 : 이진트리 
		Node root = new Node();
		root.value = 100;
		
		for(int i=0; i<10; ++i) {
			int val = System.in.read();// '1' - 49
			Node temp = new Node();
			temp.value = val;
			// 트리 속에 추가해라...
			addNode(temp, root);
		}
		
		
		// 트리는 단순 반복으로 힘들다... 되돌아오는 과정이 필요하다... 재귀법으로 표현한다...
		// 재귀함수 학습이 필요하다.
		traverse(root);// 모든 노드들을 출력하는 재귀 함수
		
	}


	private static void addNode(Node temp, Node root) {
		if(root == null) {
			return;
		}
		if(temp.value <= root.value) {
			if( root.left == null ) {
				root.left = temp;
				return;
			}
			addNode(temp, root.left);
		}
		if(temp.value > root.value) {
			if( root.right == null ) {
				root.right = temp;
			}else{
				addNode(temp, root.right);
			}
		}
		
	}


	private static void traverse(Node root) {	// 재귀함수
		// 반드시 종료 되어야 한다. 반복 흐름
		if(root == null) {
			return;
		}
		// 자기 자신을 호출한다...
		System.out.println(root.value);	// 현재 노드. 부모 노드
		traverse(root.left);
//		System.out.println(root.value);	// 자식 노드 우선
		traverse(root.right);
//		System.out.println(root.value);
		
	}


	private static void testLinkedList() {
		Node head = null;// 처음 생성된 노드
		Node tail = null;//	마지막 생성된 노드(최근)
		Node temp = null;
		// 추가하기 : 입력된 순서대로 출력한다... 큐 방식
		for(int i = 1; i<= 10; ++i) {
			// 새 노드 생성
			temp = createNode(i);
			// 연결하기
			append(temp, tail, head, true);
		}
		
		// 추가하기 : 10개 : 스택 방식 : 마지막(LI) 처음(FO) 나온다...
//		for(int i = 1; i<= 10; ++i) {
//			// 새 노드 생성
//			temp = new Node();
//			temp.value = i;
//			temp.left = null;
//			// 연결하기
//			if( head == null ) {
//				head = temp;
//			}else {
//				temp.left = tail;
//			}
//			tail = temp;
//		}
		
		// 순회하기(목록,검색)
		temp = head;
		while( temp != null ) {
			System.out.println(temp.value);
			temp = temp.left;			
		}
		
	}


	private static void append(Node temp, Node tail, Node head, boolean ordered) {
		// TODO Auto-generated method stub
		if( head == null ) {
			head = temp;
		}else {
			if(ordered)	tail.left = temp;
			else	temp.left = tail;
		}
		tail = temp;		
	}


	private static Node createNode(int i) {
		// TODO Auto-generated method stub
		Node temp = new Node();
		temp.value = i;
		temp.left = null;
		return temp;
	}

}
/**
 * 자바는 이제부터 시작...
 * - 지금까지 뭘 했나... 프로그래밍을 파기 위한 기본 능력
 * - 그래서 기본 능력이 뭔데... 필요한 데이터가 무엇인지, 처리 흐름이 어떠한지를 파악하는 능력
 * 자바 is OOP
 * - OOP ? 추상화를 통해 관계를 설정하고 절차를 정립하는 방식
 * -	대부분 추상을 못한다... 설계하는 것과 같다...
 * 
 * 원하는 기능(동사: ~하기, 한다)
 * - 메서드를 찾는다.
 * - 객체 내에 있다... 클래스
 * - 객체 사용 - 생성 - 클래스 ( 이미 많이 만들어져 있음 ) _ API  레퍼런스
 * - import 패키지명.클래스명
 * 
 * */









