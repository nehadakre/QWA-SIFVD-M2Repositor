package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	
	WebElement dropdown = driver.findElement(By.id("select3"));
	
	//create object of select class
	Select s=new Select(dropdown);
	
	//use select by index
	//s.selectByIndex(2);
	Thread.sleep(2000);
	
	//select by value
	//s.selectByValue("Poland");
	
	//select by visible text
	//s.selectByVisibleText("India");
	
	//use is multiple method
	boolean value = s.isMultiple();
	System.out.println(value);
	
	List<WebElement> alloption = s.getOptions();
	
	for(WebElement option:alloption)
	{
		System.out.println(option.getText());
	}
	
	
	
	
	
	
	
	
	
	
	}

}
