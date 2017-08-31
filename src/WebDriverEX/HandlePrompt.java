package WebDriverEX;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePrompt {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/tm11/Desktop/confirm.html");
		
		// click the button
		driver.findElement(By.xpath("html/body/fieldset/button")).click();		
			
		Alert AlertMessage = driver.switchTo().alert();
		System.out.println(AlertMessage.getText());

		Thread.sleep(3000);
		//Click OK
		AlertMessage.accept();
		
		// click on cancel button
		//AlertMessage.dismiss();

	}

}
