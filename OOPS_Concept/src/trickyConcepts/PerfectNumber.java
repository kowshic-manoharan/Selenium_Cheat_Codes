/**
 *  Code is used to find the perfect no
 */
package trickyConcepts;

import java.util.Scanner;

/**
 * @author kowshic
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter the number :");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		int k = 0;
		for(int i=1; i<a-1; i++) {
			if (a%i==0) {
				System.out.println("divisor " + i);
				k=k+i;
			}
		}
		System.out.println("Sum of the divisor " + k);
		if(k==a) {
			System.out.println(a + "is a perfect no");
		}
		else
			System.out.println(a + " is not a perfect no");
	}
}
