/**
 *  This is the program to learn the Static dropdown function
 *  1)Print all the values in the dropdown
 *  2)Check all the expected values are in dropdown
 *  3)Check desired value is present in the dropdown
 *  4)Select the desired values in the dropdown
 *  
 */
package webComponentsSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author kowshic 
 * @version Selenium 3.0
 *
 */
public class StaticDropdown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver();

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.spicejet.com/");

		// Select is the method used for the static dropdown
		Select dropDown = new Select(
				driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		String allValues = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"))
				.getText();// getText method is used to print all the values in the dropdown
		System.out.println(allValues);

		/*
		 * Check all the expected values of dropdown is present in the dropdown or not
		 */
		allValueCheck(dropDown, driver);

		/* Check all the desired values of dropdown is present in the dropdown or not */
		desiredValueCheck(dropDown);

		/* Below are the three methods we can used to get the values in dropdown */
		selectByValue(dropDown);
		Thread.sleep(7000);
		selectByIndex(dropDown);
		Thread.sleep(7000);
		selectByVisibleText(dropDown);
		Thread.sleep(7000);

		// Close the Browser
		driver.close();
	}

	/**
	 * This method checks the desired dropdown value is present or not
	 * 
	 * @param dropDown
	 */
	private static void desiredValueCheck(Select dropDown) {
		String valueBeingChecked = "USD";
		@SuppressWarnings("unused")
		int value = 0;
		List<WebElement> allOptions = dropDown.getOptions();
		for (WebElement desiredElement : allOptions) {
			if (desiredElement.getText().contains(valueBeingChecked)) {
				value = 1;
				System.out.println("Desired value is exists in the drop down");
				break;
			}
		}
	}

	/**
	 * This method check all the expected values of dropdown is present in the
	 * dropdown or not
	 * 
	 * @param dropDown
	 * @param driver
	 */
	private static void allValueCheck(Select dropDown, WebDriver driver) {
		String[] expectedDropdownValues = new String[] { "Select", "INR", "AED", "US" };
		List<String> expList = new ArrayList<String>();
		for (int i = 0; i < expectedDropdownValues.length; i++) {
			expList.add(expectedDropdownValues[i]);
		}
		System.out.println("Expected values in the drop down are :" + Arrays.toString(expectedDropdownValues));

		List<String> actList = new ArrayList<String>();// Creating an object

		List<WebElement> options = dropDown.getOptions();
		for (WebElement listValues : options) {
			actList.add(listValues.getText()); // adding the values in the list
		}
		System.out.println("Actual values in the drop down are :" + actList);

		int indexPosition = 0;
		if (expList.size() == actList.size()) { // this part is used to check the count values are same in number
			for (int i = 0; i < expList.size(); i++) {
				// comparing each item in order
				if (expList.get(i).equals(actList.get(i))) {
					System.out.println("Expected Dropdown value" + expList.get(indexPosition)
							+ " is Matched with actual Dropdown" + actList.get(indexPosition)); // get(indexPosition) is
																								// used to print the
																								// value in the index
				} else {
					System.out.println("Expected Dropdown value" + expList.get(indexPosition)
							+ " is not matched with actual Dropdown" + actList.get(indexPosition));
				}
				indexPosition = indexPosition + 1;
			}
		} else {
			System.out.println("Drop down values are not same in number");
		}
	}

	/**
	 * Selects/deselects the option that displays the text matching the parameter.
	 * getFirstSelectedOption method is used to print the value which is present
	 * currently (Selected) in the dropdown box
	 * 
	 * @param dropDown
	 */
	private static void selectByVisibleText(Select dropDown) {
		dropDown.selectByVisibleText("INR");
		String value2 = dropDown.getFirstSelectedOption().getText();
		System.out.println("The value currently present in the dropdown is : " + value2);
		System.out.println("***Success***");
	}

	/**
	 * Selects/deselects the option at the given index.
	 * getFirstSelectedOption method is used to print the value which is present
	 * currently (Selected) in the dropdown box
	 * 
	 * @param dropDown
	 */
	private static void selectByIndex(Select dropDown) {
		dropDown.selectByIndex(2);
		String value1 = dropDown.getFirstSelectedOption().getText();
		System.out.println("The value currently present in the dropdown is : " + value1);
		System.out.println("***Success***");
	}

	/**
	 * Selects/deselects the option whose "value" attribute matches the specified parameter.
	 * getFirstSelectedOption method is used to print the value which is present
	 * currently (Selected) in the dropdown box
	 * 
	 * @param dropDown
	 */
	private static void selectByValue(Select dropDown) {
		dropDown.selectByValue("USD");
		String value = dropDown.getFirstSelectedOption().getText();
		System.out.println("The value currently present in the dropdown is : " + value);
		System.out.println("***Success***");
	}
}
