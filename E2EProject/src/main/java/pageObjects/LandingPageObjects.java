/**
 * This code contains all the objects present in the Landing page
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class LandingPageObjects {
	
	public WebDriver driver;
	
	public LandingPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	WebElement getLogin;
	
	@FindBy(xpath = "//h2[contains(text(),'Featured Courses')]")
	WebElement displayingText;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']")
	WebElement navigationTabs;
	
	public LoginPageObjects getLogin() {
		getLogin.click();
		LoginPageObjects login = new LoginPageObjects(driver);
		return login;
	}
	
	public WebElement getText() {
		return displayingText;
	}
	
	public WebElement getTabs() {
		return navigationTabs;
	}
}
