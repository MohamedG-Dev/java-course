package learning.comparable;

public class Student implements Comparable<Student> {
	private int rollNumber;
	private String name;
	private int age;
	private String address;

	public Student(int rollNumber, String name,int age, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age=age;
		this.address = address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNumber - o.rollNumber; // if the result is positive - this.rollNumber will be first else if the
												// result is negative o.rollNumber will be on priotiry. IF the result is
												// 0 then anyone can be priority.
	}
}
