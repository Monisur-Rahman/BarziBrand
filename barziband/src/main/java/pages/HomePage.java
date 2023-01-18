package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class HomePage {
	 public WebDriver driver;
	 public String logoTitle;
	 public String homeTitle;
	 
	@FindBy(xpath="//div[contains(@class,'elementor-widget-container')]//span[contains(text(),'Shop Now')]")
	private WebElement shop_now;
	
	@FindBy(tagName="//a")
	private Set<WebElement> broken_link;
	
	@FindBy(xpath="//div[contains(@class,'elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-34c125d')] //a[@href='https://barzibrand.com/']")
	private WebElement logo;
	
	@FindBy(xpath="//div[contains(@class,'elementor-column elementor-col-25 ')]//i[@class='fab fa-facebook-f']")
	private WebElement fbLogo;
	
	@FindBy(xpath="//i[@class='fab fa-twitter']")
	private WebElement twtLogo;
	
	@FindBy(xpath="//i[@class='fab fa-youtube']")
	private WebElement uTubeLogo;
	
	@FindBy(xpath="//li[@id='menu-item-2031']//a[text()='Home']")
	private WebElement homeLink;
	
	@FindBy(xpath="//li[@id='menu-item-2027']//a[text()='Spice Shop']")
	private WebElement spiceShopLink;
	
	@FindBy(xpath="//li[@id='menu-item-2828']//a[text()='History']")
	private WebElement historyLink;
	
	@FindBy(xpath="//li[@id='menu-item-3006']//a[text()='Contact']")
	private WebElement contactLink;
	
	@FindBy(xpath="//div//input[@placeholder='Search...']")
	public WebElement searchField;
	
	@FindBy(xpath="//button[@class='wpr-search-form-submit']")
	public WebElement searchIconButton;
	
	@FindBy(xpath="//h2[text()='About Us']")
	private WebElement _about;
	
	@FindBy(xpath="//img[contains(@src,'https://79mf51.p3cdn1.secureserver.net/wp-content/uploads/2022/09/about2.')]")
	private WebElement about_img;
	
	@FindBy(xpath="//span[text()='LEARN MORE']")
	private WebElement learnmore_button;
	
//	@FindBy(xpath="//h2[text()='The Premier Online Spice Shop']")
//	@FindBy(xpath="//section[contains(@class,'elementor-section elementor-top-section elementor-element elementor-element-2f4c')]")
//	@FindBy(xpath="//p[contains(text(),'Indonesian spice market.')]")
	private WebElement premier_online;
	
//	@FindBy(xpath="//div[contains(@class,'elementor-column elementor-col-33 elementor-inner')]//a[@href='https://barzibrand.com/shop/']")
	@FindBy(xpath="//h4[text()='SPICE SHOP']/../../..//span[text()='View More']")
	private WebElement spice_shop_tile;
	
//	@FindBy(xpath="//div[contains(@class,'elementor-column elementor-col-33 elementor-inner')]//a[@href='https://barzibrand.com/history/']")
	@FindBy(xpath="//h4[text()='HISTORY']/../../..//span[text()='View More']")
	private WebElement history_tiles;
	
//	@FindBy(xpath="//div[contains(@class,'elementor-column elementor-col-33 elementor-inner')]//a[@href='https://barzibrand.com/terms-conditions/']")
	@FindBy(xpath="//h4[text()='TERMS & CONDITIONS']/../../..//span[text()='View More']")
	private WebElement term_condition_tiles;
	
	@FindBy(xpath="//a[contains(text(),'Breadings and Biscuits')]")
	private WebElement Breadings_and_Biscuits;
	
	@FindBy(xpath="//a[text()='Tea']")
	private WebElement tea;
	
	@FindBy(xpath="//a[text()='Barzi Original']")
	private WebElement barzi_original;
	
	@FindBy(xpath="//a[text()='Sauces']")
	private WebElement sauces;
	
	@FindBy(xpath="//a[text()='Spices']")
	private WebElement spices;
	
	
	
	@FindBy(xpath="//span[text()='SHOP NOW']")
	private WebElement prod_shopNow;
	
//	@FindBy(xpath="//img[contains(@src,'https://79mf51.p3cdn1.secureserver.net/wp-content/uploads/2022/09/gallery1.jpg?time=1672616700')]")
//	private WebElement slide1;
	
	@FindBy(xpath="//img[@src='https://barzibrand.com/wp-content/uploads/2022/09/River_Rub-300x300.jpg']")
	private WebElement bbq;
	
	@FindBy(xpath="//img[contains(@src,'https://79mf51.p3cdn1.secureserver.net/wp-content/uploads/2022/09/R')]")
	private WebElement bbq_img;
	
	// constructor - Initialize POM value
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public  boolean shopNow() {
		boolean result = false;
		try {
			shop_now.click();
			Utilities.log().info("Clicked on ShopNow");
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//broken link
	public boolean brokenLinks(){
		boolean result = false;
		try {
			for(WebElement link : broken_link) {
				
				String href = link.getAttribute("href");
				
				if(href == null || href.isEmpty()) {
					System.out.println("This link is broken " + link.getText());
					System.out.println(link.getAttribute("class"));
				}
				result = true;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	public SpiceShopPage sSPAge() {
		boolean result = false;
		try { 
	
//				Utilities.explicitWait(driver, fbLogo);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return new SpiceShopPage(driver);
	}
//	logo
	public boolean loGo() {
		boolean result = false;
		try { 
				
				Utilities.elementDisplay(logo); 
				logo.click();
				Utilities.log().info("Clicked on logo");
				Utilities.explicitWait(driver, fbLogo);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	facebook
	public boolean facebookLogo() {
		boolean result = false;
		try {
//			Utilities.explicitWait(driver, fbLogo);
				Utilities.elementDisplay(fbLogo); 
				fbLogo.click();
				Utilities.log().info("Clicked on fbLogo");
				driver.navigate().back();
				Utilities.explicitWait(driver, twtLogo);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	twitter
	public boolean twitterLogo() {
		boolean result = false;
		try {
				Utilities.elementDisplay(twtLogo); 
				twtLogo.click();
				Utilities.log().info("Clicked on twitterLogo");
//				System.out.println("clicked on twitter");
				String currentTab = driver.getWindowHandle();
				
				Set<String> tab = driver.getWindowHandles();
				for(String x : tab) {
					driver.switchTo().window(x);
					String title = driver.getCurrentUrl();
//					System.out.println(title);
					
					if(title.contains("https://twitter.com/barzibrand")) {
						driver.close();
					}
				}
				driver.switchTo().window(currentTab);
				Utilities.explicitWait(driver, uTubeLogo);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	youtube
	public boolean youtubeLogo() {
		boolean result = false;
		try {
				Utilities.elementDisplay(uTubeLogo); 
				uTubeLogo.click();
				Utilities.log().info("Clicked on uTubeLogo");
				Thread.sleep(3000);
//				driver.navigate().back();
				Utilities.explicitWait(driver, homeLink);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

//	homePageLink
	public boolean homePageLink() {
		boolean result = false;
		try {
				Utilities.elementDisplay(homeLink); 
				homeLink.click();
				Utilities.log().info("Clicked on homeLink");
				String homeTitle = driver.getTitle();
//				if(logoTitle.equals(homeTitle)) {
//					
//					System.out.println(logoTitle);
//					System.out.println(homeTitle);
//					System.out.println("logo is verified");
//				}
				driver.navigate().back();
				Utilities.explicitWait(driver, spiceShopLink);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	spiceShopLink
	public boolean spiceShopLink() {
		boolean result = false;
		try {
				Utilities.elementDisplay(spiceShopLink); 
				spiceShopLink.click();
				Utilities.log().info("Clicked on spiceShopLink");
				driver.navigate().back();
				Utilities.explicitWait(driver, historyLink);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	historyLink
	public boolean historyLink() {
		boolean result = false;
		try {
				Utilities.elementDisplay(historyLink); 
				historyLink.click();
				Utilities.log().info("Clicked on historyLink");
				driver.navigate().back();
				Utilities.explicitWait(driver, contactLink);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	contactLink
	public boolean contactLink() {
		boolean result = false;
		try {
				Utilities.elementDisplay(contactLink); 
				contactLink.click();
				Utilities.log().info("Clicked on contactLink");
				driver.navigate().back();
				Utilities.explicitWait(driver, searchField);
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	searchField
	public boolean searchField() {
		boolean result = false;
		try {
//			System.out.println("Test - search field");
//				Utilities.elementDisplay(searchField); 
				searchField.click();
				Utilities.log().info("Clicked on searchField");
				searchField.sendKeys("spice");
				searchIconButton.click();
				driver.navigate().back();
				result = true;	
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	// Shop Now
	public boolean shop_Now() {
		boolean result = false;
		try {
			shop_now.click();
			Utilities.log().info("Clicked on ShopNowButton");
			driver.navigate().back();
			
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	public boolean shopNowScroll() {
		boolean result = false;
		try {
			Utilities.scrollElement(driver, shop_now);
//			Thread.sleep(5000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean aboutScroll() {
		boolean result = false;
		try {
			Utilities.scrollElement(driver, _about);
			Utilities.log().info("Scroll to about");
//			Thread.sleep(5000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean aboutImageScroll() {
		boolean result = false;
		try {
			Utilities.scrollElement(driver, about_img);
			Utilities.log().info("Scroll to Image");
//			Thread.sleep(5000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	
	// scroll
	public boolean LearnMore(){
		boolean result = false;
		try {
			Utilities.explicitWait(driver, learnmore_button);
			learnmore_button.click();
			Utilities.log().info("Clicked on LearnMore");
			driver.navigate().back();
//			Thread.sleep(5000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean premiumOnlineScroll() {
		boolean result = false;
		try {
			Utilities.scrollElement(driver, learnmore_button);
			Utilities.log().info("Scroll to premiumOnline");
//			Thread.sleep(5000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
//	public boolean spiceShopTile() {
//		boolean result = false;
//		try {
//			Utilities.explicitWait(driver, spice_shop_tile);
//			spice_shop_tile.click();
//	        Utilities.log().info("Clicked on spiceShopTile");
//			driver.navigate().back();
//			result = true;
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		return result;
//	}
//	
//	public boolean historyTile() {
//		boolean result = false;
//		try {
//			Utilities.explicitWait(driver, history_tiles);
//			history_tiles.click();
//			driver.navigate().back();
//	Utilities.log().info("Clicked on historyTile");
//			result = true;
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		return result;
//	}
//	
//	public boolean termsandconditionTile() {
//		boolean result = false;
//		try {
//			Utilities.explicitWait(driver, term_condition_tiles);
//			term_condition_tiles.click();
//	Utilities.log().info("Clicked on term&ConditionTile");
//			driver.navigate().back();
//			result = true;
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		return result;
//	}
	
	public boolean termsandconditionScroll() {
		boolean result = false;
		try {
			Utilities.scrollElement(driver, term_condition_tiles);
			Utilities.log().info("Scroll to term and condition");
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	
//	public boolean differentProduct() {
//		boolean result = false;
//		try {
//			Utilities.explicitWait(driver, Breadings_and_Biscuits);
//			Breadings_and_Biscuits.click();
//			Utilities.explicitWait(driver, tea);
//			tea.click();
//			System.out.println("tea");
//			Utilities.explicitWait(driver, spices);
//			spices.click();
//			Utilities.explicitWait(driver, Breadings_and_Biscuits);
//			Breadings_and_Biscuits.click();
//			Utilities.explicitWait(driver, sauces);
//			sauces.click();
//			Utilities.explicitWait(driver, barzi_original);
//			barzi_original.click();
//			System.out.println("barzi_original");
//			Utilities.explicitWait(driver, prod_shopNow);
//			prod_shopNow.click();
//			driver.navigate().back();
//			Utilities.scrollElement(driver, bbq);
//			Utilities.scrollElement(driver, bbq_img);
//			Utilities.scrollElement(driver, prod_shopNow);		
//			result = true;
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		return result;
//	}


			
	
	
//	public boolean prodSlide() {
//		boolean result = false;
//		try {
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		return result;
//	}
	
	
	
}
