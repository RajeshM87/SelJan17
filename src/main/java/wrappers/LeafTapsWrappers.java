package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excel.DataInputProvider;



public class LeafTapsWrappers extends GenericWrappers {


	@BeforeMethod
	public void login() throws Exception{
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}


	@AfterMethod
	public void close(){
		quitBrowser();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData() throws InvalidFormatException, IOException{
		DataInputProvider dip=new DataInputProvider();
		return dip.readExcel("Login");
	}


	
	
	
	
	
	
	
	
	
	
	
}
