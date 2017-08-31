package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyText {

	public static void main(String[] args) {
		
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://sys1:8080/multi_cloud1/");
		
		String expText = "Login";
		String PageText = driver.getPageSource();	

			boolean b = PageText.contains(expText);
			if(b)
			{
				System.out.println("Text exist");
			}
			else
			{
				System.out.println("Text not exist");
			}		
			
			
	}

}
