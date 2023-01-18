package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class Addtocart {
	WebDriver driver;
	
	@FindBy(xpath="//h2[contains(text(),'Cart totals')]")
	private WebElement Cart_totals;
	
	@FindBy(xpath="//div//div[contains(@class,'wc-proceed-to-checkout')]")
	private WebElement checkout;
	
	
	
//	constructor
public Addtocart(WebDriver driver) {	
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);		
	}

//methods
public boolean goToAdd2Cart() {
	boolean result = false;
	try {
	Utilities.scrollElement(driver, Cart_totals);
	checkout.click();
	result = true;
	}catch(Exception e) {
		System.out.println(e);
	}
	return result;
}
}