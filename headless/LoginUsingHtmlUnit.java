package headless;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginUsingHtmlUnit {

	@Test
	public void htmlUnit() throws HeadlessException, AWTException, IOException {
		
		//Step 1: Launch Browser
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		// Maximize
		driver.manage().window().maximize();
		
		//Step 3: Load URL		
		driver.get("http://leaftaps.com/");
				
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		
		//Step 4: Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Step 5: Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Step 6: Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Print the title and the URL
		System.out.println(driver.getTitle());
		
		// Click on Create Lead
		driver.findElementByLinkText("Create Lead").click();
		System.out.println(driver.getTitle());

		// CAN'T TAKE SNAPSHOT
	
		
		
		
		
		
		
		
	}

}
