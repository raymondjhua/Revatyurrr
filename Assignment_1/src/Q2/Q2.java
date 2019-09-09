package Q2;
//Write a program to display the first 25 Fibonacci numbersbeginning at 0.

public class Q2 {
	public static void main(String[] args) {
		for (int i = 0; i < 25 ;i++) {
			System.out.println(fib(i));
		}
	}
	
	public static int fib(int x) {
		if (x == 0 | x == 1)
			return 1;
		else
			return fib(x-1) + fib(x-2);
	}
}
