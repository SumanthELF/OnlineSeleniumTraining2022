package advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class KalkiFashion {

	@Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.kalkifashion.com/");
		WebElement kalkiFashionLogo = driver.findElement(By.xpath("//img[@alt='Latest Fashion Collection for Men & Women in India']"));
		driver.findElement(By.linkText("KIDS")).click();
		WebElement sortByDropdown = driver.findElement(By.id("sorter"));
		Select sort = new Select(sortByDropdown);
		sort.selectByValue("most_viewed");
		Thread.sleep(3000);
		kalkiFashionLogo.click();
			
	}
}
