package testng.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class RunMultiple {

	private String data = "";

	public RunMultiple(String data) {
		this.data = data;
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class executed.");
	}

	@Test
	public void login() {

		//Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	

		// Maximize
		driver.manage().window().maximize();

		//Step 3: Load URL		
		driver.get("http://leaftaps.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Step 4: Enter UserName
		driver.findElementById("username").sendKeys(data);

		//Step 5: Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();

	}


	public class CreateTestsFactory 
	{
		@Factory
		public Object[] factoryMethod() {
			return new Object[] { 
					new RunMultiple("DemoSalesManager"), 
					new RunMultiple("DemoCSR") 
			};
		}

	}
}