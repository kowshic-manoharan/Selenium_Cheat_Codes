/**
 * 
 */
package webComponentsSelenium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author kowshic
 *
 */
public class FileUploadAndDownload {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		String downloadPath = System.getProperty("user.dir");
		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Common code we can able to get the documentation from chrome
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver(options);

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://smallpdf.com/pdf-to-word");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div//div//div//div//button[1]"))
				.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\kowsh\\OneDrive\\Documents\\fileUpload.exe");
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//body/div/div/div/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")));
		driver.findElement(By.xpath("//body/div/div/div/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[contains(text(),'Choose option')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//a")));
		driver.findElement(By.xpath(
				"//html//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//a"))
				.click();
		Thread.sleep(5000);
		File f = new File(downloadPath + "/Kowshic_Manoharan_-_Quality_Assurance_Engineer-converted.docx");
		if (f.exists()) {
			Assert.assertTrue(f.exists());
			if (f.delete())
				System.out.println("file deleted");
		}
		driver.close();
	}
}
