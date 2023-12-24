package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	
	WebDriver driver;

	@Test
	public void mOne() {
		
		System.out.println("mOne Executed");
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		Assert.assertEquals("PracticeAutomationHere", driver.findElement(By.id("pah")).getText());
	
	}
		@AfterMethod
		public void closure() {
			
			driver.close();
			
		}
}
