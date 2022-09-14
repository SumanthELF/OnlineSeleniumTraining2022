package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RectangleAreaOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		String cssValue = loginButton.getCssValue("height");
		System.out.println(cssValue);
		driver.quit();
	}

}
