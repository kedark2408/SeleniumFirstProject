package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.chrome.driver","src/chromedriver");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  String x = driver.getTitle();
	  Assert.assertEquals(x, "Facebook");
	  
  }
  
  @Test
  public void verifyUrl() {
	  System.setProperty("webdriver.chrome.driver","src/chromedriver");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  String y = driver.getCurrentUrl();
	  Assert.assertEquals(y, "https://www.facebook.com");
	  
  }
}
