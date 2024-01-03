package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		
	//Random r=new Random();
	 //int no = r.nextInt(10000);
	
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Thread.sleep(2000);
	driver.get("http://laptop-reoob373/login.do");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='button' and (@value='Create New Customer')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Neha Dakre");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("SBI BANK");
	driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
	
	Thread.sleep(2000);        
	driver.close();
	}

}
