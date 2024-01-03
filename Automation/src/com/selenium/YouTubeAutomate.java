package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomate {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("search"));
	driver.switchTo().activeElement().sendKeys("Anuv jain");
	driver.findElement(By.linkText("http://www.w3.org/2000/svg")).click();
		
	}

}
