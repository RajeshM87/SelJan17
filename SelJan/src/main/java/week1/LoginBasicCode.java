package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginBasicCode {

	
	public static void main(String[] args) {
		
		//Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		//Step2: Call Java Class to another Class
		//ClassName obj = new ClassName();		
		ChromeDriver driver = new ChromeDriver();	
		
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
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		//.sendKeys("Employee");
		
		Select dropdown = new Select(src);
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("LEAD_DIRECTMAIL");
	//	dropdown.selectByVisibleText("Public Relations");
		
		int Optionsize = dropdown.getOptions().size();
		
		dropdown.selectByIndex(Optionsize-1);
		
		//Step 7: Click LogOut
	//	driver.findElementByClassName("decorativeSubmit").click();
		
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
