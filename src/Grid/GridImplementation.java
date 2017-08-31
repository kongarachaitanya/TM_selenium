package Grid;	

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridImplementation
{
	public static void main(String[] args) throws MalformedURLException 
	{		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.127:5555"),capability);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		System.out.println( ":  Entered 'mercury' in UserName Field");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("mercury");
        System.out.println( ":  Entered Password");
        driver.findElement(By.name("login")).click();
        System.out.println(":  Clicked on Login Button");
        driver.quit();
	}

}
