package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _action 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://barzibrand.com/");
		
		WebElement history = driver.findElement(By.xpath("//li//a[text()='History']"));
		Actions act = new Actions(driver);
		act.clickAndHold(history).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
