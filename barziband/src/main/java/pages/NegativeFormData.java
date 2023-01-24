package pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BrowserHandle;
import utility.Utilities;

public class NegativeFormData extends BrowserHandle {
//	public class NegativeFormData
//	public WebDriver driver;
	public static WebElement firstName;
	public static WebElement lastName;
	public static WebElement email;
	public static WebElement phoneNumber;
	public static WebElement message;
	
	
	@FindBy(xpath="//input[@name='your-phone']")
	public WebElement phone;
	
	@FindBy(xpath="//ul[@id='menu-main-menu']//a[text()='Contact']")
	public WebElement contact;
	
	@FindBy(xpath="//p[text()='Call us anytime – ']")
	public WebElement scrollPhone;
	
	@FindBy(xpath="//input[@value='SUBMIT']")
	public WebElement submit;
	
	@FindBy(xpath="//img[@src='https://barzibrand.com/wp-content/uploads/2022/09/contact.jpg']")
	public WebElement img;
	
	public NegativeFormData(){
		//this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
//	Methods
	public boolean contactPage() {
		boolean result = false;
		try {
//			Utilities.explicitWait(driver, contact);
//			System.out.println("before explicitWait");
			Utilities.explicitWait(driver,contact);
//			System.out.println("before elementDisplay");
			Utilities.elementDisplay(contact);
//			System.out.println("before clicked");
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
			System.out.println("scroll to phone");
			Thread.sleep(5000);
			Utilities.scrollElement(driver, phone);
			System.out.println("scroll to phonefield");
			Thread.sleep(3000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	
	public boolean submitBtn(){
		boolean result = false;
		try {
//			Utilities.scrollElement(driver, phone);
//			System.out.println("before submit click");
			submit.click();
//			System.out.println("clicked");
			Thread.sleep(3000);
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	public boolean getErrorMsg() {
		boolean result = false;
		try {
			
			
			System.out.println(message.getText());
			Utilities.scrollElement(driver, phone);
			System.out.println(phoneNumber.getText());
			System.out.println(firstName.getText());
			System.out.println(lastName.getText());
			System.out.println(email.getText());
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
