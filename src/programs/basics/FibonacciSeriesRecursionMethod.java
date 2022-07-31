package programs.basics;

public class FibonacciSeriesRecursionMethod {

	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1+" "+n2);
		fibonacciSeries(count-2);
	}
	
	public static void fibonacciSeries(int num) {
		if(num>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacciSeries(num-1);
		}
	}

}
//0 1 1 2 3 5 8 13 21 34