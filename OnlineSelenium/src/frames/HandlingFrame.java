package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//a[.='YouTube']")).click();
	}

}
