package wait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FindLeads {

	// package.class.methodName
	@Test()
	public void findLeads() throws MalformedURLException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 2: Load URL
		driver.get("http://leaftaps.com/");
		driver.manage().window().maximize();

		// Step 3: Enter User Name
		WebElement username = driver.findElementById("username");
		username.sendKeys("DemoSalesManager");

		// Step 4: Enter Password
		driver.findElementById("password").sendKeys("crmsfa");

		// Step 5: Click Login 
		driver.findElementByClassName("decorativeSubmit").click();

		// Step 6: Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Step 7: Click Find Lead
		driver.findElementByLinkText("Leads").click();

		// Step 8: Click Find Leads
		driver.findElementByLinkText("Find Leads").click();

		// Step 9: Enter First Name
		driver.findElementByXPath("(//*[@name='firstName'])[3]").sendKeys("B");

		// Step 10: Click Find Leads
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		
		ele.click();
		// Click on the first lead
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		// close		
		driver.close();

		
		
		
		
		
		
		
		
		
	}

}
