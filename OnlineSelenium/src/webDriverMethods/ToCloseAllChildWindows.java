package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		WebElement d = driver.findElement(By.xpath("//input[@value='Open Food Sites']"))/*.click()*/;
		Thread.sleep(2000);
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		System.out.println(allWindowIds.size());
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}
		
		
	}

}
