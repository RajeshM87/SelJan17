package day3;

import wrappers.GenericWrappers;


public class CreateLead {
	public static void main(String[] args) throws Exception {
		GenericWrappers wrapper = new GenericWrappers();
		wrapper.invokeApp("chrome", "http://leaftaps.com/");
		wrapper.enterById("username", "DemoSalesManager");
		wrapper.enterById("password", "crmsfa");
		wrapper.clickByClassName("decorativeSubmit");
		wrapper.clickByLink("CRM/SFA");
		wrapper.clickByLink("Create Lead");
	}
}
