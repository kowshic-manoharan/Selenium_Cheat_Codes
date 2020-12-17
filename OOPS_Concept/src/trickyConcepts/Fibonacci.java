/**
 * Code is used to learn Fibonacci series
 */
package trickyConcepts;

import java.util.Scanner;

/**
 * @author kowshic
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int t1= 0;
		int t2=1;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.print(t1 + " , ");
			int sum = t1 + t2 ;
			t1 = t2;
			t2 = sum;
		}

	}

}
