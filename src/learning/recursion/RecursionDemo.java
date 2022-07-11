package learning.recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		//Calculating Factorial
		ComplexRecursion fact = new ComplexRecursion();
		int result = fact.calculateFunction(5);
		System.out.println("Factorial of 5 is: "+result);
	}

}
