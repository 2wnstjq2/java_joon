package trst;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.LinkedList;



public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//LinkedList<Integer> list = new LinkedList<Integer>();
		
		//데이터추가 : add()
		list.add(new Integer(11));
		list.add(22);//오토박싱으로 참조형으로!
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		
		//데이터참조 : 반복문 for, for-each
		System.out.println("arrayList의 요소 개수 : "+list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
				}
		
		System.out.println("-----------");
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//요소삭제 :remove(index) 
		list.remove(0);
		System.out.println("-----------");
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
		Iterator<Integer> itr = list.iterator();
		
		//itr.hasNext() : 요소존재 유무
		//itr.Next() : integer 데이터 변환
		//itr.remove() : 현재 위지의 데이터 삭제
		
		//33데이터삭제
		System.out.println("itretor를 이용한 데이터 참조 및 삭제");
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
			if(i.equals(33)) {
				itr.remove();
			}
		}
		
		System.out.println("-------------");
		
		itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
	}

}
