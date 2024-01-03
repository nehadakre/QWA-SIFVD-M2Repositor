package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.cssSelector("[name='FirstName']")).sendKeys("Neha");
	driver.findElement(By.cssSelector("[name='LastName']")).sendKeys("Dakre");
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("ankitadakre1811@gmail.com");
	driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Neha@2205");
	driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Neha@2205");
	driver.findElement(By.className("register-next-step-button")).click();
	driver.findElement(By.linkText("Log out")).click();
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.cssSelector("input[class='email']")).sendKeys("ankitadakre1811@gmail.com");
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys("Neha@2205");
	driver.findElement(By.linkText("Forgot password?")).click();
	}

}
