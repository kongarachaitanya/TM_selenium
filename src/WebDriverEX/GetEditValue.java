package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetEditValue {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://sys1:8080/multi_cloud1/");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.findElement(By.id("username")).sendKeys("anilchand");
		driver.findElement(By.id("password")).sendKeys("pass1234");
		
		String un = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(un);
	}

}
