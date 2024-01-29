package fileUpload;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNaukariDotCom {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Runtime.getRuntime().exec("./AutoIt/NehaD.exe");
	
	}

}
