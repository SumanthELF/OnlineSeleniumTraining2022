package handlePopUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.get("https://www.naukri.com/");
	    driver.findElement(By.id("login_Layer")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sumanthqsp@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Testing@123");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
	    driver.findElement(By.xpath("//div[@class='uploadBtn']")).click();
	    Runtime.getRuntime().exec("./autoItProgram/upload.exe");
	}
}
