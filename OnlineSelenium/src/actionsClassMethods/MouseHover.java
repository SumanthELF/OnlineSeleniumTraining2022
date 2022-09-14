package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		driver.switchTo().frame("wiz-iframe-intent");
		driver.findElement(By.xpath("//span[text()='×']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("GOWNS"))).perform();
		driver.findElement(By.linkText("Gowns on Sale")).click();
	}

}
