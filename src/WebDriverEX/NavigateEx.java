package WebDriverEX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateEx {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		
		d.get("http://sys1:8080/multi_cloud1/");		
		System.out.println(d.getTitle());
		
		d.navigate().to("https://www.google.co.in");
		System.out.println(d.getTitle());
		
		d.navigate().back();
		System.out.println(d.getTitle());
		
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		d.navigate().refresh();	

	}

}
