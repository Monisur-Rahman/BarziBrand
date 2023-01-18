package pages;

//import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class ProductPage1 {
	WebDriver driver;
	
	@FindBy(xpath="//h2[contains(text(),'10X Sauce Spicy')]")
	private WebElement sauce_spicy;
	
	@FindBy(xpath="//h2[contains(text(),'All-Purpose Gourme')]")
	private WebElement all_purpose;
	
	@FindBy(xpath="//h2[contains(text(),'Andouille Sausage Seasoning')]")
	private WebElement sausage_seasoning;
	
	@FindBy(xpath="//h2[contains(text(),'Barzi Chili Fix')]")
	private WebElement barzi_chili;
	
	@FindBy(xpath="//nav//a[text()='3']")
	private WebElement page3_button;
	
	
	
	
	
	
//	constructor - Initialize element in POM
	public ProductPage1(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
	
	
	// Methods
	public boolean scrollPage1() {
		boolean result = false;
		try {
		Utilities.scrollElement(driver, sauce_spicy);
		Utilities.scrollElement(driver, all_purpose);
		Utilities.scrollElement(driver, sausage_seasoning);
		Utilities.scrollElement(driver, barzi_chili);
		page3_button.click();
		result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
}
