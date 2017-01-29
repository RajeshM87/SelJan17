package annotations;

import org.testng.annotations.Test;

public class Attributes {

	int i =1;

	@Test(invocationCount = 2, invocationTimeOut = 3000, threadPoolSize=2 )
	public void createLead1() throws Exception {
		if (i == 1) {
			Thread.sleep(1500);
			System.out.println("Executing create lead 1");
		} else {
			Thread.sleep(1700);
			System.out.println("Executing create lead 2");
		}
		i++;
	}


		@Test(invocationCount = 2, timeOut=3000 )
		public void createLead2() throws Exception {
			if (i == 1) {
				Thread.sleep(1500);
				System.out.println("Executing create lead 1");
			} else {
				Thread.sleep(3200);
				System.out.println("Executing create lead 2");
			}
			i++;

		}

		@Test(expectedExceptions=RuntimeException.class)
		public void createLead()  {
			System.out.println("Create Lead");
			throw new RuntimeException("Failed");
		}

		@Test(dependsOnMethods={"opentaps.lead.CreateLead.createLead"},alwaysRun=true)
		public void editLead()  {
			System.out.println("Edit Lead");	
		}

		@Test
		public void fLead()  {
			System.out.println("F_Delete Lead");
		}

		@Test(enabled=false)
		public void duplicateLead()  {
			System.out.println("Duplicate Lead");
		}

	}
