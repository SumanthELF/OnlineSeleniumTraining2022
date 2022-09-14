package readingData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateMultipleUsers {
	
	@DataProvider(name="lij",parallel=true)
	public String[][] testData()  throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./resources/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("DemoWebShop");
		int rowNum = dataSheet.getPhysicalNumberOfRows();
		int colNum = dataSheet.getRow(1).getPhysicalNumberOfCells();
		
		System.out.println(rowNum);
		System.out.println(colNum);
		String[][] sarr = new String[colNum][rowNum];
		for(int i=0; i<colNum ;i++) {
			for(int j=0; j<rowNum ; j++) {
				sarr[i][j]= dataSheet.getRow(j).getCell(i).getStringCellValue();
			}
		}
		return sarr;
	}

	@Test(dataProvider="lij")
	public void registerUser(String[] testData) throws EncryptedDocumentException, IOException {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();                        
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+testData[0]+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(testData[1]);
		driver.findElement(By.id("LastName")).sendKeys(testData[2]);
		driver.findElement(By.id("Email")).sendKeys(testData[3]);
		driver.findElement(By.id("Password")).sendKeys(testData[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(testData[5]);
		driver.quit();
		
	}
}
