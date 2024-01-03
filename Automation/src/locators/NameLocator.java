package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-reoob373/login.do");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	}

}
