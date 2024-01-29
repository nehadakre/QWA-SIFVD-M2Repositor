package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/alert/confirm?sublist=1");
		driver.findElement(By.id("buttonAlert5")).click();
		
		
		
		
		//handling confirmatio popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		//click on on
		alt.accept();
		//click on cancel
		//\\alt.dismiss();
		
	}

}
