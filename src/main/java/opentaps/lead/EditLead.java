package opentaps.lead;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;


public class EditLead extends LeafTapsWrappers {	

	@Test(/*groups={"sanity"}, dependsOnGroups = {"smoke"},*/invocationCount=3)
	public void editLead() throws Exception{
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", "Gopinath");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		waitUseThread(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		verifyTitle("View Lead | opentaps CRM");
		clickByXpath("//a[contains(text(),'Edit')]");
		selectVisibileTextById("updateLeadForm_industryEnumId", "Computer Software");
		clickByXpath("//input[@class='smallSubmit']");
	}
}
