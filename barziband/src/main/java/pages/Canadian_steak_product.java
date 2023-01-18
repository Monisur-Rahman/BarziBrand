package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class Canadian_steak_product {
	WebDriver driver;
	
//	@FindBy(xpath="//h5[contains(text(),'Packaging Size:')]")
	@FindBy(xpath="//div//span[text()='Category:']")
	private WebElement Packaging_size;
	
	@FindBy(xpath="//div[contains(@class,'wl-quantity-wrap')]//i[contains(@class,'fas fa-plus')]")
	private WebElement multiple_same_product;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//div[@class='elementor-widget-container']//i[@class='eicon']")
	private WebElement add2cart_icon;
	
	
//	constructor
	public Canadian_steak_product(WebDriver driver) {	
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);		
	}
	
//	method
	public boolean scrollPackSize() {
		boolean result = false;
		try {
		Utilities.scrollElement(driver, Packaging_size);
	
		multiple_same_product.click();
		
		multiple_same_product.click();
	
		addToCart.click();
	
		add2cart_icon.click();
		result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
		
	}
}
