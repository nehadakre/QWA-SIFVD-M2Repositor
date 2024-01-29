package paytm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppersStrack {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://shoppersstack.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys("nehadakre2205@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Neha@2205");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(2000);
	WebElement men = driver.findElement(By.id("men"));
	
	Actions act=new Actions(driver);
	act.moveToElement(men).perform();
	
	
	}

}
