package learning.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		List<Integer> squaredList = new ArrayList<>();
		for (Integer i : list) {
			squaredList.add(i * i);
		}
		System.out.println("Squared list is: " + squaredList);
		System.out.println();
		System.out.println("===================PRINTING SQUARED LIST USING STREAM=================");
		List<Integer> squareList = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squareList);
		System.out.println("=======================================================================");
		System.out.println();

		System.out.println("=============Printing the square list using SET collections============");
		Set<Integer> squaredSet = new HashSet<>();
		for (Integer i : list) {
			squaredSet.add(i * i);
		}
		System.out.println("The Sqaured set is: " + squaredSet);

		System.out.println();
		System.out.println("============ Printing the square set using STREAM ============");
		Set<Integer> squaresSet = list.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squaresSet);
		System.out.println("=======================================================================");

		List<String> languagesList = new ArrayList<>();
		languagesList.add("java");
		languagesList.add("c");
		languagesList.add("html");
		languagesList.add("python");
		languagesList.add("javascript");
		languagesList.add("php");
		languagesList.add("perl");
		languagesList.add("basic");
		languagesList.add("swift");

		List<String> filteredList = new ArrayList<>();
		for (String language : languagesList) {
			if (language.startsWith("p")) {
				filteredList.add(language);
			}
		}
		System.out.println();
		System.out.println("========Priting Filtered List that starts with " + "\"p\"=========");
		System.out.println(filteredList);
		System.out.println();

		System.out.println(
				"Priting the filtered languages that starts with " + "\"p\" using filtered method from streams");
		List<String> filterList = languagesList.stream().filter(language -> language.startsWith("p"))
				.collect(Collectors.toList());
		System.out.println("Filtered List is: " + filterList);

		// sorting the Collections

		System.out.println("===========Sorting a Collections==============");
		List<String> sortedList = languagesList.stream().sorted().collect(Collectors.toList());
		System.out.println("Programming languages in the sorted order");
		System.out.println(sortedList);

		System.out.println("Iterating over collections using streams");
		languagesList.stream().forEach(language -> System.out.println("language is: " + language));

		System.out.println("Using reduce method in streams");
		// Demonstration of reduce method
		// A) Identity - an element that is the initial value of the reduction operation
		// and the default result value if the stream is empty.
		// B) Accumulator - a function that takes two parameters. 1- a partial result of
		// the reduction operation. 2- the next element of the stream.
		/*
		 * C) Combiner - a function used to combine the partial result of the reduction
		 * operation. When the reduction is parallelized, or when there's a mismatch
		 * between the types of the accumulator arguments. and the types of the
		 * accumulator implementation.
		 */

		int result = list.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("sum of all the elements in the list: " + result);
	}

}
