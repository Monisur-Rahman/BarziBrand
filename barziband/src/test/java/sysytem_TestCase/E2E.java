package sysytem_TestCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Addtocart;
import pages.Canadian_steak_product;
import pages.HomePage;
import pages.ProductPage1;
import pages.ProductPage3;
import utility.BrowserHandle;


public class E2E extends BrowserHandle {
	HomePage home; 
	ProductPage1 pg1;
	ProductPage3 pg3;
	Canadian_steak_product csp;
	Addtocart cart;
	
	@Test
	public void caseOne(){
		 home = new HomePage(driver);
		 pg1  = new ProductPage1(driver);
		 pg3  = new ProductPage3(driver);
		 csp  = new Canadian_steak_product(driver);
		 cart = new Addtocart(driver);
		 
		
		
		boolean clickShopNow = home.shopNow();
		Assert.assertEquals(clickShopNow, true, "Failed to click on clickShopNow");
		
		boolean scrollNclick1 = pg1.scrollPage1();
		Assert.assertEquals(scrollNclick1, true, "Failed to click on scrollNclick1");
		
		boolean scrollNclick3 = pg3.scrollPage3();
		Assert.assertEquals(scrollNclick3, true, "Failed to click on scrollNclick3");
		
		boolean scrollNdINcrProd = csp.scrollPackSize();
		Assert.assertEquals(scrollNdINcrProd, true, "Failed to click on scrollNdINcrProd");
		
		boolean clickAddToCart = cart.goToAdd2Cart();
		Assert.assertEquals(clickAddToCart, true, "Failed to click on clickAddToCart");

	}
	
	
	
	
}
