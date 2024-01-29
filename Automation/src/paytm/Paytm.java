package paytm;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Paytm {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://paytm.com/");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	//JavascriptExecutor js=(JavascriptExecutor) driver;
    //js.executeScript("arguments[0].scrollIntoView(false)",scrollTill);
	
    //input into from text field
	driver.findElement(By.id("srcCode")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.id("text-box")).sendKeys("PNQ");
	driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	
	//entering value into to textfield
	driver.findElement(By.id("destCode")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.id("text-box")).sendKeys("DEL");
	driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
	
	//click on departure date
	driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
	driver.findElement(By.xpath("//div[text()='24'][1]")).click();
	
	driver.findElement(By.id("travellerClass")).click();
	
	for(int i=0;i<2;i++)
	{
		driver.findElement(By.xpath("//img[@alt='add-icon'][1]")).click();
	}
	
	driver.findElement(By.id("flightSearch")).click();
	
	List<WebElement> allflights = driver.findElements(By.xpath("//div[@class=M9kpV"));
	
	for(WebElement flight:allflights) {
		System.out.println(flight.getText());
	}
	
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./SS/img.png");
	Files.copy(src, dest);
	
	}

}
