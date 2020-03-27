package tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTestPerson {

	public static void main(String[] args) {

		//저장
		TreeSet<Person> sTree = new TreeSet<Person>();
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Scott", 29));
		sTree.add(new Person("King", 19));
		sTree.add(new Person("hong", 15));

		//변환
		Iterator<Person> itr = sTree.iterator();

		//
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// itr.next().showData();
		}
	}
}
