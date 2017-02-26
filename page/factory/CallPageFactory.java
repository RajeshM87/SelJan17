package page.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallPageFactory {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		new LoginPage(driver)
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin();

	}

}
