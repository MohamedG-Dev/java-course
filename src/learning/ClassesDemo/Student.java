package learning.ClassesDemo;

public class Student {
	String name;
	int age;
	String city;

	public Student(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		Student student = new Student("Madhav", 26, "Delhi");
		System.out.println(student.toString());
		Student student2 = new Student("Ranchordas", 26, "Haryana");
		System.out.println(student2.toString());

	}

}
