package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	
	public static void main(String[] args) {
		
		//Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		
		//Step2: Call Java Class to another Class
		//ClassName obj = new ClassName();		
		ChromeDriver driver = new ChromeDriver();	
		
		// Maximize
		driver.manage().window().maximize();
		
		//Step 3: Load URL		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step 4: Enter UserName
		driver.findElementByXPath("//*[@id='demon_content']/div[2]/input").click();
		driver.findElementByLinkText("Sign up").click();
		
		
		
		
		
		
		
		
		
	}

}
