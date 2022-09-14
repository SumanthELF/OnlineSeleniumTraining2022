package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApplication {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		Point positionOfWindow = driver.manage().window().getPosition();
		int x = positionOfWindow.getX();
		int y = positionOfWindow.getY();
		System.out.println(x);
		System.out.println(y);
		
		Point targetPosition = new Point(400, 500);
		driver.manage().window().setPosition(targetPosition);
	}

}
