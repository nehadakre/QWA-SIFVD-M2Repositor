package handlingpopups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class YatraHotelBooking {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/hotels");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
	    WebDriver	driver1=new ChromeDriver(opt);
	    Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//label[text()='Traveller and Hotel']")).click();
		driver.findElement(By.xpath("//input[@name='flight_origin_date'][1]")).click();
		driver.findElement(By.id("22/01/2024")).click();
		driver.findElement(By.xpath("//input[@name='BE_hotel_checkout_date'][1]")).click();
		driver.findElement(By.id("24/01/2024")).click();
		driver.findElement(By.id("BE_hotel_htsearch_btn")).click();
		
		WebElement room = driver.findElement(By.xpath("//span[@class='new-blue-button medium choose-room-button nowrap ng-binding'][1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(room).perform();
		
		File src = room.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./SS/room.png");
		
		Files.copy(src, dest);
		
		
		
	  
		
		
		
		
		
		
		
		
		
		
		
	}

}
