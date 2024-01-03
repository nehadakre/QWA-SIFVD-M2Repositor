package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspiders {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/?scenario=1");
	driver.findElement(By.linkText("Button")).click();
	driver.findElement(By.linkText("Yes")).click();
	driver.findElement(By.linkText("Yes")).click();
	driver.findElement(By.linkText("Yes")).click();
	driver.findElement(By.linkText("Yes")).click();
	driver.findElement(By.linkText("No")).click();
	}

}
