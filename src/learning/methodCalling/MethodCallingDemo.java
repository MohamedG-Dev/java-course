package learning.methodCalling;

public class MethodCallingDemo {

	public static void main(String[] args) {
		Student student = new Student("Smilga", 33, "Spain");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getAddress());
		changeNameInSameObject(student);
		System.out.println("Student name after changing it's value using object student: " + student.getName());
		System.out.println(changeNameInDifferentObject(student).toString());
		
	}

	static void changeNameInSameObject(Student student) {
		student.setName("Schimdth");
	}

	static Student changeNameInDifferentObject(Student student) {
		Student newStudentObject = new Student("Jessica", student.getAge(), student.getAddress());
		return newStudentObject;
	}
}
