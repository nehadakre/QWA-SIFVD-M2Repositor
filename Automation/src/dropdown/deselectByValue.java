package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByValue {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/?scenario=1");
			driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
			driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
			 WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
			
			//create the object of select class
		    Select s=new Select(dropdown);
		    
		    s.selectByValue("India");
		    Thread.sleep(2000);
		    
		    s.deselectByValue("India");
		    
		    
		    
		
		
		}
		

	}


