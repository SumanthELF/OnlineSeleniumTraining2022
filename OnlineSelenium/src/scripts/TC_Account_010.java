package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Account_010 extends BaseClass {
		
	@Test
	public void createAccount(String [] arr) {
		driver.findElement(By.id("container_reports")).click();
	}		
}
