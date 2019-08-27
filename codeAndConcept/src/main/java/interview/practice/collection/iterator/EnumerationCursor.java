package interview.practice.collection.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
	public static void main(String[] args) {
		Vector<String> al = new Vector<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");

		Enumeration<String> it = al.elements();
		while (it.hasMoreElements()) {
			System.out.println(it.nextElement());
		}
	}
}
