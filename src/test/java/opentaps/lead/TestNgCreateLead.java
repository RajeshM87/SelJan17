package opentaps.lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TestNgCreateLead extends GenericWrappers {
	@Test(dataProvider="dataSource",dataProviderClass=DataSource.class)
	public void createLead(String Browser,String URL){
		System.out.println("Browser is:"+Browser);
		System.out.println("URL is :"+URL);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Parameters({ "browser","url"/*,"userName", "password"*/ })

	/*public void createLead(@Optional("safari")String browser,@Optional("http://www.paypal.com")String url,String UN,String pwd) throws Exception {
		
		System.out.println("Browser is:"+browser);
		System.out.println("URL is :"+url);
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
}
