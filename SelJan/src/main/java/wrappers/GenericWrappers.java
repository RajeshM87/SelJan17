package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers{
	RemoteWebDriver driver;
	int i=1;

	public void invokeApp(String browser, String Url) throws Exception {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Please enter valid browser name");
			System.exit(0);
		}
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		takeSnap();
		System.out.println("The Browser is Launched");
	}
	

	@Override
	public void enterById(String idValue, String data) throws Exception {
		driver.findElementsById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		takeSnap();
		System.out.println("The text Field "+ idValue+ " value " +data+ " is entered");
	}

	@Override
	public void enterByName(String nameValue, String data) throws Exception {
		driver.findElementByName(nameValue).clear();
		driver.findElementByName(nameValue).sendKeys(data);

	}

	@Override
	public void enterByXpath(String xpathValue, String data) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickById(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByClassName(String classVal) throws Exception {
		// TODO Auto-generated method stub
		driver.findElementByClassName(classVal).click();
	}

	@Override
	public void clickByName(String name) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByLink(String name) throws Exception {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(name).click();
	}

	@Override
	public void clickByLinkNoSnap(String name) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByXpath(String xpathVal) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectVisibileTextById(String id, String value)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub


	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(src1, des1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
