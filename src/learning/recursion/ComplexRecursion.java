package learning.recursion;

public class ComplexRecursion {

	int calculateFunction(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * calculateFunction(n - 1));
		}
	}
}
