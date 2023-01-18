package functional_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SpiceShopPage;
import utility.BrowserHandle;

public class TestSpiceShop_Page extends BrowserHandle {
	
	@Test
	public void caseThree(){
		SpiceShopPage sp = new SpiceShopPage(driver);
		
		boolean clickssp = sp.clickSpiceShop();
		Assert.assertEquals(clickssp, true , "Failed to click on ssp");
		
		
		
		
		
	}
}
