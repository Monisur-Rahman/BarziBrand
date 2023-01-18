package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceShopPage {
	
	public WebDriver driver = null;
	
	@FindBy(xpath="//a[text()='Spice Shop']")
	private WebElement spiceShop;
	
	
	
	
	
//	Constructor - initialization
	public SpiceShopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
//	methods
	public boolean clickSpiceShop() {
		boolean result = false;
		try {
			spiceShop.click();
			System.out.println("clicked");
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
		
	}
}
