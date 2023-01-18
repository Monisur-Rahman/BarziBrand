package functional_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FormData;
import utility.BrowserHandle;

public class TestFormData extends BrowserHandle {
	
	public FormData fd;
	
	@Test
	public void form1()  {
		
		 fd= new FormData(driver);
		
		boolean clickContactPage = fd.contactPage();
		Assert.assertEquals(clickContactPage, true,"Failed to click on contactPage");
				
		boolean scroll = fd.scrollToPhone();
		Assert.assertEquals(scroll, true,"Failed to scroll2Phone");
		

		
		boolean clickFirstName = fd.firstName();
		Assert.assertEquals(clickFirstName, true,"Failed to click on firstname");
		
		boolean clickLastName = fd.lastName();
		Assert.assertEquals(clickLastName, true,"Failed to click on lastname");
		
		boolean clickEmail = fd.email();
		Assert.assertEquals(clickEmail, true,"Failed to click on email");
		
		boolean clickPhoneNumber = fd.phoneNumber();
		Assert.assertEquals(clickPhoneNumber, true,"Failed to click on phoneNumber");
		
		boolean clickMessage = fd.message();
		Assert.assertEquals(clickMessage, true,"Failed to click on message");
		
		boolean clickSubmitBtn = fd.submitBtn();
		Assert.assertEquals(clickSubmitBtn, true, " Failed to click on submit Button");
		
		
	}
}
