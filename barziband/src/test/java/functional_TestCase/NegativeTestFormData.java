package functional_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.NegativeFormData;
import utility.BrowserHandle;

public class NegativeTestFormData extends BrowserHandle {

	@Test
	public void negativeTest(){
		
		NegativeFormData nfd = new NegativeFormData();
		
		boolean clickContactPage = nfd.contactPage();
		Assert.assertEquals(clickContactPage, true,"Failed to click on contactPage");
				
		boolean scroll = nfd.scrollToPhone();
		Assert.assertEquals(scroll, true,"Failed to scroll2Phone");
		
		boolean submit = nfd.submitBtn();
		Assert.assertEquals(submit, true,"Failed to click on submit button");
		
//		boolean errorMsg = nfd.getErrorMsg();
//		Assert.assertEquals(errorMsg, true, "Failed to get Error Message");
				

		
	}
	
}
