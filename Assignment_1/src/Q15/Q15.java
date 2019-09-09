package Q15;
/*Write a program that defines an interface having the following methods: addition,
subtraction, multiplication, and division. Create a class that implements this interface
and provides appropriate functionality to carry out the required operations. Hard code
two operands in a test class having a main method that calls the implementing class.
*/

public class Q15 implements mathStuff{
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		addition(x, y);
		subtraction(x, y);
		multiplication(x, y);
		division(x, y);
	}
	public static void addition(int x, int y) {
		System.out.println(x + y);
	}
	public static void subtraction(int x, int y) {
		System.out.println(x - y);
	}
	public static void multiplication(int x, int y) {
		System.out.println(x * y);
	}
	public static void division(int x, int y) {
		System.out.println(x / y);
	}	
}


