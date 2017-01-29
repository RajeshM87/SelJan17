package day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	
	public static void main(String[] args) {
		
		//Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		//Step2: Call Java Class to another Class
		//ClassName obj = new ClassName();		
		ChromeDriver driver = new ChromeDriver();	
		//FirefoxDriver d = new FirefoxDriver();
		// Maximize
		driver.manage().window().maximize();
		
		//Step 3: Load URL		
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElementsByLinkText("Get-a-Quote");
		System.out.println(links.size());
		links.get(3).click();
		
		
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
