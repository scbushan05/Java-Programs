package in.bushansirgur;

/* Given a integer number, check whether the given number is Palindrome or not
 * If it is Palindrome, return true otherwise return false
 * 
 * Input: 1001
 * Output: true
 * 
 * Input: 1345
 * Output: false
 * 
 * */
public class IsNumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1001));
		System.out.println(isPalindrome(1345));
	}
	
	public static boolean isPalindrome(int number) {
		int temp = number;
		int sum = 0;
		while(number != 0) {
			int rem = number % 10;
			sum = (sum * 10) + rem;
			number = number / 10;
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}
}
