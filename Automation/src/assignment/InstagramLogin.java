package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	String title = driver.getTitle();
	System.out.println(title);
	//to identify usename text field
	driver.findElement(By.name("username")).sendKeys("nhadakre2205");
	driver.findElement(By.name("password")).sendKeys("nehadakre");
	driver.findElement(By.className("_acap")).click();
	//driver.quit();
	}

}
