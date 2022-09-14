package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expressions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.cssSelector("img[src='https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,h_108/play_ip0jfp']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[src='https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,h_108/iOS_ajgrty']")).click();
		
		String expectedTitleOfThePage = "Swiggy Food & Grocery Delivery - Apps on Google Play";
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String titleOfThePage = driver.getTitle();
			if(expectedTitleOfThePage.equals(titleOfThePage)) {
				break;
			}
		}
		driver.findElement(By.cssSelector("a[href='/store/apps/developer?id=Swiggy']")).click();
	}
}
