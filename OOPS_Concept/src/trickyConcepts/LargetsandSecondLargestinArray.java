/**
 * Code to find largest and Second largest in an array
 */
package trickyConcepts;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author kowshic
 *
 */
public class LargetsandSecondLargestinArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a[] = {5,87, 96, 101, 55,89, 64};
		Arrays.sort(a, Collections.reverseOrder()); 
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}
