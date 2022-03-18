package TEST;

import java.util.*;

public class FindingDuplicateEntries {
	public static void main(String args[]) {
		String a[] = { "apple", "banana", "apple", "cat", "dog", "banana" };
		Map<String, Integer> data = new HashMap<String, Integer>();
		for (String d : a) {
			Integer count = data.get(d);
			if (count == null) {
				data.put(d, 1);
			} else {
				data.put(d, ++count);
			}
		}
		System.out.println(data);

	}
}