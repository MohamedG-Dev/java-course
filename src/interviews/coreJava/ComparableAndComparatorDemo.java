package interviews.coreJava;

import java.util.Arrays;

public class ComparableAndComparatorDemo {

	public static void main(String[] args) {
		int[] arr = {5,9,2,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(5,"John");
		empArr[1] = new Employee(9,"Marcus");
		empArr[2] = new Employee(2,"Paul");
		empArr[3] = new Employee(7,"Amy");
		Arrays.sort(empArr);
		System.out.println("Sorting Data using the Comparable interface");
		System.out.println("default sorting of employee list: "+Arrays.toString(empArr));
		
		System.out.println("Sorting Data using the Comparator interface");
		Arrays.sort(empArr, Employee.nameComparator);
		System.out.println("Employee Array after sorting using Comparator: "+Arrays.toString(empArr));

	}

}
