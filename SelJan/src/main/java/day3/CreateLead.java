package day3;

import wrappers.LeafTapsWrapper;


public class CreateLead {
	public static void main(String[] args) throws Exception {
		
		LeafTapsWrapper wrapper = new LeafTapsWrapper();
		wrapper.login();		
		wrapper.clickByLink("Create Lead");
	}
}
