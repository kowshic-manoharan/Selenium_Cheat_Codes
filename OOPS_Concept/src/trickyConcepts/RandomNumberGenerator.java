/**
 * This code is used to generate the random number in java
 */
package trickyConcepts;

import java.util.Random;

/**
 * @author kowshic
 *
 */
public class RandomNumberGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random ra = new Random();
		int rv = ra.nextInt(3);
		System.out.println(rv);
	}
}
