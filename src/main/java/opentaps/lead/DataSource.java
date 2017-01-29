package opentaps.lead;

import org.testng.annotations.DataProvider;

public class DataSource {
	@DataProvider(name="dataSource")
	public static Object[][] dataUtils(){
		Object[][] data = new Object[2][2];
		data[0][0]="Chrome";	data[0][1]="http://leaftaps.com";
		data[1][0]="Firefox";	data[1][1]="http://google.com";
			
		
		return data;
		
	}
}
