/**
 * 
 */
package excelDataDriven;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class ExcelDataRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ExcelUtilty eu = new ExcelUtilty();
		ArrayList data = eu.readFromExcel("fhfh");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3)); 
	}
}
