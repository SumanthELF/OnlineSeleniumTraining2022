package handlePopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		int year = ldt.getYear();
		String month = ldt.getMonth().name();
		int date = ldt.getDayOfMonth();
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		String monthName = ""+month.substring(0, 1).toUpperCase() + month.substring(1, month.length()).toLowerCase();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.get("https://www.abhibus.com/");
	    driver.findElement(By.id("datepicker1")).click();
	    for(;;) {
	    	try {
	    		driver.findElement(By.xpath("//span[text()='"+monthName+"']/../../..//a[text()='"+date+"']")).click();
	    		break;
	    	}catch(NoSuchElementException e) {
	    		driver.findElement(By.xpath("//span[text()='Next']")).click();
	    	}
	    }
	}

}
