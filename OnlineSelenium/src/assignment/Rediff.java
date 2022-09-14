package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.linkText("Write mail")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'subject')]")).sendKeys("Sumanth");
		WebElement frmaeEle = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(frmaeEle);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello How are you!!");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Sumanth']/..//cite[@title='Select mail']")).click();
		driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
//		driver.findElement(By.xpath("//button[text()='Ok']")).sendKeys(Keys.ENTER);
	}

}
