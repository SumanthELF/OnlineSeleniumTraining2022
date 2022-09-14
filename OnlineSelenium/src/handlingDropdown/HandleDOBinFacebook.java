package handlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDOBinFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropDown);
		Select monthSelect = new Select(monthDropDown);
		Select yearSelect = new Select(yearDropDown);
		
		System.out.println(daySelect.isMultiple());
		System.out.println(monthSelect.isMultiple());
		System.out.println(yearSelect.isMultiple());
		
		daySelect.selectByIndex(15);
		monthSelect.selectByValue("4");
		yearSelect.selectByVisibleText("2000");
		
	}

}
