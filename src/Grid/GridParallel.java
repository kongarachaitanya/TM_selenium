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
import org.testng.annotations.Test;

public class GridParallel 
{
  @Test
  public void m1() throws MalformedURLException 
  {
	  	DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.110:8585/wd/hub"),capability);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		System.out.println( "firefox:  Entered 'mercury' in UserName Field");
      driver.findElement(By.name("password")).clear();
      driver.findElement(By.name("password")).sendKeys("mercury");
      System.out.println( "firefox:  Entered Password");
      driver.findElement(By.name("login")).click();
      System.out.println("firefox:  Clicked on Login Button");
      driver.quit();
      System.out.println("firefox:  Quit Browser");
  }
  @Test
  public void m2() throws MalformedURLException 
  {
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName(BrowserType.CHROME);
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.110:6565/wd/hub"),capability);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		System.out.println( "CHROME:  Entered 'mercury' in UserName Field");
      driver.findElement(By.name("password")).clear();
      driver.findElement(By.name("password")).sendKeys("mercury");
      System.out.println( "CHROME:  Entered Password");
      driver.findElement(By.name("login")).click();
      System.out.println("CHROME:  Clicked on Login Button");
      driver.quit();
      System.out.println("CHROME:  Quit Browser");
  }
  @Test
  public void m3() throws MalformedURLException 
  {
		
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName(BrowserType.IE);
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.110:4545/wd/hub"),capability);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		System.out.println( "IE:  Entered 'mercury' in UserName Field");
      driver.findElement(By.name("password")).clear();
      driver.findElement(By.name("password")).sendKeys("mercury");
      System.out.println( "IE:  Entered Password");
      driver.findElement(By.name("login")).click();
      System.out.println("IE:  Clicked on Login Button");
      driver.quit();
      System.out.println("IE:  Quit Browser");
  }
}


