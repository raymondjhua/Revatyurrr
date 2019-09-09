package Q10;
//Find the minimum of two numbers using ternary operators.

public class Q10 {
	public static void main(String[] args) {
		/* [expression] ? [val for T] : [val for F]
		 		static String ternary(int x) {
		 			return x > 0 ? "X is greater than 0" : "X is less than 0";
		 		}
		*/
		min(1 , 2);
		
	}
	
	public static void min(int x, int y) {
		System.out.println((x < y ? x : y));
	}
}
