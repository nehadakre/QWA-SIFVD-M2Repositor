package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithClickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		
		//identify circle
		WebElement circle = driver.findElement(By.id("circle"));
		
		//creat object of actions class
		Actions act=new Actions(driver);
		
		//use click and hold
		act.clickAndHold(circle).perform();
		Thread.sleep(2000);
		
		//release method
		act.release().perform();
		
		
		
		
		
		
	}

}
