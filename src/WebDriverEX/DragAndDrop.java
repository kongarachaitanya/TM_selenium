package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.jqueryui.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
 driver.findElement(By.partialLinkText("Droppable")).click();
 
 Thread.sleep(10000);
 
 WebElement myframe = driver.findElement(By.className("demo-frame"));
 driver.switchTo().frame(myframe);

// WebDriverWait wait = new WebDriverWait(driver, 20);
 //wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
 
 WebElement source = driver.findElement(By.id("draggable"));
 WebElement target = driver.findElement(By.id("droppable"));

Actions obj = new Actions(driver);
obj.dragAndDrop(source, target).build().perform();
 

/*
Actions obj = new Actions(driver);
  obj.clickAndHold(source)
  .moveToElement(target)
  .build()
  .perform();
*/



/*
//with id
driver.findElement(By.cssSelector("input#email")).sendKeys("988678567");
//with Name
driver.findElement(By.cssSelector("input[name=email]")).sendKeys("988678567");

//Verify text
driver.findElement(By.cssSelector("div:contains('saved successfully')"));
//driver.findElement(By.cssSelector("div:contains('Sign up')"));
*/
	}
}
