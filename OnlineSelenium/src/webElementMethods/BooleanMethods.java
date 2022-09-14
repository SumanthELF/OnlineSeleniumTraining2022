package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demoapp.skillrary.com/");
//		boolean flag = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
//		System.out.println(flag);
		
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox")); 
		boolean flag = checkbox.isSelected();
		System.out.println(flag);
		Thread.sleep(2000);
		checkbox.click();
		boolean flag1 = checkbox.isSelected();
		System.out.println(flag1);*/
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Log In']"));
		boolean flag = loginButton.isEnabled();
		System.out.println(flag);
		driver.findElement(By.name("username")).sendKeys("Sumanth");
		driver.findElement(By.name("password")).sendKeys("Testing123");
		boolean flag1 = loginButton.isEnabled();
		System.out.println(flag1);
		
	}
}
