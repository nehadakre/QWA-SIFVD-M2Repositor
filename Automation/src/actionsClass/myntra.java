package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.myntra.com/");
	
	WebElement Woman = driver.findElement(By.xpath("//a[text()='Women'][1]"));
	
	//create in action class
    Actions act = new Actions(driver);
	
    Thread.sleep(2000);
	act.moveToElement(Woman).perform();
	
	driver.quit();
	
	
	
	}
	

}
