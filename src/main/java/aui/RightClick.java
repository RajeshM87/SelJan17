package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		// Set the system properties
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Launch Browser - Google Chrome
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://dev20191.service-now.com");

		// Go to the frame
		driver.switchTo().frame("gsft_main");

		// enter user name, password and login
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("Tester@123");		
		driver.findElementById("sysverb_login").click();
		driver.switchTo().defaultContent();
		
		// search incident and click link
		driver.findElementById("filter").sendKeys("incident",Keys.ENTER);
		driver.findElementByLinkText("Incidents").click();
		
		// Go to the frame and right click on first incident
		driver.switchTo().frame("gsft_main");
		WebElement firstLink = driver.findElementByXPath("(//a[@class='linked formlink'])[1]");
		
		// right click
		Actions builder = new Actions(driver);
		builder.contextClick(firstLink).build().perform();



















	}

}
