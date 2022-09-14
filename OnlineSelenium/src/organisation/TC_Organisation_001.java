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
public class TC_Organisation_001 { //TestNG class  // test case id

	@Test(groups= {"smoke","org"})
	public void createAccount() {  //test case  // test case name
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();                        //test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.samsung.com/");
		driver.quit();
	}
}
