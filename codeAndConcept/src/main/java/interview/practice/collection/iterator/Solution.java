package interview.practice.collection.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Result {

	/*
	 * Complete the 'customSort' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void customSort(List<Integer> arr) {
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
		int[][] x= new int[arr.size()][];



		for (Integer curr : arr) {
			int count = 1;
			if (curr != null && m.containsKey(curr)) {
				count = m.get(curr).intValue();
				count = count + 1;
			}
			m.put(curr, count);
		}
		System.out.println(m);
		for (Integer i : m.keySet()) {

			x[m.get(i)] = ;
		}

//		for (Integer i : m.keySet()) {
//			if (m.get(i).intValue() > 1) {
//				for (int j = 0; j < m.get(i).intValue(); j++) {
//					System.out.println(i);
//				}
//			} else {
//				System.out.println(i);
//			}
//		}
		for (int i = 0; i < arr.size(); i++) {
			if(m.containsValue(i)) {
				m.get
			}
		}

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < arrCount; i++) {
			int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
			arr.add(arrItem);
		}

		Result.customSort(arr);

		bufferedReader.close();
	}
}
