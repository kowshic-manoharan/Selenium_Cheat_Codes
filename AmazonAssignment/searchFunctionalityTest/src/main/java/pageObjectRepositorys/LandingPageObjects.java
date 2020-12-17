/**
 * This code contains all the locators related to the Landing page
 */
package pageObjectRepositorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kowshic
 * @since 17-12-2020
 *
 */
public class LandingPageObjects {

	public WebDriver driver;

	/**
	 * @param driver
	 */
	public LandingPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#searchDropdownBox") // css selector is used, faster than xpath
	WebElement dropDownbox;

	@FindBy(xpath = "//option[contains(text(),'Books')]")
	WebElement books;

	/**
	 * dropDownbox contains the locator details of dropDownbox
	 * 
	 * @return dropDownbox
	 */
	public WebElement dropDownbox() {
		return dropDownbox;
	}

	/**
	 * books contains the locator details of books
	 * 
	 * @return books
	 */
	public WebElement books() {
		return books;
	}

}
