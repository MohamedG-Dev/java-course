package learning.staticDemo;

public class StaticDemo {

	public static void main(String[] args) {
		Student john = new Student("John",26,"25 West, Chicago");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		System.out.println(Student.college);
		System.out.println(john.toString());
	}

}
