package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeTheScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://www.techmahindra.com/");
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File tempFile = ts.getScreenshotAs(OutputType.FILE);
	    File destFile = new File("./errorshots/screenshot1.png");
	    FileUtils.copyFile(tempFile, destFile);
	    driver.quit();
	}

}
