package learning.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(3, "A");
		map.put(2, "B");
		map.put(4, "C");
		map.put(1, "D");
		System.out.println(map);

	}

}
