package WebDriverEX;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String URL="http://flipkart.com/";
		driver.navigate().to(URL);
		
        //we should pass name and value for cookie as parameters             
		Cookie mycookie = new Cookie("mobilenum", "888888888");
		driver.manage().addCookie(mycookie);
		System.out.println(mycookie);
		//delete all cookies
		driver.manage().deleteAllCookies();	
		
		//Display all cookies
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie ck : cookiesList) {
			System.out.println(ck );		
		}
		
	}

}
