package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement usernameTextField = driver.findElement(By.id("email"));
		String actualUsernameData = "SumanthOnlineSession";
		usernameTextField.clear();
		usernameTextField.sendKeys(actualUsernameData);
		String usernameEntered = usernameTextField.getAttribute("value");
		System.out.println(usernameEntered);
		if(actualUsernameData.equals(usernameEntered)) {
			System.out.println("Username is entered successfully");
		}
		driver.quit();
			
	}
}
