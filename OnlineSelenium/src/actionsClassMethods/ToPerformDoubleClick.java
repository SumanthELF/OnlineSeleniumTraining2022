package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		WebElement plusIcon = driver.findElement(By.id("add"));
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"))).perform();
		actions.contextClick().perform();
		Thread.sleep(2000);
		actions.doubleClick().perform();
		Thread.sleep(2000);
		actions.click().perform();
		
	}

}
