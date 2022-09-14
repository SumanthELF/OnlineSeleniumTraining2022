package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager.html')]")));
		WebElement sorceEle = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement targetEle = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sorceEle, targetEle).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(sorceEle, gallery).perform();
		
	}

}
