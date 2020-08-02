/**
 * This code contains all te objects present in the login page
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
public class LoginPageObjects {
	
public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user_email']")
	WebElement email;
	
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement password;
	
	public WebElement getemail(){
		return email;
	}
	
	public WebElement getpassword(){
		return password;
	}
}
