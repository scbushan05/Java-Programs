package in.bushansirgur;

/*
 * 	Given an integer array which contains positive and negative numbers and find out the average of positive and 
 * 	average of negative numbers.
 * 
 * 	Input: {9,-1,-1,-4,1,5,-4,2,-3,1}
 * 	Output: Average of +ve numbers: 3.6
 * 			Average of -ve numbers: -2.6
 * 
 * */
public class CalculateAveragePositiveAndNegative {
	
	public static void main(String[] args) {
		int a[] = {9,-1,-1,-4,1,5,-4,2,-3,1};
    	calculateAverage(a);
	}
	
	public static void calculateAverage(int a[]) {
		int sumOfPositive = 0;
    	int sumOfNegative = 0;
    	double countPositive = 0.0;
    	double countNegative = 0.0;
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] >= 0) {
    			countPositive++;
    			sumOfPositive = sumOfPositive + a[i];
    		}else {
    			countNegative++;
    			sumOfNegative = sumOfNegative + a[i];
    		}
    	}
    	System.out.println("Average of +ve numbers: "+sumOfPositive / countPositive);
    	System.out.println("Average of -ve numbers: "+sumOfNegative / countNegative);
	}
}
