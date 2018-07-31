package in.bushansirgur;
/*
 
 	Program to print the following pattern
 	
 	   * 
      * * 
     * * * 
    * * * *
    
 */
public class PatternFive {
	public static void main(String[] args) {
        int size = 4;
        for(int i = 0; i < size; i++) {
        	for(int j = size - 1; j >= 0; j--) {
        		if(j > i) {
        			System.out.print(" ");
        		}else {
        			System.out.print("* ");
        		}
        	}
        	System.out.println();
        }
    }
}
