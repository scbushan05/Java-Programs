package in.bushansirgur;

import java.util.Arrays;

/*
 * 	 Given two integers N and M and produces last samples of N of the integers from N-1 to N-M.
 * 	 Input: N = 10, M = 4
 * 	 Output: [9, 8, 7, 6]
 * 
 * 	 Input: N = 5, M = 2
 *   Output: [4, 3]
 * */
public class LastSamplesOfNumber {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(lastSamplesOfNumber(5, 2)));
	}
	
	public static int[] lastSamplesOfNumber(int n, int m) {
    	int limit = n - m;
    	int a[] = new int[m];
    	int count = 0;
    	for(int i = n-1; i >= limit; i--) {
    		a[count] = i;
    		count++;
    	}
    	return a;
    }
}
