package WebDriverEX;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIT_HRM {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement Myinfo = driver.findElement(By.id("menu_pim_viewMyDetails"));
				
		Actions act_obj = new Actions(driver);
		act_obj.moveToElement(Myinfo).build().perform();		
		
		Myinfo.click();
		
		driver.findElement(By.id("btnAddAttachment")).click();
		driver.findElement(By.id("ufile")).click();
		
		//calling autoit code to select file
		Runtime.getRuntime().exec("C:\\Users\\chaitanya\\Desktop\\uft training\\selenium\\fileupload.exe");
		
		Thread.sleep(5000);
		
	driver.findElement(By.id("txtAttDesc")).sendKeys("new");;		
	Thread.sleep(5000);
		 driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[3]/div[2]/form/fieldset/p/input[1]")).click();;
		
		

	}

}
