package mock;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		Thread.sleep(2000);
		
		WebDriver	driver=new ChromeDriver(opt);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.yatra.com/");
	
	
	
	
	
	
 }

}
