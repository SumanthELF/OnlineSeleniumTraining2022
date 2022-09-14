package organisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/***
 * 
 * @author Sumanth
 *
 */
public class TC_Organisation_004 {   // test case id

	@Test
	public void modifyAccount() {  // test case name
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.realme.com/in/");
		driver.quit();
	}
}
