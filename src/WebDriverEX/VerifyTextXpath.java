package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTextXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
				
		driver.get("http://sys1:8080/multi_cloud1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click Login without entering user id, password
		driver.findElement(By.xpath(".//*[@id='users']/table/tbody/tr[5]/td[2]/input[1]")).click();
		
		Thread.sleep(5000);	
		
		
		try{
			driver.findElement(By.xpath("//*[contains(text(), 'Login')]"));
			System.out.println("Expected message exist");			
		}
		
		catch(Exception e)
		{
			System.out.println("Expected message not displayed");
		}
		
	

	}

}
