/**
 * 
 */
package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kowshic
 *
 */
public class CreatePage {
	
WebDriver driver;
	
	public CreatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	public WebElement email() {
		return email;
	}
	
	public WebElement password() {
		return password;
	}
}
