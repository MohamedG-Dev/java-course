package learning.Polymorphism.MethodOverLoading;

public class MethodOverloadingDemo {

	public int multiply(int x, int y) {
		return (x * y);
	}

	public int multiply(int x, int y, int z) {
		return (x * y * z);
	}

	public double multiply(double a, double b) {
		return (a * b);
	}

	public static void main(String[] args) {
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		System.out.println(demo.multiply(5, 4));
		System.out.println(demo.multiply(6, 7, 9));
		System.out.println(demo.multiply(4.567, 7.678));
	}

}
