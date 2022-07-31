package programs.basics;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		int num = 7;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("The Given number: " + num + " is a prime number");
			}
		}
	}

}
