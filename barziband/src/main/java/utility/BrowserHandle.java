package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserHandle {

	public static WebDriver driver;
	
	@BeforeTest
	public void startReport() throws IOException {
		ExtentReport.setExtent();
	}
	
	@AfterTest
	public void endReport() {
		ExtentReport.endReport();
	}
	
	
	@BeforeTest
	@Parameters("browserName")
	public void openBrowser(String browserName) {
		 if(browserName.equals("chrome")) {
//			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(); 
			 System.out.println("Testing on Chrome");
		 }
//		 driver.get("https://barzibrand.com/");
		 driver.get(Utilities.getPropertiesData("url"));
		 driver.manage().window().maximize();
		 
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
