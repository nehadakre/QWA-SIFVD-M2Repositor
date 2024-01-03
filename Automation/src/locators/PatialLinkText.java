package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatialLinkText {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//by using partial Link Text
	driver.findElement(By.partialLinkText("Reg"));
	driver.quit();
	}																									

}
