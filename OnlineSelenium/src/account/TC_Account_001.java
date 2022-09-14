package account;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import scripts.BaseClass;
/***
 * 
 * @author Sumanth
 *
 */

// priority is applicable for same class only
// depends on method is applicable for same class only

public class TC_Account_001 extends BaseClass{   // test case id

	@Parameters("url")
	@Test(groups= {"smoke","regression","Critical"})
	public void createAccount(@Optional("https://www.selenium.dev/") String baseUrl) {  // test case name
		
		driver.get(baseUrl);
		driver.navigate().back();
	}
}
