package com.ts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Netflix_TS {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
RemoteWebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(4000);
		
		driver.findElement(By.id("signIn")).click();
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("Admi12345");
		
		
		driver.findElement(By.id("id_password")).sendKeys("1234@anvdrg");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./SS/netflix1.png");
		
		Files.copy(src, dest);
		
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		Thread.sleep(2000);
		
       File src1 = driver.getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("./SS/signUp.png");
		
		Files.copy(src1, dest1);
		
		

	
	
	}

}
