package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {    //BaseTest

	//Expected data
	String expectedLoginPageTitle = "actiTIME - Login";
	String expectedHomePageTitle = "actiTIME - Enter Time-Track";
	String usernameData = "admin";
	String passwordData = "manager";
	public WebDriver driver;
	public WebDriverWait explicitWait;

	@Parameters("browser")
	@BeforeClass
	public void browserSetup(@Optional("chrome")String browserName) {
		//Pre-condition
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 10);
	}

	@BeforeMethod
	public void loginToApp() {

		//Step 1: Open the browser and Enter the Url
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login Page is not displayed");
		Reporter.log("Login page is displayed successfully",true);

		//Step 2: Enter the username and Password
		WebElement usernasmeTextField = driver.findElement(By.id("username"));
		usernasmeTextField.clear();
		usernasmeTextField.sendKeys(usernameData);
		String usernameDataEntered = usernasmeTextField.getAttribute("value");
		Assert.assertEquals(usernameDataEntered, usernameData, "Username is not entered Successfully");
		Reporter.log("Username is entered successfully",true);

		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		String passwordDataEntered = passwordTextField.getAttribute("value");
		Assert.assertEquals(passwordDataEntered, passwordData, "Password is not entered Successfully");
		Reporter.log("Password entered Successfully",true);

		//Step 3: Click on login button
		driver.findElement(By.id("loginButton")).click();
		explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "Home page is not displayed");
		Reporter.log("Password entered Successfully",true);
		Reporter.log("Home page is displayed Successfully",true);
	}

	@AfterMethod
	public void logoutOfApp() {
		//Step : Logout of application
		driver.findElement(By.id("logoutLink")).click();
		String actualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login Page is not displayed");
		Reporter.log("Login page is displayed successfully",true);
	}

	@AfterClass
	public void browserTearDown() {
		//Post-condition
		driver.quit();
	}
}
