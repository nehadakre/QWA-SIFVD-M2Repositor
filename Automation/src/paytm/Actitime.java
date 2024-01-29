package paytm;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	
	public static void main(String[] args) {
		Random r=new Random();
		int no=r.nextInt(1000);
		
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://laptop-reoob373/login.do");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.className("  ext-chrome")).click();
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pandeyakansha");
	driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Neha@2205");
	driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Neha@2205");
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Akansha");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("pandey");
	driver.findElement(By.xpath("//input[contains(@value,'   Create User   ')]")).click();
	
	driver.findElement(By.xpath("//a[text()='Dakre, Ankita (Manager)']")).click();
	driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
	
	
	
	}

}
