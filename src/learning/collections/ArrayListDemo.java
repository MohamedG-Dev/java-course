package learning.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<Integer>();
		for(int i=0;i<6;i++)
			arrayList.add(i);
		
		System.out.println(arrayList);
		
		//Remove element at the index 3
		arrayList.remove(3);
		
		//Display ArrayList after deletion
		System.out.println(arrayList);
		
		//Printing Elements of ArrayList one by one
		for(int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+" ");
		}
	}

}
