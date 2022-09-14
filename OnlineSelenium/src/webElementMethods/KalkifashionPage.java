package webElementMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class KalkifashionPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/kids-wear/kurtas-for-boy.html");
		
	}

}
