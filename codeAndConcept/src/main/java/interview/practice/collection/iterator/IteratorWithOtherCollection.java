package interview.practice.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorWithOtherCollection {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
