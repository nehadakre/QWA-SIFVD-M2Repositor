package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAmazon {
	public static void main(String[] args) {
		  
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	String title = driver.getTitle();
	System.out.println("Title of cueent page is" +title);
	String urlOfCurrentWebPage = driver.getCurrentUrl();
	System.out.println("url"+urlOfCurrentWebPage);
	String pageSource = driver.getPageSource();
	System.out.println("sourcecode"+pageSource);
	driver.quit();
	}

}
