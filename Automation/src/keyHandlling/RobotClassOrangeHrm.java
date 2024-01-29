package keyHandlling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassOrangeHrm {
	
	public static void main(String[] args) throws AWTException {
		
		 WebDriver	driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	       
	       
	       Robot r=new Robot();
	       
	       //pressing action
	       r.keyPress(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_A);
	       
	       r.keyRelease(KeyEvent.VK_CONTROL);
	       r.keyRelease(KeyEvent.VK_A);
	       
	       r.keyPress(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_C);
	       
	       r.keyRelease(KeyEvent.VK_CONTROL);
	       r.keyRelease(KeyEvent.VK_C);
	       
	       r.keyPress(KeyEvent.VK_TAB);
	       
	       r.keyPress(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_V);
	       
	       r.keyRelease(KeyEvent.VK_CONTROL);
	       r.keyRelease(KeyEvent.VK_V);
	      
	       
	       
	       
	       
	}

}
