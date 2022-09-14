package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyElementUsingIDLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("Sairaj");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Pranali");
		Thread.sleep(2000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();
	}

}
