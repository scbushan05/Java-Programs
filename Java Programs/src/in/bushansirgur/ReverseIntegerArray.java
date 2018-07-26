package in.bushansirgur;

import java.util.Arrays;

/*
 * 	Given an integer array, reverse the elements in the array without using anyother array
 * 
 * 	Input: {1, 8, 9, 7, 6, 5, 10}
 * 	Output: {10, 5, 6, 7, 9, 8, 1}
 * 
 * */
public class ReverseIntegerArray {
	public static void main(String[] args) {
		int a[] = {1, 8, 9, 7, 6, 5, 10};
		System.out.println(Arrays.toString(reverseArray(a)));
	}
	
	public static int[] reverseArray(int a[]) {
		int last = a.length - 1;
		for(int first = 0; first < last; first++, last--) {
			int temp = a[first];
			a[first] = a[last];
			a[last] = temp;
		}
		return a;
	}
}
