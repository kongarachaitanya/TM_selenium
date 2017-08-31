package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetListItems {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement cname = driver.findElement(By.id("day"));
		List<WebElement> items = cname.findElements(By.tagName("option"));
		
		for(WebElement itm : items)
		{
			String str = itm.getText();
			System.out.println(str);
		}
		
		/*
		 int n = items.size();
		System.out.println(n);
		for(int i=0;i<n ; i++)
		{
			String str = items.get(i).getText();
			System.out.println(str);
		}
		*/
	}

}
