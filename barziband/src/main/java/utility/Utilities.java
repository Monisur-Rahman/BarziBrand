package utility;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utilities {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
//	public static Logger log = LogManager.getLogger();
	
	//scroll - method
	public static void scrollElement(WebDriver driver , WebElement element) {
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
//	Display method
	public static boolean elementDisplay(WebElement element) {
		boolean display = false;
		
			if(element.isDisplayed()) {
				display = true;
			}
//			else {
//				display = false;
//			}
			
		return display;
	}
	
//	wait method
	public static void explicitWait(WebDriver driver, WebElement element) {
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static Logger log()
	{
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
	public static String getPropertiesData (String key) {
		String value = null;
		try {
			String path = "./src/main/resources/data.properties";
			FileInputStream file = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(file);
			value = prop.get(key).toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
	}
	
}
	

