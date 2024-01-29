package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
	
	WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	
	WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	
	act.dragAndDrop(drag, drop).perform();
	
    WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	
	WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	
    //Actions act=new Actions(driver);
	
	act.dragAndDrop(drag1, drop1).perform();
	Thread.sleep(2000);
	
    WebElement drag2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	
	WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	
	act.dragAndDrop(drag2, drop2).perform();
	Thread.sleep(2000);
	
    WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	
	WebElement drop3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	
	act.dragAndDrop(drag3, drop3).perform();
	Thread.sleep(2000);
	
	
	}

}
