package opentaps.lead;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrappers;

public class CreateLead extends LeafTapsWrappers {
	
	@Test(groups ={"smoke"},invocationCount=2)
	public void createLead() throws Exception{	
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Qeagle");
		enterById("createLeadForm_firstName", "Gopinath");
		enterById("createLeadForm_lastName", "Jayakumar");
		selectByIndexById("createLeadForm_dataSourceId", 2);
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Demo Marketing Campaign");
		enterById("createLeadForm_primaryEmail", "gopinath@testcom");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");
	}
}









