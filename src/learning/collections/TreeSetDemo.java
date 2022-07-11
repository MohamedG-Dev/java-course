package learning.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet<String> treeSet = new TreeSet<>();
	treeSet.add("orange");
	treeSet.add("banana");
	treeSet.add("orange");
	treeSet.add("apple");
	System.out.println(treeSet);
	}

}
