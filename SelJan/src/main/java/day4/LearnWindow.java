package day4;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	

		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/snap1.jpg");
		FileUtils.copyFile(src, des);
		
	for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
		}
		System.out.println("After Move");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./snaps/snap2.jpg");
		FileUtils.copyFile(src1, des1);
		/*
	//	driver.close();

		Set<String> allNewWindows = driver.getWindowHandles();
		for (String eachWindow : allNewWindows) {
			driver.switchTo().window(eachWindow);
			break;
		}

		System.out.println("After Second Move");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		driver.quit();














































*/
	}

}
