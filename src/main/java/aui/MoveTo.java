package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) throws InterruptedException {

		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("http://www.flipkart.com/");
		
		WebElement element =driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();
		Thread.sleep(3000);
		WebElement apple = driver.findElementByXPath("//span[contains(text(),'Apple')]");
		builder.click(apple).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
