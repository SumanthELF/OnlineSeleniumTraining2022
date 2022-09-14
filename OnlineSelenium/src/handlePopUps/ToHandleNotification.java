package handlePopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotification {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.get("https://www.yatra.com/");
//	    Runtime.getRuntime().exec("./autoItProgram/notify.exe");
	    
//	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_TAB);
//	    Thread.sleep(1000);
//	    robot.keyPress(KeyEvent.VK_TAB);
//	    Thread.sleep(1000);
//	    robot.keyPress(KeyEvent.VK_TAB);
//	    Thread.sleep(1000);
//	    robot.keyRelease(KeyEvent.VK_TAB);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    Thread.sleep(1000);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
    
	}

}
