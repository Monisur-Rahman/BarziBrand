package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class ProductPage3 {
	public WebDriver driver; 
	
	@FindBy(xpath="//h2[contains(text(),'Cajun Kickin’')]")
	private WebElement Cajun_Kickin;
	
	@FindBy(xpath="//div[contains(@class,'astra-shop-thumbnail-wrap')]//a[contains(@href,'https://barzibrand.com/shop/canadian-steak-seasoning/')]")
	private WebElement canadian_steak;
	
	
//	constructor 
public ProductPage3(WebDriver driver) {
	
	    this.driver = driver;
	PageFactory.initElements(this.driver, this); 
	}

	//	methods
	public boolean scrollPage3() {
		boolean result = false;
		try {
		Utilities.scrollElement(driver, Cajun_Kickin);
		canadian_steak.click();
		result = true;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		return result;
		}
	}
