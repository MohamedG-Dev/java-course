package project.Calculator;

import java.util.Scanner;

public class ReadInput {

	public static String read() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input expression (for eg: 4*3/2)");
		String inputLine = input.nextLine();
		input.close();
		return inputLine;
	}
}
