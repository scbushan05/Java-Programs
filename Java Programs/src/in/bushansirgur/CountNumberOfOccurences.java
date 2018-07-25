package in.bushansirgur;

/*
 *	Given a String sentence and String target, find how many times String target occur in String sentence
 *
 * 	Input: My java program jav java. i like java course
 * 		   java
 * 	Output: 3	
 * */

public class CountNumberOfOccurences {
	public static void main(String[] args) {
		System.out.println(countOccurences("My java program jav java. i like java course", "java"));
	}
	
	public static int countOccurences(String sentence, String word) {
		int count = 0;
		int index = 0;
		int length = word.length();
		while(index != -1) {
			index = sentence.indexOf(word, index);
			
			if(index != -1) {
				count++;
				index = index + length;
			}
		}
		return count;
	}
}
