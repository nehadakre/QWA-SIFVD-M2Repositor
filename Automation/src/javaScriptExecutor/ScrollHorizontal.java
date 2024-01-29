package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeAsyncScript("window.scrollBy(1000,0)");
		
		Thread.sleep(2000);
		
		js.executeAsyncScript("window.scrollBy(1000,0)");
	}

}
