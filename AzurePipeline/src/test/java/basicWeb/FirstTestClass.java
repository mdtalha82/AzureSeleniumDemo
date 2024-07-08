package basicWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


public class FirstTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Home Page", title);
		
		driver.quit();
	}

}
