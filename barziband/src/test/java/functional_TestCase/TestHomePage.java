package functional_TestCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SpiceShopPage;
import utility.BrowserHandle;
@Listeners(utility.Listener.class)

public class TestHomePage extends BrowserHandle {
	HomePage hp;
	SpiceShopPage sSP;
	
	@Test(description="Test HomePage")
	public void caseTwo(){
		
		 hp = new HomePage(driver);
//		 sSP = new SpiceShopPage(driver);
		 
//		  boolean broken_Links = hp.brokenLinks();
//		  Assert.assertEquals(broken_Links, true, "failed to find broken link");
		 
		  
		 
//		   boolean clickSSP = sSP.clickSpiceShop();
//		   Assert.assertEquals(clickSSP, true, "Failed to click on spiceShop");
		 
		 boolean clickonLogo = hp.loGo();
		 Assert.assertEquals(clickonLogo, true , "Failed to click on Logo");
 
		 boolean clickfbIcon = hp.facebookLogo();
		 Assert.assertEquals(clickfbIcon, true , "Failed to click on clickfbIcon");
		 
		 boolean clicktwtIcon = hp.twitterLogo();
		 Assert.assertEquals(clicktwtIcon, true , "Failed to click on clicktwtIcon");
		 
		 boolean clickutubeIcon = hp.youtubeLogo();
		 Assert.assertEquals(clickutubeIcon, true , "Failed to click on clickutubeIcon");
		 
		 boolean cliclhomeLink = hp.homePageLink();
		 Assert.assertEquals(cliclhomeLink, true , "Failed to click on cliclhomeLink");
		 
		 boolean clickshopLink = hp.spiceShopLink();
		 Assert.assertEquals(clickshopLink, true , "Failed to click on clickshopLink");
		 
		 boolean clickhistoryLink = hp.historyLink();
		 Assert.assertEquals(clickhistoryLink, true , "Failed to click on clickhistoryLink");
		 
		 boolean clickcontactLink = hp.contactLink();
		 Assert.assertEquals(clickcontactLink, true , "Failed to click on clickcontactLink");
		
		 boolean checkSearchFeature = hp.searchField();
		 Assert.assertEquals(checkSearchFeature, true, "Failed to click on checkSearchFeature");
		
		 boolean clickOnShop = hp.shop_Now();
		 Assert.assertEquals(clickOnShop, true,"Failed to click on clickOnShop");
		 
		 boolean scrollShopNow = hp.shopNowScroll();
		 Assert.assertEquals(scrollShopNow, true,"Failed to scroll on ShopNow");
		 
		 boolean scrollAbout = hp.aboutScroll();
		 Assert.assertEquals(scrollAbout, true,"Failed to scroll on About");
		
		 boolean scrollAboutImage = hp.aboutImageScroll();
		 Assert.assertEquals(scrollAboutImage, true,"Failed to scroll on AboutImage");
		 
		 boolean clickScrollLearnMore = hp.LearnMore();
		 Assert.assertEquals(clickScrollLearnMore, true, "Failed to click on LearnMore");
		 
		 boolean scrollPremiumOnline = hp.premiumOnlineScroll();
		 Assert.assertEquals(scrollPremiumOnline, true,"Failed to scroll on PremiumOnline");
		 
//		 boolean clickSpiceShopTile = hp.spiceShopTile();
//		 Assert.assertEquals(clickSpiceShopTile, true,"Failed to click on SpiceShopTile");
//		 
//		 boolean clickHistoryTile = hp.historyTile();
//		 Assert.assertEquals(clickHistoryTile, true,"Failed to click on HistoryTile");
//		 
//		 boolean clickTermsandConditionTile = hp.termsandconditionTile();
//		 Assert.assertEquals(clickTermsandConditionTile, true,"Failed to click on HistoryTile");
		 
		 boolean scrollTermsandConditionTile = hp.termsandconditionScroll();
		 Assert.assertEquals(scrollTermsandConditionTile, true,"Failed to click on TermsandConditionTile");
		
//	skip	boolean clickDiffProd = hp.differentProduct();
//		Assert.assertEquals(clickDiffProd, true, "failed to click on clickDiffProd");
		
	}
}
