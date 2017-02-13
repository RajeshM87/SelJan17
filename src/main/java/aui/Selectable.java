package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {

		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("http://jqueryui.com/selectable/");
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		// find the first element
		WebElement list1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		
		// find the fourth element
		WebElement list4 = driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(list1)
		.clickAndHold(list4)
		.release()
		.build()
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
