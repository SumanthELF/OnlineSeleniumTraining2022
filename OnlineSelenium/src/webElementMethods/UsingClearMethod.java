package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTextField = driver.findElement(By.xpath("//input[@id='username']"));
		usernameTextField.clear();
		Thread.sleep(2000);
		usernameTextField.clear();
		usernameTextField.sendKeys("Pranali");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}

}
