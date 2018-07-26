package in.bushansirgur;

/*
 * Given a String, sort the characters in ascending/descending order and return the sorted string back
 * 
 * Input: bushansirgur
 * Output: abghinrrssuu
 * 
 * */
public class SortCharactersInWord {
	public static void main(String[] args) {
		System.out.println(sortCharacters("bushansirgur"));
	}
	public static String sortCharacters(String str){
	    char[] c = str.toCharArray();
	    for(int i = 0; i < c.length - 1; i++){
	        for(int j = i + 1; j < c.length; j++){
	            if(c[i] > c[j]){
	                char temp = c[i];
	                c[i] = c[j];
	                c[j] = temp;
	            }
	        }
	    }
	    return new String(c);
	}
}
