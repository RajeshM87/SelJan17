package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginBasicCode {

	@Test
	public void runAlert() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.MAC);
		
		/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	*/
		RemoteWebDriver driver = new RemoteWebDriver
				(new URL("http://192.168.1.19:4444/wd/hub"), dc);
		
		//Step2: Call Java Class to another Class
		//ClassName obj = new ClassName();		
		//ChromeDriver driver = new ChromeDriver();	
		//FirefoxDriver d = new FirefoxDriver();
		// Maximize
		driver.manage().window().maximize();
		
		//Step 3: Load URL		
		driver.get("http://leaftaps.com/");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step 4: Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Step 5: Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Step 6: Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Click CRM SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Click Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		//.sendKeys("Employee");
		
		Select dropdown = new Select(src);
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("LEAD_DIRECTMAIL");
		//dropdown.selectByVisibleText("Public Relations");
		
		int Optionsize = dropdown.getOptions().size();		
		dropdown.selectByIndex(Optionsize-1);
		
		//Step 7: Click LogOut
		//driver.findElementByClassName("decorativeSubmit").click();
		
		driver.close();
		
	}

}
