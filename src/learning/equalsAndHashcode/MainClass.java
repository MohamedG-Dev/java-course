package learning.equalsAndHashcode;

public class MainClass {

	public static void main(String[] args) {
		Student smith = new Student(1,"Evan Smith","New York");
		Student smith1 = new Student(1,"Evan Smith","New York");
		System.out.println(smith.equals(smith1));
		
		Student mike = new Student(2,"Mike Ross","New York");
		Student rachel = new Student(3,"Rachel Zane","New York");
		
		
	}

}
