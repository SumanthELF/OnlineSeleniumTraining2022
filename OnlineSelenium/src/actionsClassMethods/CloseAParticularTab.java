package actionsClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseAParticularTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/gowns.html");
		List<WebElement> navBarElements = driver.findElements(By.xpath("//div[contains(@class,'first-tab-menu')]"));
		Actions actions = new Actions(driver);
		for(WebElement ele : navBarElements) {
			actions.keyDown(Keys.CONTROL).click(ele).perform();
		}
		actions.keyUp(Keys.CONTROL).perform();
	}

}
