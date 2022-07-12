package learning.exceptions;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {

	public void writeList() {
		try {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			System.out.println("Entering try statement");
			Integer a = list.get(1);
			System.out.println("Accessing the second element of the list: " + a);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
		} finally {
			System.out.println("This block will always be executed");
		}
	}
}
