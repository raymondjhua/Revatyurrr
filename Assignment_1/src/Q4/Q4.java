package Q4;
//Write a program to compute N factorial

public class Q4 {
	public static void main(String[] args) {
		int result = 1;
		int factorial = 4;
		for (int i = 0; i <= factorial ; i++) {
			if (i == 0)
				continue;
			result *= i;
		}
		System.out.println(result);
	}
}
