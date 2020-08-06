/**
 * 
 */
package javaBasics;

/**
 * @author kowshic
 *
 */
public class Pyramid2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int z =1;
		for (int i=0; i<4; i++) 
        { 
  
            // inner loop to handle number spaces 
            for (int j=4-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print(z+" "); 
                z++;
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
	}

}
