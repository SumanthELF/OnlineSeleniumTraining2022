package handlingDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/user/Desktop/dropDown.html");
		
		WebElement courseList = driver.findElement(By.id("s1"));
		WebElement friutList = driver.findElement(By.id("m1"));

		Select courseListbox = new Select(courseList);
		Select fruitListbox = new Select(friutList);

		System.out.println(courseListbox.isMultiple());
		System.out.println(fruitListbox.isMultiple());

		fruitListbox.selectByVisibleText("Orange");
		fruitListbox.selectByIndex(1);
		fruitListbox.selectByValue("6");		
		
		List<WebElement> optSelected = fruitListbox.getAllSelectedOptions();
		for(WebElement ele : optSelected) {
			System.out.println(ele.getText());
		}
		System.out.println("========================================");
		System.out.println(fruitListbox.getFirstSelectedOption().getText());
		
	}

}
