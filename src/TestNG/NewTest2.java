package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","src/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
  }
  
  @Test
  public void verifyTitle() {
	  String x = driver.getTitle();
	  System.out.println(x);
	  Assert.assertEquals(x, "Facebook – log in or sign up");
  }
  
  @Test
  public void verifyUrl() {
	  String y = driver.getCurrentUrl();
	  System.out.println(y);
	  Assert.assertEquals(y, "https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
