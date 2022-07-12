package learning.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsDemo {

	public static void main(String[] args) throws IOException {
		// D:\Learning\Java\Java_Learning\java-programming\src\input-files\abc.txt
		FileReader fileReader = new FileReader("D:\\Learning\\Java\\Java_Learning\\java-programming\\src\\input-files\\abc.txt");
		BufferedReader fileInput = new BufferedReader(fileReader);
		for (int counter = 0; counter < 4; counter++) {
			System.out.println(fileInput.readLine());
		}
		fileInput.close();
	}

}
