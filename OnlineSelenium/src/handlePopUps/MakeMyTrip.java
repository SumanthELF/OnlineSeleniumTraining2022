package handlePopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		int year = ldt.getYear();
		String month = ldt.getMonth().name();
		int date = ldt.getDayOfMonth();
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
//		String monthName = ""+month.substring(0, 1)+ month.substring(1, month.length()).toLowerCase();
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	    
//	    driver.get("https://www.makemytrip.com/");
//	    driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
//	    driver.findElement(By.xpath("//label[@for='departure']")).click();
//	    
//	    for(;;) {
//	    	try {
//		    	driver.findElement(By.xpath("//div[text()='"+monthName+" "+year+"']/../..//p[text()='"+date+"']")).click();
//		    	break;
//		    }catch(NoSuchElementException e) {
//		    	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		    }
//	    }
	}

}
