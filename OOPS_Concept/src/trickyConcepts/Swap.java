/**
 *  Swapping of two no
 */
package trickyConcepts;

/**
 * @author kowshic
 *
 */
public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 2, b = 9, c = 5;
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
	}
}
