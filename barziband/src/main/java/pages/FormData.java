package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilities;

public class FormData {
	public  WebDriver driver;
	
	@FindBy(xpath="//ul[@id='menu-main-menu']//a[text()='Contact']")
	public WebElement contact;
	
	@FindBy(xpath="//p[text()='Call us anytime – ']")
	public WebElement scrollPhone;
	
	@FindBy(xpath="//input[@name='first-name']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@name='last-name']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@name='your-email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='your-phone']")
	public WebElement phonenumber;
	
	@FindBy(xpath="//textarea[@name='your-message']")
	public WebElement message;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//p[text()='Thank you for your message. It has been sent.']")
	public WebElement sbtmsg;
	
	
	
	
//	constructor 
	public FormData(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
//	Methods
	public boolean contactPage() {
		boolean result = false;
		try {
			Utilities.explicitWait(driver, contact);
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
	
	public boolean firstName() {
		boolean result = false;
		try {
			firstname.sendKeys(Utilities.getPropertiesData("firstname").toUpperCase());
			result = true;
		}catch(Exception e){
			System.out.println(e);
		}
		return result;
	}
	
	public boolean lastName() {
		boolean result = false;
		try {
			lastname.sendKeys(Utilities.getPropertiesData("lastname").toUpperCase());
			result = true;
		}catch(Exception e){
			System.out.println(e);
		}
		return result;
	}
	
	public boolean email() {
		boolean result = false;
		try {
			email.sendKeys(Utilities.getPropertiesData("email"));
			result = true;
		}catch(Exception e){
			System.out.println(e);
		}
		return result;
	}
	
	public boolean phoneNumber() {
		boolean result = false;
		try {
			phonenumber.sendKeys(Utilities.getPropertiesData("phonenumber"));
			result = true;
		}catch(Exception e){
			System.out.println(e);
		}
		return result;
	}
	
	public boolean message() {
		boolean result = false;
		try {
			message.sendKeys(Utilities.getPropertiesData("message"));
			result = true;
		}catch(Exception e){
			System.out.println(e);
		}
		return result;
	}
	
	public boolean submitBtn() {
		boolean result = false;
		try {
			submit.click();
			Thread.sleep(4000);
			System.out.println(sbtmsg.getText());
			result= true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
}
