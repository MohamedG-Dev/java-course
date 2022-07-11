package learning.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);

		System.out.println("Map size is: " + map.size());
		System.out.println(map);

		if (map.containsKey("a")) {
			int a = map.get("a");
			System.out.println("The value of " + "\"a\" is: " + a);
		}

		for (String key : map.keySet()) {
			System.out.println("Key: " + key + ", value: " + map.get(key));
		}
		System.out.println("Printing map values using entrySet method");
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key is: " + entry.getKey() + " and the value is: " + entry.getValue());
		}
	}

}
