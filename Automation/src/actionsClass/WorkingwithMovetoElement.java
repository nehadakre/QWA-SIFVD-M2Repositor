package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithMovetoElement {
	
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	
	WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
	
	//to create action class
	Actions act = new Actions(driver);
	
	act.moveToElement(fashion).perform();
	
	driver.quit();
	
	
	}

}
