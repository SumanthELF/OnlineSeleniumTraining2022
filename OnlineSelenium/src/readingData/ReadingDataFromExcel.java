package readingData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {

	@Test
	public void readData() throws IOException {
		
		FileInputStream fis = new FileInputStream("./resources/TestData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis); //new HSSFWorkbook( ) or new XSSFWorkbook( )
		
		Sheet sheetObj = workbook.getSheet("Sheet1");
		String cell0 = sheetObj.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cell0);
		String cell1 = sheetObj.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cell1);
		String cell2 = sheetObj.getRow(2).getCell(0).getStringCellValue();
		System.out.println(cell2);
		
		LocalDateTime cell3 = sheetObj.getRow(3).getCell(0).getLocalDateTimeCellValue();
		System.out.println(cell3);
		System.out.println(cell3.getDayOfMonth());
		System.out.println(cell3.getMonth().name());
		System.out.println(cell3.getYear());
		
		boolean cell5 = sheetObj.getRow(5).getCell(0).getBooleanCellValue();
		System.out.println(cell5);
		if(cell5) {
			System.out.println("YEah it is a Boolean value");
		}else {
			System.out.println("bye");
		}
		
		System.out.println(workbook.getSheet("Sheet5").getRow(12).getCell(9).getStringCellValue());
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
//		driver.get(cell0);
		//DataProvider
	}
}
