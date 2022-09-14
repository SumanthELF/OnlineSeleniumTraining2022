package scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practise {

	@BeforeMethod
	public void bm() {
		Reporter.log("from before method",true);
	}
	
	@AfterClass
	public void ac() {
		Reporter.log("from after class",true);
	}
	
	@Test
	public void cloneAccount() {
		Reporter.log("from clone Account method",true);
	}
	
	@AfterMethod
	public void am() {
		Reporter.log("from after method",true);
	}
	
	@BeforeSuite
	public void bs() {
		Reporter.log("from before suite",true);
	}
	@Test
	public void amountTransfer() {
		Reporter.log("from amount Transfer method",true);
	}
	
	@AfterTest
	public void at() {
		Reporter.log("from after test",true);
	}
}
