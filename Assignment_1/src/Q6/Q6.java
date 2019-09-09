package Q6;
//Write  a program  to  determine  if  an  integer is  even  without  using  the  modulus operator (%)

public class Q6 {
	public static void main(String[] args) {
		System.out.println(even(0));
	}
	
	public static boolean even(int x) {
		int divisor =  x/2;
		if ((x - divisor*2) == 0)
			return true;
		else
			return false;
	}
}
