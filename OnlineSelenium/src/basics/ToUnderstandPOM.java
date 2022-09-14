package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandPOM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		WebElement studyOfficeLink = driver.findElement(By.partialLinkText("Study & Office"));
		studyOfficeLink.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Home Furniture Online']")).click();
		Thread.sleep(5000);
		studyOfficeLink.click();
	}

}
