package assignment;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

		FlipkartAssign.addToCart(driver, "Lenovo");
		FlipkartAssign.addToCart(driver, "HP");
		FlipkartAssign.addToCart(driver, "acer");
		
		FlipkartAssign.capturePriceFromCart(driver);

	}

	/**
	 * this method is used to add products to cart and switch the control baclk to home page
	 * @param driver pass the driver reference which you have created
	 * @param laptopName specify the product name which you want to add 
	 * @throws InterruptedException
	 */
	public static void addToCart(ChromeDriver driver, String laptopName) throws InterruptedException {
		String basePage = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'" + laptopName + "')]")).click();
		Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(basePage);

		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.switchTo().window(basePage);
	}

	
	public static void capturePriceFromCart(ChromeDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);
		TreeSet<Integer> prices = new TreeSet<>();
		List<WebElement> allProducts = driver
				.findElements(By.xpath("//span[contains(text(),'₹') and @class='_2-ut7f _1WpvJ7']"));
		for (WebElement ele : allProducts) {
			String cost = ele.getText();
			prices.add(Integer.parseInt(cost.replace(",", "").replace("₹", "")));
		}
		for(int p : prices) {
			System.out.println(p);
		}
	}

	
}
