package SN101.CH1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void verify() throws InterruptedException{
		driver.get("http://www.seleniumhq.org");
		Thread.sleep(4000);
		String expectedTitle = "www.seleniumhq.org";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle,"wrong title");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
  
}
