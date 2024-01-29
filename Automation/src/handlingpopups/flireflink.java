package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flireflink {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://app.fireflink.com/signin");
	Thread.sleep(4000);
	driver.findElement(By.name("emailId")).sendKeys("dakreneha2205@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Neha@2205");
	driver.findElement(By.className("primary-btn")).click();
	
	
		
		
	}

}
