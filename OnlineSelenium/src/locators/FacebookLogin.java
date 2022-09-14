package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Sairaj");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("matsagar");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
	}

}
