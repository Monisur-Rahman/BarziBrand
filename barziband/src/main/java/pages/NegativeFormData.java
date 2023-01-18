package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BrowserHandle;
import utility.Utilities;

public class NegativeFormData {
	public WebDriver driver=null;	
	
	@FindBy(xpath="//ul[@id='menu-main-menu']//a[text()='Contact']")
	public WebElement contact;
	
	@FindBy(xpath="//p[text()='Call us anytime – ']")
	public WebElement scrollPhone;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
	
	
	public NegativeFormData(){
		//this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
	
//	Methods
	public boolean contactPage() {
		boolean result = false;
		try {
//			Utilities.explicitWait(driver, contact);
			Utilities.explicitWait(driver,contact);
		
			Utilities.elementDisplay(contact);
			contact.click();
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean scrollToPhone() {
		boolean result = false;
		try {
			Utilities.explicitWait(driver, scrollPhone);
			Utilities.scrollElement(driver, scrollPhone);
			Thread.sleep(5000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	
	public boolean submitBtn(){
		boolean result = false;
		try {
			submit.click();
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
