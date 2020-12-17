/**
 * 
 */
package javaBasics;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author kowshic
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = {0,1,9,8,5,2,6,6,3};
		int val =0;
		for(int i=1; i<=10; i++) {
			val = val + (array[i]*1);
		}
		val = val % 11;
		if(val == 1) {
			System.out.println(val);
					
		}
		else
			System.out.println("-1");
	}
}
