package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	

		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement txt = driver.findElementByClassName("demo-frame");

		driver.switchTo().frame(txt);
		
	//	driver.switchTo().frame(nameOrId)

		String ItemName = driver.findElementByXPath("//*[@id='selectable']/li[2]").getText();


		System.out.println(ItemName);
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		
		
		
		









	}

}
