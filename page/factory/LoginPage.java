package page.factory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {

	private RemoteWebDriver driver;

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id="username")
	WebElement userName;

	@FindBys({@FindBy(id = "form"),@FindBy(name="PASSWORD")})
	WebElement password;

	@FindAll({@FindBy(className="decorativeSubmit1"), @FindBy(xpath="//input[@type='submit1']")})
	WebElement login;


	// Enter user name in Login Page
	public LoginPage enterUserName(String data){
		userName.sendKeys(data);
		return this;
	}

	// Enter password in Login Page
	public LoginPage enterPassword(String data){
		password.sendKeys(data);
		return this;
	}

	// Click Login in Login Page
	public LoginPage clickLogin(){
		login.click();
		return this;
	}

}
