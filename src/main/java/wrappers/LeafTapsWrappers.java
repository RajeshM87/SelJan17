package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LeafTapsWrappers extends GenericWrappers {
	
	
	@BeforeMethod(groups ={"common"})
	public void login() throws Exception{
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}
	
	
	@AfterMethod(groups ={"common"})
	public void close(){
		quitBrowser();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
