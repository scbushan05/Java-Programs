package in.bushansirgur;

import java.util.Arrays;

/*
 * 	Given an integer array, shift/move all the zeros to end/last of the array
 *  and return the array back
 *  
 *  Input: {1, 0, 2, 0, 3, 0, 4}
 *  Output: {1, 2, 3, 4, 0, 0, 0}
 *  */
public class MoveAllZerosToLast {
	public static void main(String[] args) {
		int a[] = {1, 0, 2, 0, 3, 0, 4};
		System.out.println(Arrays.toString(moveAllZeros(a)));
	}
	
	public static int[] moveAllZeros(int[] a) {
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != 0) {
				if(i == j) {
					j++;
				}else {
					a[j] = a[i];
					a[i] = 0;
					j++;
				}
			}
		}
		return a;
	}
}
