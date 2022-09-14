package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Sumanth
 *
 */
public class TC_Login_001 {

	public static void main(String[] args) {  //@Test
		//Expected data
		String expectedLoginPageTitle = "";
		String expectedHomePageTitle = "";
		String usernameData = "admin";
		String passwordData = "manager";
		
		//Pre-condition
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 1: Open the browser and Enter the Url
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed Successfully");
		}else {
			System.out.println("Login page is not displayed");
		}
		
		//Step 2: Enter the username and Password
		WebElement usernasmeTextField = driver.findElement(By.id("username"));
		usernasmeTextField.clear();
		usernasmeTextField.sendKeys(usernameData);
		String usernameDataEntered = usernasmeTextField.getAttribute("value");
		if(usernameData.equals(usernameDataEntered)) {
			System.out.println("Username entered Successfully");
		}else {
			System.out.println("Username is not entered Successfully");
		}
		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		String passwordDataEntered = passwordTextField.getAttribute("value");
		if(passwordData.equals(passwordDataEntered)) {
			System.out.println("Password entered Successfully");
		}else {
			System.out.println("Password is not entered Successfully");
		}
		
		//Step 3: Click on login button
		driver.findElement(By.id("loginButton")).click();
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home page is displayed Successfully");
		}else {
			System.out.println("Home page is not displayed");
		}
		
		//Post-condition
		driver.quit();
	}

}
