package Q9;

import java.util.ArrayList;
//Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime
//numbers to the console.
public class Q9 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for (int i = 1; i <= 100; i++)
			list.add(i);
		//System.out.println("Printing all elements in ArrayList");
		//arrayListPrinter(list);
		for (int i = 0; i < list.size(); i++) {
			int x = (int) list.get(i);
			if (x == 1)
				continue;
			primeNumberPrinter(x);
		}
	}
	
	public static void arrayListPrinter(ArrayList list) {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
	public static void primeNumberPrinter(int x) {
		if (x == 2 | x == 3 | x == 5 | x == 7 | x == 11 | x == 13)
			System.out.println(x);
		else if (!((x%2 == 0) | (x%3 == 0) | (x%5 == 0) | (x%7 == 0) | (x%11 == 0) | (x%13 == 0)))					//not divisible by 2
			System.out.println(x);
	}
}
