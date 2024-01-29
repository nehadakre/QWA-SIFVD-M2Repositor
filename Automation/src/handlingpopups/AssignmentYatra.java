package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentYatra {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.yatra.com/hotels");
		 driver.findElement(By.id("booking_engine_hotels")).click();
		 Thread.sleep(2000);
		 
		 
		
		
	}

}
