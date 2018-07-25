package in.bushansirgur;

import java.util.Arrays;

/*
 * 	Given an integer array, group even numbers left side of the array and odd numbers right side of the array
 * 
 * 	Input: {5, 4, 7, 9, 13, 8, 10}
 * 	Output: {4, 8, 10, 9, 13, 5, 7}
 * 
 * */
public class GroupEvenAndOdd {
	public static void main(String[] args) {
		int a[] = {5, 4, 7, 9, 13, 8, 10};
		System.out.println(Arrays.toString(groupEvenAndOdd(a)));
	}
	
	public static int[] groupEvenAndOdd(int a[]) {
		int j = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		return a;
	}
}
