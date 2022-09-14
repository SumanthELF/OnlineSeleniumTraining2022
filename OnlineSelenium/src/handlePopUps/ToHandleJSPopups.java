package handlePopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleJSPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Sumanth ELF\\ELF Batch .xlsx");
		Alert popup = driver.switchTo().alert();
		String alertMsg = popup.getText();
		System.out.println(alertMsg);
		Thread.sleep(2000);
		popup.dismiss();*/

		/*driver.get("https://licindia.in/");
		try {
			driver.findElement(By.xpath("//a[@title='Agents Portal']")).click();
		}catch(Exception e) {
			driver.findElement(By.xpath("//a[@title='Agents Portal']")).click();
		}
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.dismiss();*/
		
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		Alert popup = driver.switchTo().alert();
//		System.out.println(popup.getText());
//		popup.sendKeys("Sumanth From Test yantra");
//		popup.accept();
	}
}