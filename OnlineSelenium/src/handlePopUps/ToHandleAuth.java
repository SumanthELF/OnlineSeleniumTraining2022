package handlePopUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAuth {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //https://usernmame:password@url
	    
//	    Thread.sleep(2000);
	    
//	    Runtime.getRuntime().exec("./autoItProgram/authPopup.exe"); 
	    
//	    Thread.sleep(2000);
//		Robot robot = new Robot();     // autoIt 
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_D);
//		robot.keyRelease(KeyEvent.VK_D);
//		robot.keyPress(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_M);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_N);		
//		robot.keyRelease(KeyEvent.VK_N);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_D);
//		robot.keyRelease(KeyEvent.VK_D);
//		robot.keyPress(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_M);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_N);		
//		robot.keyRelease(KeyEvent.VK_N);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
