import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String x = driver.getTitle();
		System.out.println(x);
		driver.findElement(By.id("u_0_m")).sendKeys("Kedar");
		driver.findElement(By.name("websumit")).click();
		
		// xpath
		

	}

}
