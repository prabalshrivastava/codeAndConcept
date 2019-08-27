package interview.practice.collection.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");

		ListIterator<String> it = al.listIterator();
		while (it.hasNext()) {
			String current = it.next();
			System.out.println(it.nextIndex() + "---" + current);
			it.set(current + it.nextIndex());
		}
		System.out.println(al);
		System.out.println("reading previous now");
		while (it.hasPrevious()) {
			System.out.println(it.previousIndex() + "---" + it.previous());
		}
		System.out.println(al);
		while (it.hasNext()) {
			String current = it.next();
			System.out.println(it.nextIndex() + "---" + current);
			it.remove();
		}

	}
}
