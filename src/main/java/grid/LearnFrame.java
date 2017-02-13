package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnFrame {

	@Test
	public void runAlert() throws InterruptedException, MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
/*		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	*/
		RemoteWebDriver driver = new RemoteWebDriver
				(new URL("http://192.168.1.19:4444/wd/hub"), dc);
		
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		WebElement txt = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(txt);		
		String ItemName = driver.findElementByXPath("//*[@id='selectable']/li[2]").getText();
		System.out.println(ItemName);
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();
		
	}

}
