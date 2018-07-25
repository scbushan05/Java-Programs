package in.bushansirgur;

/* Reverse a given string
 * 
 * Input: Bushan Sirgur
 * Output: rugriS nahsuB
 * 
 * */

public class StringRevers {
	public static void main(String[] args) {
		System.out.println(reverseString("Bushan Sirgur"));
	}
	public static String reverseString(String str) {
		char[] c = str.toCharArray();
		int last = c.length - 1;
		for(int first = 0; first < last; first++, last--) {
			char temp = c[first];
			c[first] = c[last];
			c[last] = temp;
		}
		String finalString = new String(c);
		return finalString;
	}
}
