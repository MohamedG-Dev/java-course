package programs.basics;

public class PrimeNumbersUsingMethodCall {

	public static void main(String[] args) {
		primeNumber(3);
		primeNumber(4);
		primeNumber(5);
		primeNumber(6);
		primeNumber(7);
		primeNumber(8);
		primeNumber(9);
		primeNumber(10);
		primeNumber(11);

	}

	public static void primeNumber(int num) {
		int m = 0, flag = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is prime number");
			}
		}
	}

}
