/**
 * 
 */
package javaBasics;

/**
 * @author kowshic
 *
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String actual = "kowshic";
		String reverse = "";
		
		for(int i=actual.length()-1; i>=0; i--) {
			reverse = reverse + actual.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
