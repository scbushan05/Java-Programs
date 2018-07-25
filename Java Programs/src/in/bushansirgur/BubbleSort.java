package in.bushansirgur;

import java.util.Arrays;

/*
 * 	Given an integer array, sort them in ascending order(bubble sort)
 * 	
 *	Input: {5, 2, 1, 8, 9, 4, 6, 0}
 *	Output: {0, 1, 2, 4, 5, 6, 8, 9}
 *
 * */
public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {5, 2, 1, 8, 9, 4, 6, 0};
		System.out.println(Arrays.toString(bubbleSort(a)));
	}
	public static int[] bubbleSort(int a[]) {
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {	//for descending change it to '<'
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
