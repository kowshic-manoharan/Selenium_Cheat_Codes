/**
 * 
 */
package javaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kowshic
 *
 */
public class DateClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));

		//refer https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	}

}
