package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximazeBrowser {
	
	
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		//to open the web application
		driver.get("https://www.flipkart.com/");
		
		//to fetch the title
		
		String actual_title = driver.getTitle();
		
		//System.out.println("The title of current page is"+title);
		
		if(actual_title.equals("Online Shopping Site Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
		
		
				
	}

}
