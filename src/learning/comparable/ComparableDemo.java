package learning.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student john = new Student(3,"john",23,"new york");
		Student zane = new Student(1,"zane",26,"chicago");
		Student tom = new Student (2,"tom",19,"borrklyn");
		
		list.add(john);
		list.add(zane);
		list.add(tom);
		
		Collections.sort(list);
		
		System.out.println("Students after sorting");
		//list.forEach(student -> System.out.println(student));
		list.forEach(student -> System.out.println(student.getName()));
		
		//Comparators Demo
		Collections.sort(list, new AgeComparator());
		System.out.println("Student after sorting AGE");
		list.forEach(student -> System.out.println(student.getName()));
	}

}
