package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseOfIdentification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Pranali");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sairaj");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	}

}
