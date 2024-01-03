package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
	//to launch the browser	
	WebDriver	driver=new ChromeDriver();
	//to maximize the browser
	driver.manage().window().maximize();
	//to launch web application
	driver.get("https://www.zomato.com/india");
	//to navigate 
	driver.navigate().to("https://www.swiggy.com/");
	//to go back
	Thread.sleep(2000);
	driver.navigate().back();
	//to go forward
	driver.navigate().forward();
	//to refresh
	driver.navigate().refresh();
	
	driver.quit();
	
	}

}
