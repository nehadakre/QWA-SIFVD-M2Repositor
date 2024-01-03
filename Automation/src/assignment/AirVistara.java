package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara {
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
	driver.findElement(By.xpath("//input[@placeholder='Select Departure City'and (@name='flightSearchFrom')]")).sendKeys("pune",Keys.ENTER);
	driver.findElement(By.xpath("//input[@placeholder='Select Arrival City' and (@name='flightSearchTo')]")).sendKeys("Nagpur",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
	driver.findElement(By.xpath("//div[text()=' Dec ']")).click();
	driver.findElement(By.xpath("//a[text()='30']")).click();
	driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
	
	}

}
