/**
 * this code contains all the objects present in the Login page
 */
package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kowshic
 * @version Selenium 3.0
 * 
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	@FindBy(linkText = "Create a Page")
	WebElement createpage;
	
	public WebElement email() {
		return email;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement createpage() {
		return createpage;
	}

}
