package Q5;
/*Write a substring method that accepts a string str and an integer idx and returns the substring  
 * contained  between  0  and  idx-1inclusive.Do NOT  use  any  of  the  existing substring methods
 *  in the String, StringBuilder, or StringBuffer APIs*/

public class Q5 {
	public static void main(String[] args) {
		String str = "Hello World";
		int idx = 4;
		str = inclusive(str, idx);
		System.out.println(str);
	}
	
	public static String inclusive(String str, int idx) {
		String result = "";
		for (int i = 0; i <= idx ; i++)
			result += str.charAt(i);
		return result;
	}
}
