package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
	public static void main(String[] args) throws InterruptedException {
		 
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//alertpopup
	//driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	//driver.findElement(By.id("buttonAlert2")).click();
	//Alert alt=driver.switchTo().alert();
	//Thread.sleep(2000);
	//alt.accept();
	
	//confirmation popup
	//driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
	//driver.findElement(By.id("buttonAlert5")).click();
	//Alert alt=driver.switchTo().alert();
	//alt.accept();
	
	//prompt popup
	driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
	driver.findElement(By.id("buttonAlert1")).click();
	Alert alt=driver.switchTo().alert();
	alt.sendKeys("Neha");
	System.out.println(alt.getText());
	alt.accept();
	
	
	
	
	
	}

}
