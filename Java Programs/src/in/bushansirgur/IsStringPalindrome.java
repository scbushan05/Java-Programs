package in.bushansirgur;

/*
 *  Given a String, check whether the given String is palindrome or not, if it 
 *  Palindrome return true, otherwise return false
 *  
 *  Input: gadag
 *  Output: true
 *  
 *  Input: bushan
 *  Output: false
 *  
 *  */
public class IsStringPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("gadag"));
		System.out.println(isPalindrome("bushan"));
	}
	
	public static boolean isPalindrome(String str) {
		char[] c = str.toCharArray();
		int last = c.length - 1;
		for(int first = 0; first < last; first++, last--) {
			if(c[first] != c[last]) {
				return false;
			}
		}
		return true;
	}
}
