package WebDriverEX;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class CloseAndQuit 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.localjobserver.com/");
			driver.findElement(By.linkText("FAQ")).click();
			driver.findElement(By.linkText("FeedBack")).click();
			Thread.sleep(3000);
			
			String Homepage = driver.getWindowHandle();
			Set<String> allhandles = driver.getWindowHandles();
			for(String handle1: allhandles)
			{				
				driver.switchTo().window(handle1);
				String pageURL = driver.getCurrentUrl();				
				
				if (pageURL.contains("FrequentlyAskedQuestions"))
				{
					System.out.println("Switched to FAQ page");
					driver.close();//Close FAQ page
				}				
			}
			driver.switchTo().window(Homepage);
					
			//driver.quit();
		}

	}



