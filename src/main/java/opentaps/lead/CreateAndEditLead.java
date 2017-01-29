package opentaps.lead;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;

@Test(groups = {"smoke"})
public class CreateAndEditLead extends LeafTapsWrappers {
	
	@Test(groups={"sanity"})
	public void createLead() throws Exception{	
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName1","Qeagle");
		enterById("createLeadForm_firstName", "Gopinath");
		enterById("createLeadForm_lastName", "Jayakumar");
		selectByIndexById("createLeadForm_dataSourceId", 2);
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Demo Marketing Campaign");
		enterById("createLeadForm_primaryEmail", "gopinath@testcom");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");
	}
	
	@Test
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









