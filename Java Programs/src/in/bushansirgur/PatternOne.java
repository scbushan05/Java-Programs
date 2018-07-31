package in.bushansirgur;
/*
  	
  	Program to print the following pattern
  
    * 
 	* * 
 	* * * 
 	* * * * 
  	
*/
public class PatternOne{
    public static void main(String[] args) {
    	int size = 4;
    	for(int i = 0; i < size; i++) {
    		for(int j = 0; j <= i; j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
}


