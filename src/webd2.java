import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webd2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String x = driver.getTitle();
		System.out.println(x);
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();

	}

}
