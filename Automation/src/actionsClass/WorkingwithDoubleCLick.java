package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithDoubleCLick {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
	//action class
	Actions act=new Actions(driver);
	//double click
	act.doubleClick(driver.findElement(By.id("btn20"))).perform();
	Thread.sleep(2000); 
	driver.quit();
	
	
	
	
	}

}
