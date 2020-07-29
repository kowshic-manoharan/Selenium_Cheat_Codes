/**
 * This is the program to learn add the items in the cart
 */
package webComponentsSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author kowshic
 * @version Selenium 3.0
 */
public class BigBasket {

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
		driver.get("https://www.bigbasket.com/");

		driver.findElements(By.cssSelector("div.overlay-area"));
		driver.findElement(By.xpath(
				"//img[@src='//www.bigbasket.com/media/uploads/banner_images/T1_All_Home-Kitchen_DT_3_190x60_25thJune.jpg']"))
				.click();
		Thread.sleep(7000);
		String[] itemsNeeded = { "Wet Dog Food - Chicken & Liver Chunks In Gravy, For Adult Dogs (Pack of 15)", "Ultra Alkaline Battery AA", "Ultra Alkaline Battery AAA"};
		addItems(driver, itemsNeeded);
		Thread.sleep(5000);
		driver.close();
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j = 0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		List<WebElement> products = driver.findElements(By.xpath("//*[@class='col-sm-12 col-xs-7 prod-name']/child::a"));
		for (int i = 0; i < products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			{
				j++; 
				// click on Add to cart
				
				WebElement scanEle =new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-sm-5 col-xs-5 pad-0']/button")));
				Actions action =new Actions(driver);
				action.moveToElement(scanEle).click().build().perform();
				
				System.out.println("Product is added in the cart successfully");
				if (j == itemsNeeded.length)
				{
					break;
				}
			}
		}
		System.out.println("ended");
	}
}
