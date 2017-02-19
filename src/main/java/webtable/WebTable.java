package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Navigate to the url
		driver.get("http://erail.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Set default waiting time for finding an element (after the page loads)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("LLI", Keys.TAB);

		WebElement table = driver.findElementByXPath("(//div[@id='divTrainsList']/table)[1]");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		System.out.println(	rows.size());
		
		WebElement firstRow = rows.get(0);
		
		List<WebElement> col = firstRow.findElements(By.tagName("td"));
		
		System.out.println(col.size());
		
		System.out.println(col.get(1).getText());









	}

}
