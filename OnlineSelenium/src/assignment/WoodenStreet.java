package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.woodenstreet.com/");
//	    Thread.sleep(12000);
	    driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
	    Actions actions=new Actions(driver);
	    
	    actions.moveToElement(driver.findElement(By.partialLinkText("Study & Office"))).perform();
	    Thread.sleep(2000);
	    actions.click(driver.findElement(By.linkText("Gaming Chairs"))).perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[contains(@id,'article')])[4]/a[@class='targetBlank']")).click();
	    Set<String> allwinId = driver.getWindowHandles();
	    for(String wid : allwinId) {
	    	driver.switchTo().window(wid);
	    }
	   String productCost = driver.findElement(By.id("totPrice")).getText();
	   System.out.println(productCost);
	   String price = "";
	   
	   for(int i=0;i<productCost.length();i++) {
		   if(productCost.charAt(i)>='0' && productCost.charAt(i)<='9') {
			   price = price + productCost.charAt(i);
		   }
	   }
	   System.out.println(price);
	   if(Integer.parseInt(price)>15000) {
		   System.out.println("It is toooo costly");
	   }else {
		   driver.findElement(By.id("button-cart-buy-now")).click();
	   }  
	}

}
