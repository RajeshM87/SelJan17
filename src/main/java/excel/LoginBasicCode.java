package excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;

public class LoginBasicCode extends LeafTapsWrappers {

	
	@Test(dataProvider = "fetchData")
	public void Login(String uName, String password) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();		
		
		
		driver.get("http://leaftaps.com/");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementById("username").sendKeys(uName);
		
		
		driver.findElementById("password").sendKeys(password);
		
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(3000);
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		System.out.println("Success");
	
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
