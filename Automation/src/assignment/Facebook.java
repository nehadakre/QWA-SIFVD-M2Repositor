package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Neha");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sharma");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8329791357");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Neha@2205");
	
	
	
	
	
	}

}
