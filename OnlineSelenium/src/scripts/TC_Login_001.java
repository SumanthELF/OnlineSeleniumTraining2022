package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Login_001 {     // testNg class

	@Test(priority=1,timeOut=5000)
	public void launchZomato() throws InterruptedException {     // test case
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		Thread.sleep(6000);
		Reporter.log("Hi welcome to advanced concepts of Selenium",true);   // test steps
		driver.quit();
	}
	
	@Test(priority=-1, invocationCount=10, threadPoolSize=5) // integers --> +ve and -ve and 0 and final variables 
	public void launchSwiggy() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		Reporter.log("Hi welcome to advanced concepts of Selenium",true);
		driver.quit();
	}
	
	@Test()
	public void launchFoodPanda() {     // test case
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.foodpanda.com/");
		Reporter.log("Hi welcome to advanced concepts of Selenium");   // test steps
		driver.quit();
	}
}
