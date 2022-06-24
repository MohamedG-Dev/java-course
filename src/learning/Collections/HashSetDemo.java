package learning.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("apple");
		set.add("banana");
		set.add("Gauva");
		set.add("orange");
		set.add("banana");

		System.out.println(set);
		System.out.println("Set contains banana or not? " + set.contains("banana"));
		// removing an element from the set
		set.remove("orange");
		System.out.println("Set after removing orange: "+set);
		//iterating over the set using for each loop
		for(String item : set) {
			System.out.print(item+" ");
		}
	}

}
