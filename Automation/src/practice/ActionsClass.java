package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) {
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		WebElement fasion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act=new Actions(driver);
		
		//move to element method
		act.moveToElement(fasion).perform();
		
		//to perform right click action
		act.contextClick(fasion).perform();
		
	
		
	
		
	}

}
